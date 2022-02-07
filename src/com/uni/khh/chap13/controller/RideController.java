package com.uni.khh.chap13.controller;

import com.uni.khh.chap13.model.vo.Guests;
import com.uni.khh.chap13.model.vo.RollerCoaster;

public class RideController {
	
	public RideController() {
		// TODO Auto-generated constructor stub
	}
	
	public void cutGuests() {
		// 4명의 탑승 대기자를 생성자를 통한 Guest객체 배열 초기화 (Guests[] gs)
		
		Guests[] gs = new Guests[4];
		{
			gs[0] = new Guests("홍길동", 17, 'M', 120.2);
			gs[1] = new Guests("유관순", 20, 'F', 102.3);
			gs[2] = new Guests("김유신", 23, 'M', 110.4);
			gs[3] = new Guests("김흥부", 21, 'M', 112.5);
		}
		
		// RollerCoaster 클래스의 허용인원 상수값 크기의 또 다른 객체 배열 생성
		// (Guests[] onBoard)
		Guests[] onBoard = new Guests[RollerCoaster.PERMINUMBER];
		int count = 0; // count 선언해서 나중에 출력할때 써먹어야됨
		
		try {
			// for문과 if문을 통해 RollerCoaster 클래스의 허용키 상수값 크기
			// 이상인 사람을 Guests객체 배열 onBoard에 담는다.
			
			for(int i=0; i<gs.length; i++) {
				if(gs[i].getHeight() > RollerCoaster.CUTHEIGHT) {
					onBoard[count++] = gs[i];
				}
			}
		}catch (ArrayIndexOutOfBoundsException e){// 배열 크기를 넘어가면 발생되는 예외클래스 참조형 변수 e를 받는 매개변수 자리
			// 문제가 발생한 해당 배열의 인덱스 번호가 몇번에서 발생하는지
			// Throwable클래스의 getMessage()메소드를 통해 출력
						
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " + 
			e.getMessage().charAt(e.getMessage().length()-1)); // 내가 뽑고자 하는 값은 2이다.
			// 그러므로 e.getMessage()를 호출했을때 나오는 문장에서 2의 자리에 있는 값만 뽑아 와 준다.
			
		}finally {
			// "인원이 가득 찼습니다. 다음 차례를 기다리세요"
			// "이번 차례 탑승 명단"
			// 탑승자 각각의 이름, 키를 출력하고 두 탑승자의 요금합계를 출력 하시오
			
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승 명단");
			
			for(int i=0; i<count-1; i++) {
				System.out.println("탑승자 이름 : " + onBoard[i].getName() + ", 키 : " + onBoard[i].getHeight());
			}
			
			int price = RollerCoaster.PRICE * onBoard.length;
			System.out.println("탑승자 요금 : " + price);
			// 요금같은 경우 상수로 지정해 놓은 금액 * 탑승인원수 값으로 구해준다.
		}
		
	}
	
}
