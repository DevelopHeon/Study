package com.uni.khh.algorithm;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			
			sum += i;
			
			if(i < n) {
				System.out.print(i + " + ");
			}else if(i == n){
				System.out.println(i +" = " + sum);
			}
		}
	}

}
