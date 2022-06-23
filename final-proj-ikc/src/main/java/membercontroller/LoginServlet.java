package membercontroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import members.MembersBean;
import members.MembersService;

@WebServlet(urlPatterns = { "/secure/Login.controller" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MembersService membersService;

	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		ApplicationContext context = (ApplicationContext) application
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		membersService = context.getBean("membersService", MembersService.class);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//接收資料
		String useraccount = request.getParameter("useraccount");
		String userpassword = request.getParameter("userpassword");

//驗證資料
		Map<String, String> errors = new HashMap<String, String>();
		request.setAttribute("errors", errors);
		if (useraccount == null || useraccount.length() == 0) {
			errors.put("useraccount", "Please enter ID for login");
		}
		if (userpassword == null || userpassword.length() == 0) {
			errors.put("userpassword", "Please enter PWD for login");
		}

		if (errors != null && !errors.isEmpty()) {
			request.getRequestDispatcher("/secure/Login.jsp").forward(request, response);
			return;
		}

//呼叫model
		MembersBean bean = membersService.login(useraccount, userpassword);

//根據model執行結果，導向view
		if (bean == null) {
			errors.put("userpassword", "Login failed, please try again.");
			request.getRequestDispatcher("/secure/Login.jsp").forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("user", bean);

			String path = request.getContextPath();
			response.sendRedirect(path + "/Index.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
