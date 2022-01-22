package com.uni.khh.chap07.hw1.run;

import com.uni.khh.chap07.hw1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// 예시 이용해서 기본 값으로 객체 생성
		Product p = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		Product p1 = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product p2 = new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		// 객체들 출력
		System.out.println(p.information());
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		// 부가세와 상품의 가격들 전부 변경
		p.setPrice(1200000);
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		
		p.setTax(0.05);
		p1.setTax(0.05);
		p2.setTax(0.05);
		
		// 변경 후 잘 바뀌었는지 확인 위해 출력
		System.out.println("==================");
		System.out.println(p.information());
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		// 상품의 실제 가격 계산 = 가격 + 가격 * 부가세
		int pPrice = p.getPrice() + (int)(p.getPrice() * p.getTax());
		int p1Price = p1.getPrice() + (int)(p1.getPrice() * p1.getTax());
		int p2Price = p2.getPrice() + (int)(p2.getPrice() * p2.getTax());
		
		System.out.println("상품명 : " + p.getProductName());
		System.out.println("부가세  포함 가격 : " + pPrice);

		System.out.println("상품명 : " + p1.getProductName());
		System.out.println("부가세  포함 가격 : " + p1Price);

		System.out.println("상품명 : " + p2.getProductName());
		System.out.println("부가세  포함 가격 : "+ p2Price);

	}

}
