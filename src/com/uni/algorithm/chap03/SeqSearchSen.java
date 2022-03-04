package com.uni.algorithm.chap03;

import java.util.Scanner;
// 선형 검색 알고리즘에 보초를 추가한 알고리즘 : 종료 조건 1개를 없애므로 비용을 줄일 수가 있다.
// 보초 : 검색 전에 검색하고자 하는 키 값을 맨 끝 요소에 저장한다. 이 저장하는 값을 보초라고 함
public class SeqSearchSen {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	static int seqSearch(int[] a, int n, int key) {

		int i = 0;
		
		a[n] = key; // 보초를 추가

		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i; // i의 값이 n이면 보초값이기때문에 -1 반환 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1]; // 요솟수가 num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();

		int idx = seqSearch(x, num, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
	}
}
