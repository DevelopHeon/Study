package com.uni.algorithm.chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

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
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		int num = rand.nextInt(10);
//		int num = (int)(Math.random()*10 + 1);
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i=0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("가장 큰 값은 : " + maxOf(height));
	}

}
