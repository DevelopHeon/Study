package com.uni.baekjoon.chap07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ascii {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		int sum = 0;
		// 문자열을 입력 받을때 쉽게 자릿값 반환 받기위해 getBytes() 메소드 사용
		// 문자열에 대하여 하나의 byte 배열로 변환 해주는 메소드이다.
		for(byte val : br.readLine().getBytes()) {
			sum += (val - '0'); // 인코딩에 맞게 문자의 값으르 저장하므로 반드시 '0' or 48을 빼주어야 제대로 된 값 반환
		}
		System.out.println(sum);
	}
}
