package com.uni.khh.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_7 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}
				);
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream); // 스트림으로 된다. String 타입으로 합쳐진 스트림이 안됨
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
//		strStrmStrm
		
		strStrm.map(String::toLowerCase) // 스트림의 요소를 모두 소문자로 변경
		.distinct() // 중복제거
		.sorted() // 정렬
		.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Belive or not It is true",
				"Do or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) // String 배열이 됨, 정규식 (하나 이상의 공백)
			.map(String::toLowerCase) // 소문자로 변환
			.distinct() // 중복제거
			.sorted() // 정렬
			.forEach(System.out::println);
		System.out.println();
		
	}

}
