package com.uni.khh.chap06.dimension;

import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4]; // 4행 4열 선언

		int num = 1;
		
		for (int i = 0; i < arr.length; i++) { // 이차원 배열 초기화 행
			for (int j = 0; j < arr[i].length; j++) { // 열
				arr[i][j] = num++;
				
				System.out.printf("%3d", arr[i][j]); // 출력 해준다
			}
			System.out.println();
		}

	}

	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];
		int num = 16;

		for (int i = 0; i < arr.length; i++) { // 위와 동일하나 16부터 값을 빼서 해야한다.
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;

				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//		ex.
//		(0, 0)(0, 1)(0, 2)
//		(1, 0)(1, 1)(1, 2)
//		(2, 0)(2, 1)(2, 2)	

		String[][] arr = new String[3][3]; // 제시된 대로 출력하기 위해 String으로 이차원 배열 선언

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // 처음에 i는 0 안쪽은 j값이 저장되는구문
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < arr.length; i++) { // 이차원 배열 출력해준다.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
//		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//		아래의 내용처럼 처리하세요. 복사 응용 문제 어렵네 ㅡㅡ

		int[][] arr = new int[3][3];
		int[][] arr2 = new int[4][4];

		for (int i = 0; i < arr.length; i++) { // 첫번째 이차원 배열에 난수값을 저장한다.
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[i][j] = arr[i][j]; // 난수값이 저장된 첫번째 배열 두번째 배열에 복사
				arr2[i][arr[i].length] += arr[i][j]; // 4번째열은 앞에 3개 숫자 다 더해서 담고
				arr2[arr.length][j] += arr[i][j]; // 4번째 행은 세로 숫자 다 더해서 담고
				arr2[arr.length][arr[i].length] += arr[i][j]; // 마지막은 9개 다 더해서 담는다
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {
//		2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면
//		“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//		크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//		(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄)

		while (true) {
			
			System.out.print("행 크기 : ");
			int num1 = sc.nextInt();
			System.out.print("열 크기 : ");
			int num2 = sc.nextInt();
			
			if (num1 < 1 || num1 > 10) {
				System.out.println("1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}else if (num2 < 1 || num2 > 10) {
				System.out.println("1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			char[][] cArr = new char[num1][num2]; // char형 배열 선언
			
			for(int i=0; i<cArr.length; i++) {
				for(int j=0; j<cArr[i].length; j++) {
					cArr[i][j] = (char)(Math.random() * 26 + 65);
				}
			}
			
			for(int i=0; i<cArr.length; i++) {
				for(int j=0; j<cArr[i].length; j++) {
					System.out.printf("%2c", cArr[i][j]);
				}
				System.out.println();
			}
			return;
		}
	}

	public void practice6() {
		// 가이드 참고했음 위치 바꿔주기가 헷갈림
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원", "열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};	
		
		// 1열 1~5행의 값이 1행 1~5로 가야함 i값과 j값의 위치 바꿔준다.
											
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	

	public void practice7() {
//		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
//		문자형 가변 배열을 선언 및 할당하세요.
//		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.		
	
		System.out.print("행의 크기 : ");
		int num1 = sc.nextInt();
		
		char[][] cArr = new char[num1][]; // 입력받은 크기의 가변배열 선언
		
		for(int i=0; i<cArr.length; i++) { // 입력한 수 만큼 다른 열을 만들기 위해 for문 안에 입력값 받기
			System.out.print(i + "행의 크기 : ");
			int num2 = sc.nextInt();
			cArr[i] = new char[num2]; // 여기서 헷갈림 이차원 배열 싫음
		}
		
		char result = 'a'; // 'a'값을 먼저 담아준다.
		
		for(int i=0; i<cArr.length; i++) {
			for(int j=0; j<cArr[i].length; j++) {
				
				cArr[i][j] = result++; // a부터 1씩 증가해서 값 담아주기
				
				System.out.print(cArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
//		1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
//		3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
//		1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		
		// 1차원 배열의 12명 학생 초기화
		String[] str = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
						"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] sArr1 = new String[3][2];
		String[][] sArr2 = new String[3][2];
		
		int count = 0; // 1차원 배열 7번째 값부터 담아주기 위해 변수를 선언해준다.
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<sArr1.length; i++) { // 2차원 배열에 복사
			for(int j=0; j<sArr1[i].length; j++) {
				sArr1[i][j] = str[count++];
				
				System.out.print(sArr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<sArr2.length; i++) { // 2번째 2차원 배열에 나머지 값 복사
			for(int j=0; j<sArr2[i].length; j++) {
				sArr2[i][j] = str[count++];
				
				System.out.print(sArr2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		String[] str = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
						 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] sArr1 = new String[3][2];
		String[][] sArr2 = new String[3][2];

		int count = 0; // 1차원 배열 7번째 값부터 담아주기 위해 변수를 선언해준다.
		boolean result = false;
		
		System.out.println("== 1분단 ==");
		for (int i = 0; i < sArr1.length; i++) { // 2차원 배열에 복사
			for (int j = 0; j < sArr1[i].length; j++) {
				sArr1[i][j] = str[count++];

				System.out.print(sArr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < sArr2.length; i++) { // 2번째 2차원 배열에 나머지 값 복사
			for (int j = 0; j < sArr2[i].length; j++) {
				sArr2[i][j] = str[count++];

				System.out.print(sArr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String search = sc.nextLine();
		
		for (int i = 0; i < sArr1.length; i++) { // 1분단부터 for문 돌려서 검색해본다.
			for (int j = 0; j < sArr1[i].length; j++) {
				if (sArr1[i][j].equals(search)) {  // 1분단에 담겨있는 학생과 이름이 일치하면
					if (j == 0) { // j가 0일 경우는 왼쪽 1일 경우는 오른쪽이다.
						System.out.println("검색하신 " + search + "학생은 1분단 " + ++i + "번째 줄 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + search + " 학생은 1분단 " + ++i + "번째 줄 오른쪽에 있습니다.");
					}
				}
			}
		}

		for (int i = 0; i < sArr2.length; i++) {
			for (int j = 0; j < sArr2[i].length; j++) { // 1분단에서 찾지 못할 경우 2분단에서 찾기
				if (sArr2[i][j].equals(search)) {
					if (j == 0) {
						System.out.println("검색하신 " + search + "학생은 2분단 " + ++i + "번째 줄 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + search + " 학생은 2분단 " + ++i + "번째 줄 오른쪽에 있습니다.");
					}
				}
			}
		}
	}
}
