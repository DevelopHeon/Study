package com.uni.khh.chap04.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) { // 1미만의 숫자는 먼저 걸러준다.
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {
//		practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		while (true) { // 반복 출력 하기 위해 while문 선언
			System.out.print("1이상의 숫자를 입력하세요.");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				return;
			}
		}
	}

	public void practice3() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice4() {
//		practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} else {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				return;
			}
		}
	}

	public void practice5() {

		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i; // i값 계속 더해서 sum에 담아준다.
			if (i < num) { // 부호 붙여주기 위해 if문 선언
				System.out.print(" + ");
			} else if (i == num) { // i가 num과 같으면 for문 종료기때문에 종료시 = 과 sum값 출력
				System.out.println(" = " + sum);
			}
		}
	}

	public void practice6() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
//		(for문 이용)

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 <= 0 || num2 <= 0) {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		} else if (num1 >= num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice7() {
		// 위 문제와 동일하나 , 1미만의 숫자가 입력됐다면 "1"이상의 숫자를 입력해주세요 출력 후 다시 입력

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 <= 0 || num2 <= 0) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
			} else if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
				return;
			} else if (num2 > num1) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
				return;
			}
		}
	}

	public void practice8() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) { // 행단
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}
	}

	public void practice9() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.
//		다중 for문 이용한다.

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		// 먼저 입력받은 숫자가 2보다 작거나 9보다 크면 if문 통해서 반복문 돌지 않게 하고
		if (dan > 9 || dan < 2) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		} else { // 범위 안의 숫자를 입력받을경우
			for (int i = dan; dan <= 9; dan++) { // 단을 출력해줄 for문
				System.out.println("======= " + dan + "단 =======");
				for (int j = 1; j <= 9; j++) { // 1~9까지의 수르르 곱해줄 for문
					System.out.printf("%d * %d = %d \n", dan, j, dan * j);
				}
			}
		}
	}

	public void practice10() {
//		Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
//		“2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		while (true) {

			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan > 9 || dan < 2) {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
			} else {
				for (int i = dan; dan <= 9; dan++) { // 단 for문
					System.out.println("======= " + dan + "단 =======");
					for (int j = 1; j <= 9; j++) { // 곱할 수 for문
						System.out.println(dan + " * " + j + " = " + dan * j);
					}
				}
				return; // 반복문이 종료되고 나면 return 분기문으로 메소드 종료시킨다.
			}
		}
	}

	public void practice11() {
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다. 그때 구글링함 이번엔 풀어보자
//		이번엔 쉽게 풀었다. 옛날보다 잘해진듯

		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int sub = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(start + " ");
			start += sub; // 공차의 값을 누적해서 더해준다
		}
	}

	public void practice12() {
//		정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.

		while (true) {

			System.out.println("연산자(+, -, *, /, %) : ");
			String str = sc.next();

			if (str.equals("exit")) { // 연산자에서 exit 입력시 프로그램 종료하기 위해 if문 선언
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// 두개의 정수를 입력받는다.
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			int result = 0; // 연산 결과 값 받아줄 변수 선언

			switch (str) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue; // continue 분기문 사용하면 뒷내용 무시하고 반복문으로 다시 돌아감
				} else {
					result = num1 / num2;
					break;
				}
			case "%":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해라");
					continue;
				} else {
					result = num1 % num2;
					break;
				}
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}

			System.out.println(num1 + str + num2 + " = " + result);
		}
	}

	public void practice15() {
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		ex) 2, 3, 5, 7, 11 …

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) { // 2보다 작은 수 입력 했을 경우 if문 타고 종료
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}

		for (int i = 2; i < num; i++) { // 1로 나누면 뭐든 소수가 되기때문에 2부터 시작

			if (num % i == 0) { // / 연산자로 했다가 고생했다. 소수는 1과 자기 자신으로만 나눌수 있으므로
								// 나머지 연산자로 0이 나오는 수들은 모두 약수, 즉 소수가 아니다.
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");
	}

	public void practice16() {
//		위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
//		“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.		

		while (true) {

			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다. 재입력하세용");
				continue;
			}

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("소수가 아닙니다.");
					return;
				}
			}
			System.out.println("소수입니다.");
			return;
		}
	}

	public void practice17() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		알고리즘에 너무 약한다.. 결국 구글로 찾아보고 다시 풀었음 ㅆㅂ의라자

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}

		int count = 0; // 소수 개수 담기 위한 변수 선언

		for (int i = 2; i <= num; i++) { // 소수 모두 출력하기 위해 이중 for문 생성
			for (int j = 2; j <= i; j++) { // i와 j가 같고 i를 j로 나눈 나머지가 0이면 소수

				if (i != j && i % j == 0) { // i와 j가 다른데 나머지가 0이기때문에 소수가 아닌 약수
					break;
				}

				if (i == j && i % j == 0) { // 두개의 조건이 모두 충족할때만 소수 출력한다.
					System.out.print(i + " ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.printf("2부터 %d까지 소수의 개수는 %d개입니다.", num, count);
	}

	public void practice18() {

		int count = 0; // 개수 세기 위해서 변수 선언

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0 || i % 3 == 0) { // 얘는 2의 배수이거나 3의 배수 일때 출력
				System.out.print(i + " ");
			}

			if (i % 2 == 0 && i % 3 == 0) { // 얘는 2와 3의 공배수일때
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}

	public void practice19() {

//		다음과 같은 실행 예제를 구현하세요. 별찍기 존나싫어
//		(for문 이용)
//		ex.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 행 구문
			for (int j = num; j >= 1; j--) {// 별 구문
				if (i >= j) { // if문으로 공백 출력 조건 만족 시켜주어야한다. 하 이게 뭐라고 오래걸리네
								// 4를 기준으로 i가 j 보다 작으면 공백 크거나 같은경우 별을 출력해준다.
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // 줄 띄기
		}
	}

	public void practice20() {
//		메소드 명 : public void practice20(){}
//		다음과 같은 실행 예제를 구현하세요.
//		(for문 이용)
//		ex.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*		
//		 이중 for문 안뒤집힌거 1개 뒤집힌거 1개 총 4개 작성해서 만들어보자.
//		 저번에 구글링 했는데 이번에는 안하고 금방 풀었다. 기분 좋음

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 멀쩡한거 완성
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int k = 1; k <= num; k++) { // 뒤집은 삼각형 완성 ~
			for (int n = num; n > k; n--) { // 얘는 위에 반대로, 대신 가운데 별은 2번 나오면 안되니 조건식에서는 작다로.
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice21() {
//		다음과 같은 실행 예제를 구현하세요.
//		(for문 이용)
//		ex.
//		정수 입력 : 4
//		   *
//		  ***
//		 *****
//		*******
//		이거 개싫음 , 구글링 없이 풀어보기 실패 ㅋㅋㅋ
//		월요일날 다시 풀어보기

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 행의 수 만큼 출력위한 for문
			for (int j = num; j >= i; j--) { // 공백을 찍기위한 for문 첫줄경우 4,3,2 3번 공백찍고 밑으로 내려감
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) { // 별을 찍기 위한 for문 첫줄 1번만 * 찍음 i*2=2이기때문에
												// 그림 그렸을때 첫줄 가운데에 한번만 나와야함 그래서 *2인가봄?
				System.out.print("*"); // 겨우 이해함 짜증나네
			}
			System.out.println();
		}
	}

	public void practice22() {
//		정수 입력 : 5
//		*****
//		*   *
//		*   *
//		*   *
//		*****

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) { // 간단하게 if문 걸어주면 될거같은데

				if (i == 1 || i == num) { // 1번째줄 마지막줄 완성
					System.out.print("*");
				} else if (j == 1 || j == num) { // j가 1이거나 5일때만 별을 찍는다
					System.out.print("*");
				} else { // 그 이외에는 공백처리 성공 금방했다 ~
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice23() { // 숫자 다이아몬드 못하겠어서 그거 빼고 하자

		for (int i = 1; i <= 5; i++) {
			
			if(i==1 || i==5) {
				for(int j=1; j<=5; j++) {
					if(j == 3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else if(i == 3) {
				for(int j=1; j<=5; j++) {
					if(j==1 || j==5) {
						System.out.print("*");
					}else
						System.out.print(" ");
				}
			}else {
				for(int j=1; j<=5; j++) {
					if(j==2 || j==4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public void practice24() {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
			
				if(i == 1 || i == 5) {
					System.out.print("*");
				}else if(j==1 || j==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	
	public void teacher_1() {
		
		for(int i=-4; i<=4; i++) {		 // -4 ~ 4까지 반복 (9번 반복)
			
			int k = i < 0 ? -i : i;		 // k 변수에 i의 절대값 대입
			
			for(int j=k; j>0; j--) {	 // 공백을 출력하는 반복문
				System.out.print(" ");
			}
			
			for(int j=1; j<=9-2*k; j++) { // 숫자를 출력하는 반복문
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
}
