package com.uni.algorithm.chap02;

import java.util.Scanner;

public class MaxOfArray {

	public static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i = 1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i < num; i++) {
			System.out.println("height[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		
		System.out.println("가장 큰 값은 : " + maxOf(height));
	}

}
