package com.uni.khh.chap09.hw2.run;

import java.util.Scanner;

import com.uni.khh.chap09.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		int count = 0; // 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임

		Student[] arr = new Student[10];

		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성

		while (true) {

			System.out.print("학년을 입력하세요 : ");
			int grade = sc.nextInt();
			System.out.print("반을 입력하세요 : ");
			int classroom = sc.nextInt();
			sc.nextLine();

			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();

			System.out.print("국어 점수를 입력하세요 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			int math = sc.nextInt();
			sc.nextLine();

			arr[count++] = new Student(grade, classroom, name, kor, eng, math);
			// 후위형을 이용하여 0부터 1씩 증가함

			// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
			System.out.print("계속 추가하시겠습니까 ? (y/n) ");
			char answer = sc.nextLine().toUpperCase().charAt(0);

			if (answer == 'N') {
				break; // return으로 할 경우 메소드 종료 밑에 for문 실행 안됨
			}
		}
		// arr.length로 하게 될경우 10까지 돌리기때문에 NullPointerException 발생. count전까지로 돌려준다.
		for(int i=0; i<count; i++) {
			System.out.println(arr[i].information());
		}
	}
}