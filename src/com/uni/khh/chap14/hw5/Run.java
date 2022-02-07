package com.uni.khh.chap14.hw5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		
		NumberOk no = new NumberOk();
		Scanner sc = new Scanner(System.in);
		
		// NumberOk 객체를 이용하여 메소드 실행
		
		no.numGame();
		
		// String의 equalsIgnoreCase() 메소드로 계속하는지 판단하는 y,n입력값 판단하기

		while(true) {
			
			
			System.out.print("계속 하시겠습니까 ? (y/n)");
			String ch = sc.nextLine();
			
			if(ch.equalsIgnoreCase("N")) {
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("새로운 게임을 시작합니다 !!");
				no.numGame();
			}
		}
		
	}

}
