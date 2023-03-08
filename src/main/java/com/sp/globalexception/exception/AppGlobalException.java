package com.sp.globalexception.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppGlobalException {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handlingNullPointerException(Model model) {
		
		model.addAttribute("errorMsg", "Please try to after sometime ...work is going on!! ");
		return "error";
	}
	@ExceptionHandler(value=NoBookFoundException.class)
	public String bookNullPointerException(Model model) {
		
		model.addAttribute("bookMsg", "Book id is not Valid ,Pliase confirm to admin!! ");
		return "bookError";
	}
}
