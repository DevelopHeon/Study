package com.uni.khh.chap14.hw1.view;

import java.util.Scanner;

import com.uni.khh.chap14.hw1.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		do {
			
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				tokenMenu();
			}else if(menu == 2) {
				inputMenu();
			}else if(menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 입력값 다시 입력 하세요.");
			}
			
		}while(true);
	}

	public void inputMenu() {
		// 입력 받은 문자열을 TestController의 firstCap()의 인자로 보내 반환 값 출력
		// 찾을 문자 입력 받아 TestController의 findChar()의 매개변수로 아까 입력 받은
		// 문자열과 문자 하나를 매개변수로 보내 반환 값 출력

		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		String capstr = tc.firstCap(input);
		
		System.out.println("첫 글자 대문자 : " + capstr);
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		int num = tc.findChar(input, ch);
		
		System.out.println(ch + "문자가 들어간 개수 : " + num);
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		// Token 처리 전 글자와 글자 개수를 출력하고
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력

		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String str2 = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : " + str2);
		System.out.println("토큰 처리 후 개수 : " + str2.length());
	}
}
