package com.uni.khh.chap10.hw2.model.vo;

public class Rectangle extends Point{

	private int width;
	
	private int height;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		super.draw();
		
		int a = width * height;
		int b = 2 * (width + height);
		
		System.out.println("면적 : " + a);
		System.out.println("둘레 : " + b);
	}
}
