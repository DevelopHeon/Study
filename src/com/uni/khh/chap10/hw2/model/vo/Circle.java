package com.uni.khh.chap10.hw2.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		
		double a = Math.PI*radius*radius;
		double b = Math.PI*radius*2;
		
		System.out.println("면적 : " + String.format("%.1f", a));
		System.out.println("둘레 : " + String.format("%.1f", b));
		
	}
	
}
