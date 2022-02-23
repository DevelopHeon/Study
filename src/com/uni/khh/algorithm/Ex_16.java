package com.uni.khh.algorithm;

public class Ex_16 {
	public static void main(String[] args) {
		npira(4);
	
	}

	public static void spira(int n) {
	// 피라미드 출력 i 행에는 (i=1) * 2 + 1 개의 *이 출력되게
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<(i-1)*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void npira(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<(i-1)*2+1; k++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
