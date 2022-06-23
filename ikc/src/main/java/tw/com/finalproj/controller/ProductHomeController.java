package tw.com.finalproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.com.finalproj.dao.ProductHomeRepositor;
import tw.com.finalproj.service.ProductHomeService;
import tw.com.finalproj.service.domain.ProductBean;

@Controller
public class ProductHomeController {
	
	@Autowired
	private ProductHomeService productHomeService;
	
	 @RequestMapping(path = { "/pages/productHomeSelect" })
	 public String SearchFoodData(Model model ) {
	  // 接收資料
	  // 驗證資料

		 System.out.println("123");
	   List<ProductBean> bean = productHomeService.select();
	   System.err.println(bean);
	   if (bean != null && bean.size() != 0) {

	    model.addAttribute("select", bean);
	   }
	  

	  return "/pages/productHome";

	 }	
	
	
	
	
	
	
	
	
	
}