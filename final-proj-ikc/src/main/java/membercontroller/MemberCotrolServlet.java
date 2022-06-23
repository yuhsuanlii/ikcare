package membercontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import members.MembersBean;
import members.MembersService;

@WebServlet(urlPatterns = { "/pages/MemberControl.controller" })
public class MemberCotrolServlet extends HttpServlet {
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

//呼叫Model
		MembersBean bean = new MembersBean();


//根據Model執行結果導向View
			List<MembersBean> result = membersService.select(bean);
			System.out.println(bean);
			System.out.println(result);

			request.setAttribute("memberSheet", result);
			request.getRequestDispatcher("/pages/MemberControl.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
