package com.uni.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// BufferedReader 사용법
public class add {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 숫자형으로 변환해줘야하기때문에 반복문 출력후 담아줄 토큰 선언
		StringTokenizer st;
		
		// br을 통해 숫자 입력받고
		int t = Integer.parseInt(br.readLine());
		// 입력받은 횟수만큼 반복문 실행
		for(int i=0; i<t; i++) {
			// 미리 선언한 토큰 변수에 scanner 처럼 입력받아서 하나씩 받고
			st = new StringTokenizer(br.readLine());
			// 출력, 스트링형식이기때문에 토큰 하나 하나 숫자형으로 변환
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
		bw.close();
	}
}
