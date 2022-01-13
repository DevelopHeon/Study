package com.uni.khh.chap04.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) { // 1미만의 숫자는 먼저 걸러준다.
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {
//		practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while (true) { // 반복 출력 하기 위해 while문 선언
			System.out.print("1이상의 숫자를 입력하세요.");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요.");
			}else {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				return;
			}
		}
	}

	public void practice3() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("잘못 입력 하셨습니다.");
		}else {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice4() {
//		practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}else {
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
				return;
			}
		}
	}

	public void practice5() {

		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			System.out.print(i);
			sum += i; // i값 계속 더해서 sum에 담아준다.
			if(i < num){ // 부호 붙여주기 위해 if문 선언
				System.out.print(" + ");
			}else if(i == num) { // i가 num과 같으면 for문 종료기때문에 종료시 = 과 sum값 출력
				System.out.println(" = " + sum);
			}
		}
	}
	
	public void practice6() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
//		(for문 이용)
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
	}
	
}
