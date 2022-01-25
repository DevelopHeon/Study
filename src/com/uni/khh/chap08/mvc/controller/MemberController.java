package com.uni.khh.chap08.mvc.controller;

import com.uni.khh.chap08.mvc.model.vo.Member;

public class MemberController {

	Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	
	public MemberController() {}
	
	public int login(String id, String pwd) {
		// 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때
		// 모두 같으면 1을 리턴
		// 아니면 0을 리턴
		
		int num = 0;
		
		if(id.equals(mem.getMemberId()) && pwd.equals(mem.getMemberPwd())) {
			num = 1;
		}
		
		return num;
	}
	
	public Member readInfo() {
		
		return mem;
	}

	public void updateHeight(double height) {
		// 전달 받은 height값으로 mem의 height값 수정

		mem.setHeight(height);
	}

	public int readAge() {
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		// HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴
		
		// 주민번호 앞 2자리 추출
		int no = Integer.parseInt(mem.getCitizenNo().substring(0, 2));
		
		int age = 0;
		
		if(no > 22) { // 22보다 크다면 1900년대생
			age = 2022 - (1900 + no) + 1;
		}else { // 작다면 2000년대생
			age = 2022 - (2000 + no) + 1;
		}
		
		return age;
	}
}
