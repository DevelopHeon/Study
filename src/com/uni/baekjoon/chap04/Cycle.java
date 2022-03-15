package com.uni.baekjoon.chap04;

import java.util.Scanner;

public class Cycle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int copy = num;
		int count = 0;
		
		while(true) {
			num = ((num%10) * 10) + (((num/10) + (num%10)) % 10);
			count++;
			
			System.out.println(num);
			if(num == copy) {
				break;
			}
		}
		System.out.println(count);
	}
}
