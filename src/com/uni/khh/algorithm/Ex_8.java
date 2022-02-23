package com.uni.khh.algorithm;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = (n + 1) * (n/2) + (n % 2 == 1 ? (n/2 + 1) : 0);
		
		System.out.println(sum);
	}

}
