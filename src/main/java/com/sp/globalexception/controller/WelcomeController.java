package com.sp.globalexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/show")
	public String showWelcome(Model model) {
		
		model.addAttribute("msg", "welcome to java world");
		
		String name=null;
		name.length();
		return "welcome";
	} 
	//by using @ExceptionHandler only for Welcome Controller
	/*
	 * @ExceptionHandler(value=NullPointerException.class) public String
	 * handleNullPointerException(Model model) {
	 * 
	 * model.addAttribute("errorMsg",
	 * "Please Try to Aftr some times because mentinance is going on...!!"); return
	 * "error"; }
	 */
	
}
