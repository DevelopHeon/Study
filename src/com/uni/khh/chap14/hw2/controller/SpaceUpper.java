package com.uni.khh.chap14.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {}
	
	private Scanner sc = new Scanner(System.in);
	
	public void spaceToUpper() {
		// 영문을 입력 받는다.
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를
		// 구성
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서
		// StringBuilder에 담아 출력
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String input = sc.nextLine();
		
		System.out.println(input);
		
		StringTokenizer st = new StringTokenizer(input, " ");
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		
		while(st.hasMoreTokens()) {
			
			// 첫 글자 제외 나머지 소문자 변환
			str = st.nextToken().toLowerCase();
			// 첫글자만 대문자로 변환
			char ch = str.toUpperCase().charAt(0);
			
			// StringBuilder에 valueOf() 메소드로 char을 String으로 변환해서 담아준다.
			sb = new StringBuilder(String.valueOf(ch));
			sb.append(str);
			sb.delete(1, 2);
			
			System.out.print(sb + " ");
		}
	}
	
}
