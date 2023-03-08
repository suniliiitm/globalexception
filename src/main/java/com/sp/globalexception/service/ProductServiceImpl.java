package com.sp.globalexception.service;

import org.springframework.stereotype.Service;

import com.sp.globalexception.exception.ProductNotFoundException;
import com.sp.globalexception.model.Product;


@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public Product productFindBbyId(Integer productId) {
		if(productId == 101) {
			return new Product("101","Laptop",4590);
		}else {
			//throw custom exception
			throw new ProductNotFoundException("Product id is invalid please contact to admin");
		}
		
	}

}
