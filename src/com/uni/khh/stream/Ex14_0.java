package com.uni.khh.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); // list를 Stream으로 변환 ( 정확히는 Stream 생성)
//		intStream.forEach(System.out::print); // forEach() 최종연산
//		
//		//stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		intStream = list.stream(); // list로부터 Stream을 생성
//		intStream.forEach(System.out::print);
		
		String[] strArr = new String [] {"a","b","c","d"};
		
//		Stream<String> strStream = Stream.of(new String [] {"a","b","c","d"});
		Stream<String> strStream = Arrays.stream(strArr); // 위랑 같은 방법
		strStream.forEach(System.out::println);
		
		int[] intArr = {1,2,3,4,5}; // 기본형 배열 스트림
		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
//		System.out.println("count = " + intStream.count());
//		System.out.println("sum = " + intStream.sum());
		System.out.println("average = " + intStream.average());
		
//		Integer[] intArr = {1,2,3,4,5}; // 사실 {new Integer(1), ...}인데 자동으로 오토박싱이 되어서 객체가 만들어짐
//		얘는 숫자 외에도 여러 타입의 스트림이 가능해야하므로 sum(), average()를 넣지 않았다.
//		Stream<Integer> intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::print);
//		System.out.println("count= " + intStream.sum());
	}
}
