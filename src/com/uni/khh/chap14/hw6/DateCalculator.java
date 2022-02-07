package com.uni.khh.chap14.hw6;

import java.util.Calendar;

public class DateCalculator {

	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이
//		면 false 리턴
//		(윤년: 연도가 4의 배수이면서,
//		100의 배수가 아니거나 400의
//		배수가 되는 해)
		
		boolean bo = false;

		if((year%4==0 && year%100 != 0) || year%400==0) {
			bo = true;
		}
		
		return bo;
	}

	public long leapDate() {
		
//		1년 1월 1일부터 오늘까지의 총 날 수를 계산 1년부터 현재 연도까지 각 연
//		도가 윤년이면 총 날수에 366일을, 평년이면 365일을 더함 해당 현재 연도가 윤년이면 2
//		월을 29일로 평년이면 28일로 더함 월의 날짜 수를 더함
//		(31일: 1, 3, 5, 7, 8, 10, 12월/
//		30일: 4, 6, 9, 11월)
		
		// 현재 날짜를 구한다
		Calendar today = Calendar.getInstance();
		int todayYear = today.get(Calendar.YEAR);
		int todayMonth = today.get(Calendar.MONTH) + 1; // 월은 index 0부터 시작 1 더해주어야함
		int todayDay = today.get(Calendar.DATE);
		
		// 전 년도 기준 365를 곱해준다.
		int multiplyDays = (todayYear - 1) * 365;
		
		// 전 년도 기준 윤년, 평년 일수를 구한다.
		int divi4 = (todayYear - 1) / 4;
		int divi100 = (todayYear - 1) / 100;
		int divi400 = (todayYear - 1) / 400;
		
		// 전 년도 기준 일수 합계
		// 윤년일 경우 1일씩 더 있으므로 4로 나눈몫 더하고 100으로 나눈몫 빼고 400으로 나눈 몫 다시 더해준다.
		int sumDay = multiplyDays + divi4 - divi100 + divi400;
		
		// 월별 일수 배열을 만든다
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int DayOfMonth = 0;
		
		// 이번달 일수 더해준다.
		for(int i=0; i<todayMonth; i++) {
			DayOfMonth += days[i];
		}
		
		long totalDays = sumDay + 365 + DayOfMonth + todayDay;
		
		return totalDays;
	}
	
}
