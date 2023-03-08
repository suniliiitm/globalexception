package com.sp.globalexception.exception;

public class ProductNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7396972221685546952L;
	
	
		public ProductNotFoundException(String msg) {
			super(msg);
		}
}
