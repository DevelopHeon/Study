package com.uni.khh.chap10.hw1.run;

import java.util.Scanner;

import com.uni.khh.chap10.hw1.model.vo.Employee;
import com.uni.khh.chap10.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력

		Student[] std = new Student[3];
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (Student s : std) {
			System.out.println(s.information());
		}
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함

		Employee[] emp = new Employee[10];

		int count = 0; // 수 담아줄 변수 선언

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.print("사원 이름 입력 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 입력 : ");
			int age = sc.nextInt();
			System.out.print("사원 신장 입력 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 입력 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 입력 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 입력 : ");
			String dept = sc.nextLine();

			emp[count++] = new Employee(name, age, height, weight, salary, dept);

			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			// ‘n’일 경우 더 이상 그만 입력 받도록..

			System.out.print("계속 추가하시겠습니까 ? (y/n)");
			char answer = sc.nextLine().toUpperCase().charAt(0);

			if (answer == 'N') {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(emp[i].information());
		}
	}
}
