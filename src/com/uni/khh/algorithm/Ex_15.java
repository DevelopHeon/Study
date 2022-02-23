package com.uni.khh.algorithm;

public class Ex_15 {

	public static void main(String[] args) {
		triangleRB(4);
	}

	public static void triangleLB(int n) {
		// 왼쪽 아래 직각 이등변 삼각형 출력
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleUB(int n) {
		// 왼쪽 위가 직각인 이등변 삼각형
		
		for(int i= 0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int n) {
		// 오른쪽 위가 직각인 이등변 삼각형
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void triangleRB(int n) {
		// 오른쪽 아래가 직각인 이등변 삼각형
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= n-i; j++) { // 공백 찍기 위한 for문 n이 4라면 4-1 첫줄 3번 공백, 4-2 2번째 줄 2번 공백
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
