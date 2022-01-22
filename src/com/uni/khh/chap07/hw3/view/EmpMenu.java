package com.uni.khh.chap07.hw3.view;

import java.util.Scanner;

import com.uni.khh.chap07.hw3.model.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		Employee emp = null;

		while (true) {
			// 메뉴 화면 출력 --> 반복 실행 처리
			System.out.println("==== 사원 정보 관리 프로그램 ====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");

			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				emp = inputEmployee();
				break;
			case 2:
				modifyEmployee(emp); // 사원 정보 저장한 객체 매개변수로 던져준다.
				break;
			case 3:
				emp = null; // null 값을 가리키게 되면 연결 된 주소값이 없어지므로 가비지 컬렉터에 의해 삭제된다.
				break;
			case 4:
				if(emp == null) // 객체에 담긴 값이 아무것도 없을경우 continue를 통해 switch 탈출
					continue;
				System.out.println(emp.information());
				break;
			case 9:
				return;
			}
		}
	}

	public Employee inputEmployee() {
		//키보드를 통해 사원 정보를 입력 받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 값 반환
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		System.out.print("직급 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("보너스포인트 : ");
		double bonus = sc.nextDouble();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		// 입력한 값으로 매개변수 생성자 통해서 객체에 담아준다.
		Employee emp = new Employee(name,dept,job,age,gender,salary,bonus,phone,address);
		System.out.println("사원 등록이 완료 되었습니다.");
		return emp;
		
	}
	

	public void modifyEmployee(Employee emp) {
		// 사원의 정보가 담겨있는 객체 매개변수로 받아온다.
		while(true) {
			
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴를 선택하세요.");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 빼주고
			
			switch(menu) {
			case 1:
				System.out.print("변경 할 이름을 입력 : ");
				String name = sc.nextLine();
				emp.setEmpName(name);
				break;
			case 2:
				System.out.print("변경 할 급여를 입력 :");
				int salary = sc.nextInt();
				emp.setSalary(salary);
				sc.nextLine();
				break;
			case 3:
				System.out.print("변경 할 부서 입력 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4:
				System.out.print("변경 할 직급 입력 : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9:
				return;
			}
			
		}
		
	}
}
