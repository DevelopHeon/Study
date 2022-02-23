package com.uni.algorithm.chap02;

import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
//		배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void reverse(int[] a) {
		// 인덱스 i번째 요소와 길이-i-1의 요소 자리 바꿈 //역순정렬
		for(int i=0; i< a.length / 2; i++) {
			swap(a,i ,a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num]; // 요소수가 num인 배열
		
		for(int i=0; i<num; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		reverse(arr); // 배열 arr의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬 했습니다.");
		for(int i = 0; i<num; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

}
