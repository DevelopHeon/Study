package com.uni.khh.chap10.hw2.model.vo;

public class Point {
	
	private int x;
	
	private int y;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		
		System.out.println("(x, y) : (" + x + ", " + y + ")");
	}
}
