package com.uni.baekjoon.chap02;

import java.util.Scanner;
// 전자오븐
public class Koi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int minute2 = sc.nextInt();
		
		if(minute + minute2 >= 60) {
			hour += (minute + minute2)/60;
			if(hour == 24) {
				hour = 0;
			}else if(hour > 24) {
				hour = hour - 24;
			}
			minute = (minute + minute2)%60;
			System.out.println(hour + " " + minute);
		}else {
			System.out.println(hour + " " + (minute + minute2));
		}
	}

}
