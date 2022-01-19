package com.uni.khh.chap05.run;


import com.uni.khh.chap05.array.ArrayPractice;

public class Run {

	public static void main(String[] args) {
	
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			int num = (int)(Math.random() * 100);
			
			arr[i] = num;
			System.out.println(arr[i]);
		}
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			count++;
			if(arr[i] > max) {
				max = arr[i];
				index = count;
			}
		}
		
		System.out.println();
		System.out.println(max);
		System.out.println(index);
	}

}
