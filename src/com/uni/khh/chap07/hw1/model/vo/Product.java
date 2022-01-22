package com.uni.khh.chap07.hw1.model.vo;

public class Product {
	
	private String productId; //상품 아이디
	
	private String productName; //상품명
	
	private String productArea; //생산지
	
	private int price; // 가격
	
	private double tax; //부가세비율
	
	public Product() {}

	public Product(String productId, String productName, String productArea, int price, double tax) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
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

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String information() {
		
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}

}
