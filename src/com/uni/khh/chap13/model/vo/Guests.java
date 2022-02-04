package com.uni.khh.chap13.model.vo;

public class Guests {
	
	private String name;
	
	private int age;
	
	private char gender;
	
	private double height;
	
	public Guests() {
		// TODO Auto-generated constructor stub
	}

	public Guests(String name, int age, char gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "이름 : " + name + " 나이 : " + age + " 성별 : " + gender + " 키 : " + height; 
	}
}
