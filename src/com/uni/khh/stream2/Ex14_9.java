package com.uni.khh.stream2;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {
	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr)
		.parallel() // 병렬로 처리
		.forEachOrdered(System.out::println);
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		Optional<String> sWord = Stream.of(strArr).parallel().filter(s->s.charAt(0)=='s').findAny();
		
		System.out.println("noEmptyStr=" + noEmptyStr);
		System.out.println("sWord=" + sWord.get());
		
		//Stream<String>을 Stream<Integer>으로 변환 (s) -> s.length()
//		Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);
		
		//Stream<String> 을 IntStream으로 변환. IntStream기본형 스트림.
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b) -> a + b);
		
		OptionalInt max = IntStream.empty().reduce((a,b) -> Integer.max(a, b));
		OptionalInt min = intStream4.reduce(Integer::min);
		
		
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
		System.out.println("max=" + max.orElse(0));
//		System.out.println("max=" + max.orElseGet(() -> 0)); 위하고 동일 람다식을 이용할수 있다
		System.out.println("min=" + min.getAsInt());
	}
}
