package com.uni.khh.Lambda;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_5 {

	public static void main(String[] args) {
//		Function<String,Integer> f = (String s) -> Integer.parseInt(s); // 문자열을 숫자로 변경
//		Function<String,Integer> f = 클래스이름::메서드이름; // 문자열을 숫자로 변경
		Function<String,Integer> f = Integer::parseInt; // 메서드 참조 위의 코드와 동일한 코드이다. 앞에 정보가 있기때문에 생략 가능
		System.out.println(f.apply("100")+200);
		
		//Supplier는 입력 X, 출력 O
//		Supplier<MyClass> s = () -> new MyClass(); // MyClass() 객체 생성해서 반환 해주는 함수
//		Supplier<MyClass> s = MyClass::new;
		
//		Function<Integer, MyClass> f2 = (i) -> new MyClass(i); // MyClass() 객체 생성해서 반환 해주는 함수
		Function<Integer, MyClass> f2 = MyClass::new; 
		
		
		MyClass mc = f2.apply(100); // MyClass 객체 반환
		System.out.println(mc.iv);
		System.out.println(f2.apply(200).iv); // 위 두 줄과 동일
		
		// 배열 생성하는 메서드 참조 연습
//		Function<Integer, int[]> f3 = (i) -> new int[i];
		Function<Integer, int[]> f3 = int[]::new; // 메서드 참조 배열 생성은 반드시 Function 배열의 길이 입력 필요하기때문에
		int[] arr = f3.apply(100);
		System.out.println("arr.length = " + arr.length);
		// 한줄로 사용
		System.out.println("생성한 배열의 길이 : " + f3.apply(200).length);
	}
}

class MyClass {
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
		
	}
}

