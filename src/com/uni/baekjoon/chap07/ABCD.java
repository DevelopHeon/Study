package com.uni.baekjoon.chap07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABCD {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 알파벳 개수 26개 만큼 가지고 있는 배열 -1로 초기화
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String word = br.readLine();
		
		// 입력 받은 단어의 알파벳 위치 위에 배열에 담기
		for(int i=0; i<word.length(); i++) {
			
			char ch = word.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
	}
}
