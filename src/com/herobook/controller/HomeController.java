package com.herobook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showLoginPage() {
		return "home/login-page";
	}
	
	@RequestMapping("/signup")
	public String showSignUpPage() {
		return "home/signup-page";
	}

}
