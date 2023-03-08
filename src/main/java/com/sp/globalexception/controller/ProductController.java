package com.sp.globalexception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp.globalexception.model.Product;
import com.sp.globalexception.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	//http://localhost:5050/getProduct?productId=102
	//http://localhost:5050/getProduct?productId=101
	@GetMapping(value="/getProduct" , produces = {"application/json"})
	public Product getBookByPriceId(@RequestParam("productId") String productId,Model model ) {
		return productService.productFindBbyId(Integer.valueOf(productId));
		
		
	}

}
