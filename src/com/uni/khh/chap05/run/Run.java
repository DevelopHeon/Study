package com.uni.khh.chap05.run;

import java.util.Arrays;

import com.uni.khh.chap05.array.ArrayPractice;

public class Run {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}
		System.out.println(Arrays.toString(counter));
		
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*"); // counter[i]의 값 만큼 ‘*’을 찍는다.
			}
			System.out.println();
		}
	} // end of main

}
