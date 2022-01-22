package com.uni.khh.chap07.hw2.run;

import com.uni.khh.chap07.hw2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		// 기본 생성자 이용 첫 번째 Book 객체 생성
		Book b1 = new Book();
		
		// 매개변수 생성자 이용 두 번째 Book 객체 생성
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("==================");
		
		//첫 번째 객체 setter를 이용하여 수정 및 출력
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		System.out.println("수정된 결과 확인");
		System.out.println(b1.information());
		System.out.println("==================");

		// 각 객체의 할인율을 적용한 책 가격 계산해서 출력
		// 할인 가격 = 가격 - (가격 * 할인율)
		
		int b1Price = (int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate()));
		int b2Price = (int)(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate()));
		
		System.out.println("도서명 : " + b1.getTitle());
		System.out.println("할인된 가격 : " + b1Price);
		
		System.out.println("도서명 : " + b2.getTitle());
		System.out.println("할인된 가격 : " + b2Price);
	}

}
