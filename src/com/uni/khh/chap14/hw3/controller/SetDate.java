package com.uni.khh.chap14.hw3.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SetDate {

	// time 클래스 이용해서 해보았는데 모르겠는것 투성이다. 찾아서 좀 더 공부해볼것
	
	public SetDate() {
		// TODO Auto-generated constructor stub
	}

	public String todayPrint() {

		// 현재 날짜 시간 구하기
		LocalDateTime now = LocalDateTime.now();
		
		String fmNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
	
		return fmNow;
	}

	public String setDay() {
		
		LocalDate set = LocalDate.of(2011, 03, 21);

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		String shortFormat = formatter.format(set);
		
		return shortFormat;
	}
	
	
}
