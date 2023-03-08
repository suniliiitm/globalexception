package com.sp.globalexception.service;

import org.springframework.stereotype.Service;

import com.sp.globalexception.exception.NoBookFoundException;


@Service
public class BookServiceimpl implements BookService {

	@Override
	public double findPriceById(String bookId)  throws NoBookFoundException {
		if(bookId.equals("B101") ) {
		return 450.00;
	}else {
		 throw new NoBookFoundException("Book id are not available here !!");
		}
		
	}

}
