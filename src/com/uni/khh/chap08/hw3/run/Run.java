package com.uni.khh.chap08.hw3.run;

import com.uni.khh.chap08.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {

		StaticSample.setValue("Java");
		
		System.out.println("value : " + StaticSample.getValue());
		StaticSample.toUpper();
		
		System.out.println("대문자로 : " + StaticSample.getValue());
		
		System.out.println("길이 : " + StaticSample.valueLength());
		
		StaticSample.valueConcat("PROGRAMMING");
		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));
		
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : " + StaticSample.getValue());
	}

}
