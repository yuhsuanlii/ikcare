package membercontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import members.BodyInformationBean;
import members.BodyInformationService;
import members.DietBean;
import members.DietService;
//import members.DietBean;
//import members.DietService;
import members.MemberSportBean;
import members.MemberSportService;
import members.SleepingBean;
import members.SleepingService;

@WebServlet(urlPatterns = { "/pages/MemberInformation.controller" })
public class MemberInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BodyInformationService bodyInformationService;
	private DietService dietService;
	private SleepingService sleepingService;
	private MemberSportService memberSportService;

	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		ApplicationContext context = (ApplicationContext) application
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		bodyInformationService = context.getBean("bodyInformationService", BodyInformationService.class);
		dietService = context.getBean("dietService", DietService.class);
		sleepingService = context.getBean("sleepingService", SleepingService.class);
		memberSportService = context.getBean("memberSportService", MemberSportService.class);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//呼叫Model
		BodyInformationBean bodyInformationbean = new BodyInformationBean();
		DietBean dietbean = new DietBean();
		SleepingBean sleepingBean = new SleepingBean();
		MemberSportBean memberSportBean = new MemberSportBean();

//根據Model執行結果導向View
		List<BodyInformationBean> bodyInformation = bodyInformationService.select(bodyInformationbean);
		System.out.println(bodyInformationbean);
		System.out.println(bodyInformation);

		List<DietBean> diet = dietService.select(dietbean);
		System.out.println(dietbean);
		System.out.println(diet);
//
		List<SleepingBean> sleeping = sleepingService.select(sleepingBean);
		System.out.println(sleepingBean);
		System.out.println(sleeping);
//
		List<MemberSportBean> memberSport = memberSportService.select(memberSportBean);
		System.out.println(memberSportBean);
		System.out.println(memberSport);

		request.setAttribute("bodyInformation", bodyInformation);
		request.setAttribute("diet", diet);
		request.setAttribute("sleeping", sleeping);
		request.setAttribute("memberSport", memberSport);
		request.getRequestDispatcher("/pages/MemberInformation.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
