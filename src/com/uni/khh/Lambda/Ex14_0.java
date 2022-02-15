package com.uni.khh.Lambda;

public class Ex14_0 {

	public static void main(String[] args) {
//		???? obj = (a,b) -> a > b ? a : b; // 람다식. 익명객체 참조변수로 다뤄줘야 한다 밑에와 동일
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) { // 오버라이딩 규칙 중 접근 제어자는 좁게 바꿀 수 없다.
//				return a > b ? a:b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		// 메서드인데 이름이 없음 ? 사용하려면 이름을 붙여줘야 한다. 그걸 함수형 인터페이스에서
		// max로 이름을 붙여준것 추상메서드를 통해서 연결해주는 것이라 생각하자.
		MyFunction2 f = (a, b) -> a > b ? a : b;
		
		int value = f.max(3,5); // Object 리모콘에는 max라는 버튼이 없다. 형변환도 못해줌 Object기때문에
								  // 그래서 필요한게 함수형 인터페이스
		System.out.println("value = " + value);
	}
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함. 컴파일러가 확인해줌 얘 작성시
interface MyFunction2{
//	public abstract int max(int a, int b);
	int max(int a, int b);
}
