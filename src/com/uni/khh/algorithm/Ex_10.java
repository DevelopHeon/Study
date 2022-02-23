package com.uni.khh.algorithm;

import java.util.Scanner;

public class Ex_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		int b = 0;
		
		do {
		System.out.print("b의 값 : ");
		b = sc.nextInt();
		if(a >= b) {
			System.out.println("a보다 큰 값을 입력하세요 !");
		}
		
		}while(a >= b);
		
		System.out.printf("b-a는 %d 입니다.", b-a);
	}
}
