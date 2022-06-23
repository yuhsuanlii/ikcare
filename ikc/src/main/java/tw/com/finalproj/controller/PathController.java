package tw.com.finalproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	@RequestMapping(path = {"/"})
	public String handlerMethod1() {
		return "/index";
	}
	@RequestMapping(path = "/secure/ec_p3_login")
	public String handlerMethod2() {
		
		return "/secure/ec_p3_login";
	}
	@RequestMapping(path= {"/pages/dietRecord"})
	public String dietpath() {
		return"/pages/dietRecord";
	}
	@RequestMapping(path = {"/pages/productHome"})
	public String productHomePage() {
		
		return"/pages/productHome";
	}
	@RequestMapping(path = {"/pages/productPage"})
	public String productPage() {
		
		return"/pages/productPage";
	}
	@RequestMapping(path = {"/pages/productCheckoutV1"})
	public String productCheckoutV1() {
		
		return"/pages/productCheckoutV1";
	}
	@RequestMapping(path = {"/pages/productCheckoutV2"})
	public String productCheckoutV2() {
		
		return"/pages/productCheckoutV2";
	}
}
