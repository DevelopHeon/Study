package com.uni.khh.chap08.hw2.run;

import com.uni.khh.chap08.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample a = new NonStaticSample();
		
		int[] arr = a.intArrayAllocation(5);
		
		// 배열 출력
		System.out.print("- 크기가 5인 배열의 랜덤 값 : ");
		a.display(arr);
		// 내림차순 출력
		System.out.print("- 내림차순 출력 : ");
		a.sortDescending(arr);
		// 오름차순 출력
		System.out.print("- 오름차순 출력 : ");
		a.sortAscending(arr);
		//문자열에 포함된 문자 개수 출력
		String str = "apple";
		System.out.println(str + "문자열에 p의 개수 : " + a.countChar(str, 'p'));
		// 두 수 사이의 합 출력
		System.out.println("13과 7 사이의 정수 출력 : " + a.totalValue(13, 7));
		// 문자열에서 인덱스 찾아서 출력
		System.out.println("programming 문자열의 3번 인덱스 문자 : " + a.pCharAt("programming", 3));
		// 두 개의 문자열 합쳐서 출력
		System.out.println("JAVA와 programming을 합친 문자열 : " + a.pConcat("JAVA", "programming"));
	}

}
