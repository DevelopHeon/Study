package com.uni.khh.chap11.controller;

import com.uni.khh.chap11.model.vo.AniBook;
import com.uni.khh.chap11.model.vo.Book;
import com.uni.khh.chap11.model.vo.CookBook;
import com.uni.khh.chap11.model.vo.Member;

public class LibraryManager {

	private Member mem = null;
	
	private Book[] bList = new Book[5];
	
	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		}

	public void insertMember(Member m) {
		// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입

		mem = m;
		
	}

	public Member myinfo() {
		
		return mem;
	}

	public Book[] selectAll() {

		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당

		Book[] book = new Book[5];
		
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면  HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기  HINT : count 이용
		int count = 0;
		
		for(Book b : bList) {
			if(b.getTitle().contains(keyword)) {
				book[count++] = b;
			}
		}
		return book;
	}

	public int rentBook(int num) {
		
		int result = 0;
		
		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화  나이 제한으로 대여 불가하다는 의미
		
		Book b = bList[num]; // Book 객체 만들어서 변수에 도서를 담아주고
		
		if(b instanceof AniBook) { // instanceof 연산자 통해서 형변환 가능한지 확인
			if(((AniBook) b).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}else if(b instanceof CookBook) {
			// 전달 받은 index의 bList 객체가 실제 CookBook 객체를 참조하고 있고
			// 해당 요리책의 쿠폰유무가 “true”일 경우
			// 회원의 couponCount 1 증가 처리 후
			// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰이 발급됐다는 의미

			if(((CookBook) b).getCoupon() == true) {
				
				mem.setCouponCount(mem.getCouponCount()+1);
				
				result = 2;
			}
		}
		
		return result;
	}

}
