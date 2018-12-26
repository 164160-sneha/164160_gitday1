package com.spring.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String printHello(ModelMap model) {
			model.addAttribute("message", "Hello Spring MVC Framework!");
			return "helloworld";
		}
	}


