package com.uni.baekjoon.chap06;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Test tc = new Test();
		
		System.out.println(tc.sum(arr));
	}
	
	public long sum(int[] a) {
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		
		return sum;
	}
}
