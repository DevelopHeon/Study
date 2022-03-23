package com.uni.baekjoon.chap06;

public class Main {
	// 셀프넘버란 : n + n = 3 과 같이 각 자리의 숫자(정수)들의 합이 결과값이 아닌 수이다.
	// 말 뜻 이해하기가 어려움 ...
	public static void main(String[] args) {
		// 셀프넘버를 넣을 배열 선언 boolean 타입의 배열로 선언
		boolean[] arr = new boolean[100001];
		
		// 반복문을 통해서 생성자가 있는 (셀프넘버가 아닌 수) 배열에 담는다.
		for(int i=1; i<10001; i++) {
			int n = Self(i);
			if(n < 10001)
				arr[n] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		// 다시 반복문을 통해서 배열의 값이 false 값인, 즉 셀프넘버인 수 출력
		for(int i=1; i<10001; i++) {
			if(arr[i] != true) {
				sb.append(i).append('\n');
			}
		}
		System.out.print(sb);
	}
	
	public static int Self(int n) {
		int total = n;
		while(n != 0) {
			total += (n % 10); // 일의자리
			n /= 10; // 십의자리
		}
		
		return total;
	}
}
