package com.uni.khh.algorithm;

import java.util.Scanner;

public class AlgorithmTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("정수1 입력:");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력:");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력:");
		int num3 = sc.nextInt();
		
	
		System.out.println("중앙값은 " + method1(num1,num2,num3) + "입니다.");
	}
	
	// 중앙값 구하기 알고리즘  연습
	public static int method1(int a, int b, int c) {
		
		if(a >= b) // a가 b보다 크거나 같으면 아래 if문 들어감
			if(b >= c) // b는 c보다 크거나 같다. 즉 b의 값이 중앙값이된다. (a-b-c)
				return b;
			else if(a <= c) // c가 b보다 크고, a가 c보다 크거나 작다 a가 중앙값(위에서 b가 a보다 작거나 같기때문에)
				return a;  // (c-a-b)
			else			
				return c; // c가 a보다 작고 b보다 클경우라서 c가 중앙값 (a-c-b)
		else if(c < a) // b가 a보다 큰 경우, c보다 a가 크면 (b-a-c)
			return a;
		else if(b > c) // c가 a보다 크고 b보다 작다 (b-c-a)
			return c;
		else		   // c가 b보다 큰 경우 (c-b-a)
			return b;
	}
	
	public static void method2() {
		// 최대값 구하기 알고리즘
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = sc.nextInt();
		
		int max = num1;
		
		if(num2 > max)
			max = num2;
		if(num3 > max)
			max = num3;
		
		System.out.println("최대값 : " + max);
	}
	
	public void method3() {
		// 가우스 덧셈을 이용하여 홀수일 경우와 짝수일 경우 1부터 n까지의 숫자 합 구하기
		// for문은 사용 하지 않고 풀어보기
		
		int n = 100;
		int sum = 0;
		
		if(n % 2 == 0) {
			sum = (1+n) * n/2;
			System.out.println(sum);
		}else {
			sum = n + ((n-1)*n)/2;
			System.out.println(sum);
		}
	}
}
