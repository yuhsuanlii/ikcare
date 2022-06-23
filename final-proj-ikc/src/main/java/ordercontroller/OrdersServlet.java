package ordercontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

import orders.OrdersBean;
import orders.OrdersService;

@WebServlet(urlPatterns = "/pages/OrdersServlet.controller")
public class OrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
	private OrdersService ordersService;

	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		ApplicationContext context = (ApplicationContext) application
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		ordersService = context.getBean("ordersService", OrdersService.class);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接收資料
		String temp1 = request.getParameter("orderID");
		String userAccount = request.getParameter("userAccount");
		String temp2 = request.getParameter("orderTime");
		String temp3 = request.getParameter("orderEndTime");
		String temp4 = request.getParameter("orderAdress");
		String temp5 = request.getParameter("orderArea");
		String temp6 = request.getParameter("orderStatus");
		String temp7 = request.getParameter("payment");
		String temp8 = request.getParameter("delivery");
		String prodaction = request.getParameter("prodaction");

		// 驗證資料
		Map<String, String> errors = new HashMap<String, String>();
		request.setAttribute("errors", errors);

		if (prodaction != null) {
			if (prodaction.equals("Insert") || prodaction.equals("編輯") || prodaction.equals("刪除")) {
				if (temp1 == null || temp1.length() == 0) {
					errors.put("id", "Please enter Id for " + prodaction);
				}
			}
		}
		// 轉換資料
//		int id = 0;
//		if (temp1 != null && temp1.length() != 0) {
//			try {
//				id = Integer.parseInt(temp1);
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				errors.put("id", "Id must be an integer");
//			}
//		}
//		double price = 0;
//		if (temp2 != null && temp2.length() != 0) {
//			try {
//				price = Double.parseDouble(temp2);
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				errors.put("price", "Price must be a number");
//			}
//		}
//		java.util.Date make = null;
//		if (temp3 != null && temp3.length() != 0) {
//			try {
//				make = sFormat.parse(temp3);
//			} catch (ParseException e) {
//				e.printStackTrace();
//				errors.put("make", "Make must be a date of YYYY-MM-DD");
//			}
//		}
//		int expire = 0;
//		if (temp4 != null && temp4.length() != 0) {
//			try {
//				expire = Integer.parseInt(temp4);
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				errors.put("expire", "Expire must be an integer");
//			}
//		}
//
//		if (errors != null && !errors.isEmpty()) {
//			request.getRequestDispatcher("/pages/product.jsp").forward(request, response);
//			return;
//		}
//
//		// 呼叫Model
		
		OrdersBean bean = new OrdersBean();
		bean.setOrderID(0);
//		bean.setUserAccount("");
//		bean.setOrderTime(null);
//		bean.setOrderEndTime(null);
//		bean.setOrderAdress("");
//		bean.setOrderArea("");
//		bean.setOrderStatus("");
//		bean.setPayment("");
//		bean.setDelivery("");
		System.out.println(bean.toString());
		if(prodaction!=null && prodaction.equals("Select")) {
			List<OrdersBean> result = ordersService.select(bean);
			request.setAttribute("select", result);
			for(OrdersBean x:result) {
				System.out.println(x);
			}
			System.out.println("[servlet]"+result);
			request.getRequestDispatcher(
					"/pages/OrdersDisplay.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
