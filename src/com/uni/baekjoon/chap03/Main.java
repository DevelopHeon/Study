package com.uni.baekjoon.chap03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		int[] arr = new int[cnt];
		int a = 0;
		int b = 0;
		
		for(int i=0; i<cnt; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(arr[i]);
		}
	}
}
