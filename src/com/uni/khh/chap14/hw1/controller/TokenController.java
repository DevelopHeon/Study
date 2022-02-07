package com.uni.khh.chap14.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		
		// Tokenizer를 통해 공백을 제거 한 글자들을 담아준다.
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String afterst = "";
		
		// 값이 있다면 true 없다면 false 반복문 실행
		while(st.hasMoreElements()) {
			afterst += st.nextToken();
		}
		
		return afterst;
	}
	
	public String firstCap(String input) {
		
		// substring 이용 0,1 가장 앞글자 대문자 + 인덱스1번째부터 +로 붙여서 출력
		return input.substring(0, 1).toUpperCase() + input.substring(1);
		
	}
	
	public int findChar(String input, char one) {
		
		int count = 0; // 개수를 담아줄 변수 선언
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) { // 문자열 charat() 메소드로 하나씩 비교
				count++;
			}
		}

		return count;
	}
}
