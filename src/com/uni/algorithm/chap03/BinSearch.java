package com.uni.algorithm.chap03;

import java.util.Scanner;

public class BinSearch {

	//요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2; //중앙 요소의 인덱스
			if(a[pc] == key)
				return pc; // 검색 성공
			else if(a[pc] < key)
				pl = pc + 1; // 검색 범위 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색 범위 앞쪽 절반으로 좁힘
		}while(pl <= pr);
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : "); // 첫 요소 입력
		arr[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("arr[" + i + "]: ");
				arr[i] = sc.nextInt();
			}while(arr[i] < arr[i-1]); // 바로 앞의 요소보다 작으면 다시 입력, while문 종료되면서
		}
		
		System.out.print("검색할 값 : "); // key 값 입력
		int key = sc.nextInt();
		
		int idx = binSearch(arr, num, key); // 배열 arr에서 키 값이 key 인 요소 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소는 없습니다.");
		else
			System.out.println(key + "은(는) arr[" + idx + "]에 있습니다.");
	}

}
