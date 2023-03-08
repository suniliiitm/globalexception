package com.sp.globalexception.exception;

public class NoBookFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9187159831692703416L;
	
	public NoBookFoundException(String msg) {
		super(msg);
	}

}
