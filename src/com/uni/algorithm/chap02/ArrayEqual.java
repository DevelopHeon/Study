package com.uni.algorithm.chap02;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("배열 arr의 요소수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("배열 arr2의 요소수 : ");
		int num2 = sc.nextInt();
		
		int[] arr2 = new int[num2];
		
		for(int i=0; i<num2; i++) {
			System.out.print("arr2["+i+"] : ");
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("배열 arr 과 arr2는 " + (equals(arr, arr2)
				? "같습니다.":"같지 않습니다."));
	}
}
