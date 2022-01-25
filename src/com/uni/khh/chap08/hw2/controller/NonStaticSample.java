package com.uni.khh.chap08.hw2.controller;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴

		int[] arr = new int[length]; //배열 할당
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1); // 1~100 사이의 값으로 기록
		}
		
		return arr;
	}
	
	public void display(int[] arr) {
		// 전달받은 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		// 전달받은 배열의 각각의 인덱스 값을 교환
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		for(int i=0; i<arr.length; i++) { // for문 이용 내림차순 정렬
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		display(arr);
	}
	
	public void sortAscending(int[] arr) {
		// 위의 swqp 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		display(arr);
	}
	
	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		
		int count = 0; // 문자 개수 세기위한 변수 선언
		
		for(int i=0; i<str.length(); i++) {
			if(c == str.charAt(i)) { // 같은 문자 일 경우 count 값 1씩 증가
				count++;
			}
		}
		
		return count; 
	}
	
	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		
		int sum = 0; // 합계 담아주기 위한 변수 선언
		
		// 둘 중 뭐가 더 큰 값인지 모르므로 Math클래스의 max와 min 메소드 이용
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i = min+1; i<max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		char ch = ' '; // 문자 담아주기 위한 변수 선언
		
		for(int i=0; i<str.length(); i++) { // for문 통해서 문자열에서 같은 문자 ch에 담아주기
			if(i == index) {
				ch = str.charAt(i);
			}
		}
		
		return ch;
	}
	
	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		String sumStr = str1 + str2;
		
		return sumStr;
	}
}
