package com.uni.khh.chap03.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		while (true) {

			System.out.println("1. 입력 : ");
			System.out.println("2. 수정 : ");
			System.out.println("3. 조회 : ");
			System.out.println("4. 삭제 : ");
			System.out.println("9. 종료 : ");
			System.out.print("메뉴 번호를 입력하세요. ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 9:
				System.out.println("프로그램이 종료됩니다.");
				return;
			}
		}
	}

	public void practice2() {

		while (true) {
			System.out.print("숫자 한 개를 입력하세요 : ");
			int num = sc.nextInt();

			if (num % 2 == 0 && num > 0)
				System.out.println("짝수다.");
			else if (num == 9)
				return;
			else
				System.out.println("양수만 입력해주세요.");

		}
	}

	public void practice3() {

		System.out.print("국어 점수 : ");
		int kng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		int sum = kng + eng + math;
		double avg = sum / 3;

		if (kng > 40 && eng > 40 && math > 40 && avg > 60) {
			System.out.println("국어 : " + kng);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("축하합니다, 합격입니다 ! ");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {

//		if(month == 1 || month == 2 || month == 12) {
//			season = "겨울";
//			} else if(month >= 3 && month <= 5) {
//			season = "봄";
//			} else if(month >= 6 && month <= 8) {
//			season = "여름";
//			} else if(month >= 9 && month <= 11) {
//			season = "가을";
//			} else {
//			season = "해당하는 계절이 없습니다.";
//			}

		System.out.print("1~12 사이의 정수 입력 : ");
		int season = sc.nextInt();

		switch (season) {
		case 1:
		case 2:
		case 12:
			System.out.println(season + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(season + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(season + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(season + "월은 가을입니다.");
			break;
		default:
			System.out.println("잘못된 입력값 입니다.");
		}
	}

	public void practice5() {
		String id = "user1";
		String pw = "1234";

		System.out.print("아이디 : ");
		String input = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pass = sc.nextLine();

		if (id.equals(input) && pw.equals(pass)) {
			System.out.println("로그인 성공");
		} else if (id.equals(input) && !(pw.equals(pass))) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (!(id.equals(input)) && pw.equals(pass)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
		}
	}

	public void practice6() {

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String member = sc.nextLine();

		if (member.equals("관리자")) {
			System.out.println("회원관리, 게시글관리, 게시글 작성, 댓글 작성, 게시글 조회");
		} else if (member.equals("회원")) {
			System.out.println("게시글작성, 게시글 조회, 댓글 작성");
		} else if (member.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

	public void practice7() {

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력 해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.printf("BMI 지수 : %.2f \n", bmi);

		String result = bmi < 18.5 ? "저체중"
				: (18.5 <= bmi && bmi < 23) ? "정상체중"
						: (23 <= bmi && bmi < 25) ? "과체중" : (25 <= bmi && bmi < 30) ? "비만" : "고도비만";
		System.out.println(result);
	}

	public void practice8() {

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.next().charAt(0);

		if (!(num1 > 0 && num2 > 0))
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		else if (ch == '+')
			System.out.printf("%d %c %d = %d", num1, ch, num2, num1 + num2);
		else if (ch == '-')
			System.out.printf("%d %c %d = %d", num1, ch, num2, num1 - num2);
		else if (ch == '*')
			System.out.printf("%d %c %d = %d", num1, ch, num2, num1 * num2);
		else if (ch == '/')
			System.out.printf("%d %c %d = %d", num1, ch, num2, num1 / num2);
		else if (ch == '%')
			System.out.printf("%d %c %d = %d", num1, ch, num2, num1 % num2);
		else
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
	}

	public void practice9() {
		// 중간 20 , 기말 30, 과제 30, 출석 20
		// 출석은 20회 중에서 출석한 날만 입력
		// 총점 70 이상 출석 70 이상만 합격
		System.out.print("중간 고사 점수 : ");
		int mScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int lScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		int ass = sc.nextInt();
		System.out.print("출석 회수 : ");
		int check = sc.nextInt();

		double m = mScore * 0.2;
		System.out.println("중간 고사 점수(20) : " + m);

		double l = lScore * 0.3;
		System.out.println("기말 고사 점수(30) : " + l);

		double assNum = ass * 0.3;
		System.out.println("과제 점수(30) : " + assNum);
		System.out.println("출석 점수(20) : " + check);

		double result = m + l + assNum + check;
		System.out.println("총점 : " + result);

		if (result >= 70 && check >= 14)
			System.out.println("PASS");
		else if (result >= 70 && check < 14)
			System.out.println("FAIL [출석 횟수 부족](" + check + "/20)");
		else if (result < 70 && check >= 14)
			System.out.println("FAIL [점수 미달](총점 " + result + ")");
		else {
			System.out.println("FAIL [출석 횟수 부족](" + check + "/20)");
			System.out.println("FAIL [점수 미달](총점 " + result + ")");
		}
	}

	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택 : ");
		int menu = sc.nextInt();
		
		sc.nextLine();
		
		switch(menu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
			
		}
		
	}
	
	
}
