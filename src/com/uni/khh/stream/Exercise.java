package com.uni.khh.stream;

import java.util.stream.Stream;

public class Exercise {

	public static void main(String[] args) {
		// 14 - 5 많은 복습이 필요할듯....
		String[] strArr = { "aaa", "bb" , "c" , "dddd" };
		Stream<String> sArr = Stream.of(strArr);
		
		//String::length
		int sum = sArr.mapToInt((s) -> s.length()).sum();
		
		System.out.println("sum = " + sum);
	}

}
