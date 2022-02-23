package com.uni.khh.algorithm;

public class Ex_1 {

	public static void main(String[] args) {
		
		System.out.println(med3(3, 2, 2));
	}
	
	public static int med3(int a, int b, int c) {
		// 중앙값을 구하는 알고리즘
		if(a >= b)
			if(b >= c)
				return b;
			else if(c >= b)
				return c;
			else
				return a;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
}
