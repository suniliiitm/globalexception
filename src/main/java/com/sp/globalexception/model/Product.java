package com.sp.globalexception.model;

public class Product{
	
	private String productId;
	
	private String productName;
	
	 private double productPrice;
	 public Product() {
		 
	 }
	 

	public Product(String productId, String productName, double productPrice) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	 
	
	 

}
