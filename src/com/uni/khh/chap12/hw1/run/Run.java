package com.uni.khh.chap12.hw1.run;

import com.uni.khh.chap12.hw1.model.vo.GalaxyNote9;
import com.uni.khh.chap12.hw1.model.vo.SmartPhone;
import com.uni.khh.chap12.hw1.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		// 2개의 객체를 저장할 수 있는 객체배열 생성 (SmartPhone타입)
		SmartPhone[] phone = new SmartPhone[2];
		
		// 각각의 인덱스에 GalaxyNote9, V40 객체 생성 (기본생성자 이용) --> 다형성
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// for문을 이용하여 phone 객체배열에 모든 인덱스를 참조.
		
		for(SmartPhone p : phone) {
			
			p.printMaker();
			p.makeacall();
			p.takeaCall();
			p.touch();
			p.charge();
			p.picture();
			System.out.println();
		}
		
	}

}
