package com.uni.khh.chap03.run;

import java.util.Arrays;
import java.util.Scanner;

import com.uni.khh.chap03.practice.ConditionPractice;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ConditionPractice c = new ConditionPractice();
//		c.practice10();
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = sc.nextInt();

		System.out.println("중앙값 : " + method1(num1, num2, num3));
	}
	
	public static int method1(int a, int b, int c) {
		
		if(a >= b) // a가 제일 앞
			if(b >= c) // (a-b-c) b가 중앙값
				return b;
			else if(c <= a) // (a-c-b) c가 중앙값
				return c;
			else
				return a;
		else if(a > c) // a가 b보다 작은경우
			return a;
		else if(c > b) // a가 b보다 작은경우
			return b;
		else
			return c;
	}
}
