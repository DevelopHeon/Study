package com.uni.khh.chap08.mvc.view;

import java.util.Scanner;

import com.uni.khh.chap08.mvc.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public MemberView() {} // 기본 생성자
	
	public void mainMenu() {
		
		System.out.print("아이디 입력하시오 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력하시오 : ");
		String pwd = sc.nextLine();
		
		// 입력받은 아이디, 비밀번호 값을
		// MemberController 클래스의 login 메소드에 전달하고
		// 그 결과값을 result변수에 받는다
		int result = mc.login(id, pwd);
		
		// 성공적으로 로그인 했을경우 => 즉 result 변수가 1일경우 출력
		
		if(result == 1) {
			
			while(true) {
				
				System.out.println("====== 회원프로그램 ======");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램을 종료하기");
				System.out.print("메뉴 번호 선택 : ");
				int menu = sc.nextInt();
				
				switch(menu) {
				case 1:
					System.out.println(mc.readInfo().information()); // MemberController의 readInfo() 호출
					break;
				case 2:
					System.out.println(mc.readAge()); // MemberController의 readAge() 호출
					break;
				case 3:
					updateHeight();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
					
				}
			}
		}
	}

	public void updateHeight() {
//		“수정할 키를 입력하시오 : “ >> 입력 받음 (height : double)
		// 입력 받은 키 값을
		// MemberController 클래스의 updateHeight() 메소드에 전달
		
		System.out.print("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		
		mc.updateHeight(height);
		
	}
}
