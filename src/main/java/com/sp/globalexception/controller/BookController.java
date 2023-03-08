package com.sp.globalexception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sp.globalexception.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	 private BookService  bookService;
	//http://localhost:5050/showBook?bookId=B101
	@RequestMapping("/showBook")
	public String getBookByPriceId(@RequestParam("bookId") String bookId,Model model ) {
		double bookPrice =bookService.findPriceById(bookId);
		model.addAttribute("price", "Book Price::"+bookPrice);
		
		return "display";
		
	}

}
