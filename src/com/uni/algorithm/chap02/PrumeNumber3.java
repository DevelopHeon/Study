package com.uni.algorithm.chap02;

public class PrumeNumber3 {
	public static void main(String[] args) {
		int counter = 0; // 곱셈과 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500];
		
		prime[ptr++] = 2; // 2는 소수임
		prime[ptr++] = 3; // 3도 소수임
		
		for(int n = 5; n <= 1000; n+=2) { // 대상은 홀수만
			boolean flag = false;
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if(n % prime[i] == 0) { // 나누어 떨어지면 소수가 아님
					flag = true;
					break;  // 더이상의 반복은 불필요
				}
			}
			
			if(!flag) { // 마지막까지 나누어 떨어지지 않을경우 소수, 배열에 저장
				prime[ptr++] = n;
				counter++;
			}
			
			for(int i=0; i< ptr; i++) { //찾은 ptr개의 소수를 출력
				System.out.println(prime[i]);
			}
			System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
		}
	}
}
