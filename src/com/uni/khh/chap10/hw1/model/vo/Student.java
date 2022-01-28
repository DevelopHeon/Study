package com.uni.khh.chap10.hw1.model.vo;

public class Student extends Person{
	
	private int grade;
	
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		return name + " " + super.information() + " " + grade + " " + major;
	}
}
