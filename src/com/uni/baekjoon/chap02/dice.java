package com.uni.baekjoon.chap02;

import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int money = 0;
		
		if(a == b && b == c) {
			money = 10000 + (a * 1000);
		}else if((a == b && b != c)) {
			money = 1000 + (a * 100);
		}else if((b == c && a != c)) {
			money = 1000 + (b * 100);
		}else if((a == c && a != b)) {
			money = 1000 + (c * 100);
		}else {
			money = Math.max(Math.max(a, b), c)*100;
		}
		
		System.out.println(money);
	}

}
