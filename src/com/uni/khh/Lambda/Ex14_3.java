package com.uni.khh.Lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		// 위에 두개의 함수를 결합하는 방법 두가지.
		Function<String, String> h = f.andThen(g); // f 적용하고서 g를 적용해라 f의 출력과 g의 입력 타입이 같아야만 가능
		Function<Integer, Integer> h2 = f.compose(g); // g.andThen(f)하고 같음, g를 앞에 세운경우
		
		System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2)); // 2 -> "10" -> 16
		
		Function<String, String> f2 = x -> x; // 항등 함수 (identity function)
		System.out.println(f2.apply("AAA")); // AAA가 그대로 출력됨
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100;
		
		// 100 <= i && (i < 200 || i%2 == 0)
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); // true
		
		String str1 = new String("abc"); // equals()를 통해 비교하기때문에 new로 비교해도 true가 나온다.
		String str2 = new String("abc");
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1); 
		//boolean result = str1.equals(str2);
		boolean result = p2.test(str2);
		
		
		System.out.println(result);
	}

}
