package com.uni.khh.algorithm;

import java.util.Scanner;

public class Ex_11 {
	public static void main(String[] args) {
		//양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하시오.");
		int num = sc.nextInt();
		
		// Math. 클래스 이용하는 방법
//		int length = (int)(Math.log10(num)+1);
//		System.out.printf("그 수는 %d 자리입니다.", length);
		
		// String 타입으로 변환 후 길이 출력
		String length = String.valueOf(num);
		System.out.printf("그 수는 %s 자리입니다.", length.length());
	}
}