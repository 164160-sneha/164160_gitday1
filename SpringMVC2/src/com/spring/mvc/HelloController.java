package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	// @RequestMapping(method = RequestMethod.GET)public String
	// printHello(ModelMap model) {
	// model.addAttribute("message", "Hello Spring MVC Framework!");
	// return "hello";
	// }

	@RequestMapping("/welcome")
	public String hello() {
		return "HelloPage";

	}
}
