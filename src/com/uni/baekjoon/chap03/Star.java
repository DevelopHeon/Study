package com.uni.baekjoon.chap03;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i=1; i<=cnt; i++) {
			for(int j=1; j<=cnt; j++) {
				if(i >= j) {
					System.out.print("*");
				}
				System.out.print("");
			}
			System.out.println();
		}
	}
}
