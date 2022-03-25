package com.uni.baekjoon.chap07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 백준 1157번
		Scanner sc = new Scanner(System.in);
		// 알파벳 A ~ Z 개수만큼 배열 선언
		int[] arr = new int[26];
		
		String S = sc.nextLine().toUpperCase();
		// 입력받은 단어 길이만큼 반복문 실행
		// int형 변수에 알파벳 하나하나 위치값 구해서
		// 선언해놓은 배열에 같은 값 나올때마다 그 위치의 값 1씩 증가
		for(int i=0; i<S.length(); i++) {
			int num = S.charAt(i) - 'A';
			arr[num]++;
		}
		
		// 가장 많이 사용된 단어 출력해야되므로 max라는 변수 선언
		// 결과 출력 위해 char형 변수 선언
		int max = 0;
		char result = ' ';
		
		// 배열만큼 반복문 실행
		// if문으로 배열의 위치값하고 max 값 비교한 뒤 가장 많이 출력된 자리의 값을 max에 담는다.
		// max 값 자리의 수 + 'A' or '65'를 해주면 그 자리의 대문자 알파벳이 나옴
		// 만약 arr배열 위치의 값과 max값이 같다면 사용된 알파벳 개수가 같은게 있다는 소리이므로 ? 출력
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i + 'A');
			}else if(arr[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
	}

}
