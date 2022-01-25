package com.uni.khh.chap08.hw1.controller;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1; // 랜덤 값 배열에 담아준다.
			
			for(int j=0; j<i; j++) { // 중복 제거 위한 for문 비교 대상
				if(lotto[i] == lotto[j]) { // 값이 같을경우 i값 1 마이너스하고 if문 빠져나간다.
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) { // 배열 오름차순 정렬
			for(int j=0; j<i; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.print("랜덤 값 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		
		String arr = ""; // 전달받은 문자 담기위한 String 변수 선언
		
		for(int i=0; i<num; i++) { // String에 담아준다.
			arr += c + " ";
		}
		System.out.println(c + "문자 " + num + "개 출력 : " + arr);
	}
	
	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		
		int num = 0;
		
		for(;;) {
			num = (int)(Math.random() * 58 + 65); // 65부터 58개 랜덤값 담기, a~Z까지 근데 특수문자 포함되어있음
			
			if(num >= 'a' || num <= 'z' || num >= 'A' || num <= 'Z') { // 특수문자 빼기위해 조건 걸어준다.
				break;
			}
		}
		return (char)num;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		if(str == null) { // 전달받은 문자열이 null일 경우 null 값 리턴
			return null;
		}else {
			String result = ""; // 결과 담을 변수 선언			
			
			for(int i=index1; i<index2; i++) {
				result += str.charAt(i); // index1, index2의 사이의 문자 담아준다.
			}
			
			return str + "의 " + index1 + "번 " + index2 + "번 인덱스 사이의 값 출력 : " + result;
		}
		
	}
}
