package com.uni.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String str = String.valueOf(result);
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
		
		for(int v : arr) {
			System.out.println(v);
		}
	}
}
