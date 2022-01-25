package com.uni.khh.chap08.hw1.run;

import com.uni.khh.chap08.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample a = new NonStaticSample();
		
		a.printLottoNumbers();
		a.outputChar(5, 'c');
		System.out.println("랜덤 영문자 출력 : " + a.alphabette());
		System.out.println(a.mySubstring("Hello", 2, 4));
	}


}
