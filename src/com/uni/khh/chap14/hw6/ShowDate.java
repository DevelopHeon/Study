package com.uni.khh.chap14.hw6;

public class ShowDate {

	public static void main(String[] args) {

		DateCalculator totalDay = new DateCalculator();
		
		// 평년인지 윤년인지 isLeapYear()를 통해서 출력한다.
		int year = 2022;
		boolean bo = totalDay.isLeapYear(year);
		
		if(bo == true) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다
		
		System.out.println("총 날짜 수 : " + totalDay.leapDate());
	}

}
