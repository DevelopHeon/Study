package com.uni.baekjoon.chap01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b/10%10));
		System.out.println(a*(b/100));
		
		int A = a*(b%10);
		int B = a*(b/10%10) * 10;
		int C = a*(b/100) * 100;
		
		System.out.println(A+B+C);
	}
}
