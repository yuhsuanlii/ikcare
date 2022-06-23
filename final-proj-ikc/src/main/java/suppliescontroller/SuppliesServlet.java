package suppliescontroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import supplies.SuppliesBean;
import supplies.SuppliesService;

@WebServlet(urlPatterns = { "/pages/SuppliesControl.controller" })
public class SuppliesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
	private SuppliesService  suppliesService;

	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		ApplicationContext context = (ApplicationContext) application
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		suppliesService = context.getBean("suppliesService", SuppliesService.class);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//接收資料
		String temp0 = request.getParameter("suppliesid");
		String temp1 = request.getParameter("suppliesname");
		String temp2 = request.getParameter("contactperson");
		String temp3 = request.getParameter("position");
		String temp4 = request.getParameter("suppliesphone");
		String temp5 = request.getParameter("fax");
		String temp6 = request.getParameter("suppliesadress");
		String temp7 = request.getParameter("suppliesarea");
		String prodaction = request.getParameter("prodaction");
	
		

//驗證資料
		Map<String, String> errors = new HashMap<String, String>();
		request.setAttribute("errors", errors);
		if(prodaction!=null) {
			if(prodaction.equals("Insert") || prodaction.equals("Update") || prodaction.equals("Delete")) {
				if(temp1==null || temp1.length()==0) {
					errors.put("id", "Please enter Id for "+prodaction);
				}
			}
		}
		
		short suppliesid=0;
		if(temp0!=null && temp0.length()!=0) {
			try {
				suppliesid = Short.parseShort(temp0);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("suppliesid", "please must be an suppliesid");
			}
		}
		
		
		
		String suppliesname = null;
		if(temp1!=null && temp1.length()!=0) {
			try {
				suppliesname = temp1;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("suppliesname", "please must be an suppliesname");
			}
		}
		String contactperson = null;
		if(temp2!=null && temp2.length()!=0) {
			try {
				contactperson = temp2;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("contactperson", "please must be an contactperson");
			}
		}
		String position = null;
		if(temp3!=null && temp3.length()!=0) {
			try {
				position = temp3;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("position", "please must be an position");
			}
		}
		String suppliesphone = null;
		if(temp4!=null && temp4.length()!=0) {
			try {
				suppliesphone = temp4;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("suppliesphone", "please must be an suppliesphone");
			}
		}
		String fax = null;
		if(temp5!=null && temp5.length()!=0) {
			try {
				fax = temp5;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("fax", "please must be an fax");
			}
		}
		String suppliesadress = null;
		if(temp6!=null && temp6.length()!=0) {
			try {
				suppliesadress = temp6;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("suppliesadress", "please must be an suppliesadress");
			}
		}
		String suppliesarea = null;
		if(temp7!=null && temp7.length()!=0) {
			try {
				suppliesarea = temp7;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("suppliesarea", "please must be an suppliesarea");
			}
		}
		if (errors != null && !errors.isEmpty()) {
			request.getRequestDispatcher("/pages/SuppliesControl.jsp").forward(request, response);
			return;
		}

//呼叫model
		SuppliesBean bean = new SuppliesBean();
		bean.setSuppliesid(suppliesid);
		bean.setSuppliesname(suppliesname);
		bean.setContactperson(contactperson);
		bean.setPosition(position);
		bean.setSuppliesphone(suppliesphone);
		bean.setFax(fax);
		bean.setSuppliesadress(suppliesadress);
		bean.setSuppliesarea(suppliesarea);
		
		System.out.println(prodaction);
	
//根據model執行結果，導向view
		if(prodaction!=null && prodaction.equals("Select")) {
			List<SuppliesBean> result = suppliesService.select(bean);
			request.setAttribute("select", result);
			request.getRequestDispatcher(
					"/pages/SuppliesDisplay.jsp").forward(request, response);
		} else if(prodaction!=null && prodaction.equals("Insert")) {
			System.out.println("[servlet]I'm insert?");
			SuppliesBean result = suppliesService.insert(bean);
			if(result==null) {
				errors.put("action", "Insert fail");
			} else {
				System.out.println("[servlet]Servlet have result : " + result);
				request.setAttribute("insert", result);
			}
			request.getRequestDispatcher(
					"/pages/SuppliesControl.jsp").forward(request, response);
		} else if(prodaction!=null && prodaction.equals("Update")) {
			System.out.println("測試一");
			SuppliesBean result = suppliesService.update(bean);
			System.out.println("測試終點"+result);
			if(result==null) {
				errors.put("action", "Update fail");
			} else {
				request.setAttribute("update", result);
			}
			request.getRequestDispatcher(
					"/pages/SuppliesControl.jsp").forward(request, response);
		} else if(prodaction!=null && prodaction.equals("Delete")) {
			boolean result = suppliesService.delete(bean);
			if(!result) {
				request.setAttribute("delete", 0);
			} else {
				request.setAttribute("delete", 1);
			}
			request.getRequestDispatcher(
					"/pages/SuppliesControl.jsp").forward(request, response);
		} else  {
			errors.put("action", "Unknown Action:"+prodaction);
			request.getRequestDispatcher(
					"/pages/SuppliesControl.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
