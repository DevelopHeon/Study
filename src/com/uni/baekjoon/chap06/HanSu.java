package com.uni.baekjoon.chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanSu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(count(num));
	}
	
	public static int count(int n) {
		// 100보다 작은 수는 모두 한수이다
		// 그러므로 99이하의 숫자를 입력 받으면 그냥 n 리턴
		if(n < 100) {
			return n;
		// 3자리 수부터는 한수를 구해주어야 한다.
		}else {
			int count = 99;
			if(n == 1000) { // 문제에서 1000이 최대 값이라고 했으므로  만약 1000을 입력받으면 어차피 1000은 한수가 아니므로
							// -1인 999로 바꿔준다.
				n = 999;
			}
			
			// 반복문을 통해 백 십 일의 자리 구해주고
			for(int i=100; i<=n; i++) {
				int a = i / 100; // 백의 자리
				int b = (i / 10) % 10; // 십의 자리
				int c = i % 10; // 일의 자리
			// 각 자리수 별로 등차수열이어야 한수이기 떄문에
			// 백의자리 수 - 십의자리 수 = 십의자리 수 - 일의자리 수 (자리수의 차의 값이 같으면 등차수열)
				if(a - b == b - c) {
					count ++;
				}
			}
			return count;
		}
	}
}
