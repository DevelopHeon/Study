package com.uni.khh.chap08.hw3.controller;

public class StaticSample {

	private static String value;
	
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
		
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		char[] cArr = new char[value.length()]; // char 배열 value 길이만큼 선언
		
		for(int i=0; i<cArr.length; i++) { // char 문자 배열에 하나씩 나눠서 담아준다.
			cArr[i] = value.charAt(i);
		}
		
		for(int i=0; i<cArr.length; i++) {
			if(cArr[i] >= 'a' && cArr[i] <= 'z') { // 만약 소문자일 경우
				cArr[i] = (char)(cArr[i]-32); //대문자로 변경 -32해주면 된다.
			}
		}
		
		value = String.valueOf(cArr);
		
		//toUpperCase() 쓰면 끝이다. 만든사람 짱
	}
	
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드

		char[] cArr = value.toCharArray(); // char 배열에 value 하나씩 나눠서 담아준다
		
		cArr[index] = c;
		
		value = String.valueOf(cArr); // 문자 배열 String 형으로 바꿔준다.
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		
		return value.length(); 
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		
		return value + str;
	}
}
