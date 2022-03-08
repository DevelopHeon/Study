package com.uni.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1; i<=t; i++) {
			System.out.println(i);
		}
	}

}
