package com.uni.khh.algorithm;

public class Ex_9 {

	public static void main(String[] args) {
		System.out.println(sumof(11, 0));
	}

	public static int sumof(int a, int b) {
		
		int sum = 0;
		
		if(a >= b) {
			for(int i=b; i<=a; i++) {
				sum += i;
			}
		}else {
			for(int i=a; i<=b; i++) {
				sum += i;
			}
		}
		
		return sum;
	}
}
