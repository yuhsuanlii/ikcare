package productscontroller;

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

import products.ProductService;
import products.ProductsBean;

@WebServlet(
		urlPatterns={"/pages/Product.controller"}		
)
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
	private ProductService productService;
	@Override
	public void init() throws ServletException {
//		productService = new ProductService();
		ServletContext application = this.getServletContext();
		ApplicationContext context = (ApplicationContext) application.getAttribute(
				WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		productService = context.getBean("productService", ProductService.class);
	}
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//接收資料
		
		String temp1 = request.getParameter("productname");
		short suppliesid = 0;
		Integer prouductid = 0;
		String temp2 = request.getParameter("standardcost");
		String temp3 = request.getParameter("productstock");
		String temp4 = request.getParameter("productdescribe");
		String temp5 = request.getParameter("productstatus");
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
		
//轉換資料
		
		
		String productname = null;
		if(temp2!=null && temp2.length()!=0) {
			try {
				productname = temp1;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("price", "Price must be a number");				
			}
		}
//		java.util.Date make = null;
//		if(temp3!=null && temp3.length()!=0) {
//			try {
//				make = sFormat.parse(temp3);
//			} catch (ParseException e) {
//				e.printStackTrace();
//				errors.put("make", "Make must be a date of YYYY-MM-DD");
//			}
//		}
		Integer standardcost = 0;
		if(temp2!=null && temp2.length()!=0) {
			try {
				standardcost = Integer.parseInt(temp2);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("expire", "Expire must be an integer");
			}
		}
		Integer productstock = 0;
		if(temp3!=null && temp3.length()!=0) {
			try {
				productstock = Integer.parseInt(temp3);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("expire", "Expire must be an integer");
			}
		}
		String productdescribe = null;
		if(temp4!=null && temp4.length()!=0) {
			try {
				productdescribe = temp4;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("expire", "Expire must be an integer");
			}
		}
		String productstatus = null;
		if(temp5!=null && temp5.length()!=0) {
			try {
				productstatus = temp5;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				errors.put("expire", "Expire must be an integer");
			}
		}
		if(errors!=null && !errors.isEmpty()) {
			request.getRequestDispatcher(
					"/pages/Product.jsp").forward(request, response);
			return;
		}

//呼叫Model
		ProductsBean bean = new ProductsBean();

		
		bean.setProductid(prouductid);
		bean.setProductname(productname);
		bean.setSuppliesid(suppliesid);
		bean.setStandardcost(standardcost);
		bean.setProductstock(productstock);
		bean.setProductdescribe(productdescribe);
		bean.setProductstatus(productstatus);
		
		System.out.println(bean);
		
		
		
//根據Model執行結果導向View
		
		if(prodaction!=null && prodaction.equals("Select")) {
			
			List<ProductsBean> result = productService.select(bean);
			request.setAttribute("select", result);
			request.getRequestDispatcher(
					"/pages/display.jsp").forward(request, response);
			
		} else if(prodaction!=null && prodaction.equals("Insert")) {
			System.out.println("[servlet]I'm insert?");
			ProductsBean result = productService.insert(bean);
		
			if(result==null) {
				errors.put("action", "Insert fail");
			} else {
				System.out.println("[servlet]Servlet have result : " + result);
				request.setAttribute("insert", result);
			}
			
			request.getRequestDispatcher(
					"/pages/Product.jsp").forward(request, response);
		} else if(prodaction!=null && prodaction.equals("Update")) {
			ProductsBean result = productService.update(bean);
			if(result==null) {
				errors.put("action", "Update fail");
			} else {
				request.setAttribute("update", result);
			}
			request.getRequestDispatcher(
					"/pages/Product.jsp").forward(request, response);
		} else if(prodaction!=null && prodaction.equals("Delete")) {
			
			boolean result = productService.delete(bean);
			System.out.println( "dddddddddddddddddd");
			if(!result) {
				request.setAttribute("delete", 0);
			} else {
				request.setAttribute("delete", 1);
			}
			request.getRequestDispatcher(
					"/pages/Product.jsp").forward(request, response);
		} else  {
			errors.put("action", "Unknown Action:"+prodaction);
			request.getRequestDispatcher(
					"/pages/Product.jsp").forward(request, response);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
