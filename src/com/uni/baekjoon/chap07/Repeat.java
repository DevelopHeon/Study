package com.uni.baekjoon.chap07;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			
			int n = sc.nextInt();
			String word = sc.next();
			
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<n; k++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
