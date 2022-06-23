package membercontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
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

@WebServlet(urlPatterns = { "/secure/SignIn.controller" })
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
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
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String address = request.getParameter("address");
		String telephone = request.getParameter("telephone");
		String cellphone = request.getParameter("cellphone");
		String email = request.getParameter("email");
		String area = request.getParameter("area");
		String gender = request.getParameter("gender");
		String signin = request.getParameter("signin");
		
		String userlevel = "管理員";

//驗證資料
		Map<String, String> errors = new HashMap<String, String>();
		request.setAttribute("errors", errors);
		if (useraccount == null || useraccount.length() == 0) {
			errors.put("useraccount", "Please enter ID for signin");
		}
		if (userpassword == null || userpassword.length() == 0) {
			errors.put("userpassword", "Please enter PWD for signin");
		}
		if (name == null || name.length() == 0) {
			errors.put("name", "Please enter name for signin");
		}
		java.util.Date birth = null;
		if (birthday == null || birthday.length() == 0) {
			errors.put("birthday", "Please enter birthday for signin");
		} else if (birthday != null && birthday.length() != 0) {
			try {
				birth = sFormat.parse(birthday);
			} catch (Exception e) {
				e.printStackTrace();
				errors.put("birthday", "birthday must be a date of YYYY-MM-DD");
			}
		}
		if (address == null || address.length() == 0) {
			errors.put("address", "Please enter address for signin");
		}
		if (telephone == null || telephone.length() == 0) {
			errors.put("telephone", "Please enter telephone for signin");
		}
		if (cellphone == null || cellphone.length() == 0) {
			errors.put("cellphone", "Please enter cellphone for signin");
		}
		if (email == null || email.length() == 0) {
			errors.put("email", "Please enter email for signin");
		}
		if (area == null || area.length() == 0) {
			errors.put("area", "Please enter area for signin");
		}
		if (gender == null || gender.length() == 0) {
			errors.put("gender", "Please enter gender for signin");
		}

		if (errors != null && !errors.isEmpty()) {
			request.getRequestDispatcher("/secure/SignIn.jsp").forward(request, response);
			return;
		}

//呼叫model
		MembersBean bean = new MembersBean();
		bean.setUseraccount(useraccount);
		bean.setUserpassword(userpassword);
		bean.setMembername(name);
		bean.setBirthday(birth);
		bean.setAddress(address);
		bean.setTelephone(telephone);
		bean.setCellphone(cellphone);
		bean.setEmail(email);
		bean.setArea(area);
		bean.setGender(gender);
		
		bean.setUserlevel(userlevel);
//根據model執行結果，導向view
		if (signin != null) {
			MembersBean result = membersService.insert(bean);
			if (result == null) {
				errors.put("action", "Insert fail");
			} else {
				request.setAttribute("insert", result);
			}
			request.getRequestDispatcher("/secure/SignIn.jsp").forward(request, response);
		} else {
			errors.put("action", "Unknown Action:" + signin);
			request.getRequestDispatcher("/secure/SignIn.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
