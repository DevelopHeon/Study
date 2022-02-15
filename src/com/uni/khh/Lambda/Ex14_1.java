package com.uni.khh.Lambda;

@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run(); 반환타입 없고 출력도 없음 람다식하고 타입 일치해야 한다.
}

public class Ex14_1 {
	static void execute(MyFunction f) { // 매개 변수의 타입이 MyFunction인 메서드
		f.run();
	}

	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
		MyFunction f = () -> System.out.println("f3.run()"); // 매개변수 없고 출력도 없다.
		return f;
		// return () -> System.out.println("f3.run()");
	}

	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() { // 익명클래스로 run()을 구현
			public void run() { // public 반드시 붙여야 함 ( 오버라이딩 시 접근제어자 범위는 좁아질 수 없기때문에)
				System.out.println("f2.run()");
			}
		}; // 별 의미 없음 그냥 함수형 인터페이스 구현한것을 보여준것
		
		MyFunction f3 = getMyFunction(); // 반환 타입이 함수형 인터페이스
		
		f1.run();
		f2.run();
		f3.run();
		
		execute( () -> System.out.println("f1.run()") );
		execute( () -> System.out.println("run()") );
	}
}
