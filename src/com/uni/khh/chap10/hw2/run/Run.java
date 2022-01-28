package com.uni.khh.chap10.hw2.run;

import com.uni.khh.chap10.hw2.model.vo.Circle;
import com.uni.khh.chap10.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		// 위의 사용 데이터를 참고하여 각각 초기화
		
		Circle[] cr = new Circle[2];
		Rectangle[] rt = new Rectangle[2];
		
		cr[0] = new Circle(1, 2, 3);
		cr[1] = new Circle(3, 3, 4);
		
		rt[0] = new Rectangle(-1, -2, 5, 2);
		rt[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		cr[0].draw();
		cr[1].draw();
		System.out.println("===== rectangle =====");
		for(Rectangle r : rt) {
			r.draw();
		}
	}
}
