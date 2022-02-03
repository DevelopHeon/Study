package com.uni.khh.chap09.mvc.controller;

import com.uni.khh.chap09.mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10; // 최대 회원 수 상수 필드 10 초기화

	private int memberCount; // 현재 회원 수 필드

	private Member[] mem = new Member[SIZE]; // 회원들의 정보 담는 객체 배열

	// 초기화 블럭 이용 기본회원 5명 정보 초기화, memberCount 수 5 초기화
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {

		return memberCount;
	}

	public Member[] getMem() {

		return mem;
	}

	public Member checkId(String id) {
		Member m = null; // 아이디로 검색된 결과를 담을 변수 초기화
		// mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		// m 리턴

		for (int i = 0; i < memberCount; i++) { // for문 돌려서 같은 ID가 저장되어 있는지 확인해본다.
			if (mem[i].getUserId().equals(id)) {
				m = mem[i];
			}
		}

		return m;

	}

	public void insertMember(Member m) {

		// 매개변수로 전달받은 회원객체를 mem 배열에 추가
		// memberCount 1 증가
		mem[memberCount++] = m; // memberCount가 5니까 후위증가형으로 1증가해주고, 담아준다.
	}

	public Member searchMember(int menu, String search) {

		Member searchMember = null; // 검색된 회원 정보 담을 변수 초기화

		// 매개변수로 전달받은 search 문자열을 menu 번호에 따라
		for (int i = 0; i < memberCount; i++) {
			// 전달받은 메뉴 번호가 1인 경우 아이디로 검색
			if (menu == 1) {
				if (mem[i].getUserId().equals(search)) { // 해당 순차적으로 접근한 객체의 아이디와 검색어와 비교
					searchMember = mem[i];
				}
			} else if (menu == 2) { // 전달받은 메뉴 번호가 2인 경우 이름으로 검색
				if (mem[i].getName().equals(search)) { // 해당 순차적으로 접근한 객체의 이름과 검색어와 비교
					searchMember = mem[i];
				}
			} else { // 전달받은 메뉴 번호가 3인 경우 이메일로 검색

				if (mem[i].getEmail().equals(search)) { // 해당 순차적으로 접근한 객체의 이메일과 검색어와 비교
					searchMember = mem[i];
				}
			}
		}
		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {
		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
		// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
		// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경

		if (menu == 1) {
			m.setUserPwd(update);
		} else if (menu == 2) {
			m.setName(update);
		} else if (menu == 3) {
			m.setEmail(update);
		} else {
			System.out.println("잘못된 메뉴 번호 입니다.");
		}

	}

	public void deleteMember(String userId) {
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오

		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {

				if (i == memberCount - 1) {
					mem[i] = null; // 마지막 회원이면 땡겨줄 필요 없으니까 그냥 삭제하면 된다.
				} else { // 여기가 문제 ㅡㅡ

					// 뒤에 있는 놈들 한칸씩 땡겨주기위한 작업
					for (int j = i; j < memberCount - 1; j++) { // 살짝 이해가 안된다 ?
						mem[j] = mem[j + 1];
					}
//					mem[memberCount - 1] = null;
				}

				memberCount--;
				break;
			}
		}
	}

	public Member[] sortIdAsc() {
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)
		Member[] copy;
		copy = mem.clone();

		// copy 배열을 아이디 별 오름차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용
		// copy 주소 값 리턴

		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {

				if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		return copy;
	}

	public Member[] sortIdDesc() {

		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {

				if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}

	public Member[] sortAgeAsc() {
		// 위와 동일한 방식이지만 나이별 오름차순 정렬 후 주소 값 리턴
		// (숫자 비교이기 때문에 compareTo 사용X)

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[j] = temp;
				}
			}
		}

		return copy;
	}

	public Member[] sortAgeDesc() {

		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		return copy;
	}

	public Member[] sortGenderDesc() {

		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {

				if (copy[i].getGender() - copy[j].getGender() > 0) { // j가 더 클경우 j==M
					Member temp = copy[i]; // i에 j의 값인 M을 넣어준다
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
}
