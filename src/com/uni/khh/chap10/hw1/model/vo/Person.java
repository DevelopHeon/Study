package com.uni.khh.chap10.hw1.model.vo;

public class Person {
	
	protected String name;
	
	private int age;
	
	private double height;
	
	private double weight;
	
	public Person() {}

	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		
		return name + " " + age + " " + height + " " + weight;
	}
	
}
