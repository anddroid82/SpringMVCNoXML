package com.andro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String home(){
		System.out.println("homecontroller");
		return "home";
	}
}
