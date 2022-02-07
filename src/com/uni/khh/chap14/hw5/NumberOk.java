package com.uni.khh.chap14.hw5;

import java.util.Scanner;

public class NumberOk {

	private int ran;
	
	private Scanner sc = new Scanner(System.in);
	
	public NumberOk() {}

	public void numGame() {

		int result = (int)(Math.random()*100)+1;
		int count = 0;
		
		do {
			
			count++;
			
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num > result) {
				System.out.println(num + "보다 작습니다." + count + "번째 실패 !!");
			}else if(num < result) {
				System.out.println(num + "보다 큽니다." + count + "번째 실패 !!");
			}else {
				System.out.println(count + "번 만에 맞췄습니다!");
				break;
			}
				
		}while(true);
		
	}
}
