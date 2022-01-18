package com.uni.khh.chap05.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		길이가 10인 정수형 배열을 만들고 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.

		int[] arr = new int[10]; // 10 크기의 배열 선언

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
//		길이가 10인 정수형 배열을 만들고 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}

		// 역순으로 정렬
		for (int i = 0; i < arr.length; i++) { // arr[0]의 값과
			for (int j = i + 1; j < arr.length; j++) { // arr[1]의 값 비교 위해 j = i+1로 초기식 설정
				if (arr[i] < arr[j]) { // arr[0] 보다 arr[1]이 더 크다면 자리 바꿈
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num]; // 입력 받은 크기 배열 선언

		for (int i = 0; i < arr.length; i++) { // 1부터 입력받은 수까지로 초기화 for문 이용
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.

		String[] sArr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(sArr[1]);
	}

	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		System.out.print("문자열 : "); // 입력한 문자열 개수 먼저 찾자.
		String str = sc.nextLine();
		System.out.print("문자 : "); // 찾을 문자 입력, charAt() 메서드 이용
		char ch = sc.nextLine().charAt(0);

		char[] ch2 = new char[str.length()]; // 문자열의 길이만큼 char 배열 생성

		for (int i = 0; i < ch2.length; i++) { // 입력한 문자열 배열에 담기
			ch2[i] += str.charAt(i);
		}

		String index = ""; // 위치 저장할 변수
		int count = 0; // 개수 세기 위한 변수

		for (int i = 0; i < ch2.length; i++) {
			if (ch2[i] == ch) {
				index += i + " ";
				count++;
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s \n", str, ch, index);
		System.out.println(ch + "개수 : " + count);
	}

	public void practice6() {
//		“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.

		String[] day = { "월", "화", "수", "목", "금", "토", "일" }; // 1번 완료

		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 0 || num > 6) { // 숫자의 범위가 벗어 났을경우 if문을 통해 걸러준다.
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(day[num] + "요일");
		}
	}

	public void practice7() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num]; // 입력한 정수 크기만큼의 배열 선언

		for (int i = 0; i < arr.length; i++) { // 직접 값 입력하여 인덱스의 값 초기화
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();

			arr[i] = num2; // 배열의 i번째 인덱스에 (0부터시작이다) 입력 값 저장
		}

		int sum = 0; // 총 합 저장 위한 변수 선언
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

			sum += arr[i];
		}
		System.out.println();
		System.out.println("총합 : " + sum);
	}

	public void practice8() {
//		3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요. 문제 쓸데없이 많네 ㅡㅡ 좀 어렵다?

		while (true) {
			System.out.print("정수 : ");
			int num1 = sc.nextInt();

			if (num1 < 3 || num1 % 2 == 0) { // 3미만이거나 짝수일 경우 다시 입력받게 한다.
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int[] numArr = new int[num1]; // 입력한 정수 크기의 배열 선언
			
			for(int i=0; i<numArr.length; i++) {
				if(i <= num1/2) { // 중간까지는 1씩 증가해서 담아주고
					numArr[i] += i+1;
				}else if(i > num1/2){ // 이후부터는 1씩 감소해서 담아준다.
					numArr[i] += numArr.length-i; // 길이 - i 를 해주면 된다.5 입력 했을때 감소하는 인덱스 위치 3부터 5-3 = 2
				}
			}
			System.out.print(Arrays.toString(numArr)); // 귀찮아서 toString 써서 출력함 그냥
			return;
		}
	}

	public void practice9() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		String[] sArr = {"양념", "불닭", "간장", "황금올리브"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String ck = sc.nextLine();
		boolean bl = false;
		
		for(int i=0; i<sArr.length; i++) {
			if(sArr[i].equals(ck)) {
				bl = true;
				System.out.println(ck + "치킨 배달 가능");
				break;
			}
		}
		
		if(bl == false) { // bl의 값이 그대로 false이면 없는 메뉴
			System.out.println(ck + "치킨은 없는 메뉴입니다.");
		}
		
	}

	public void practice10() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; //1~10 사이의 난수 저장
			
			System.out.print(arr[i] + " ");
		}
		
	}

	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; //1~10 사이의 난수 저장
			
			System.out.print(arr[i] + " ");
		}
		
		//sort 이용 솔직히 이게 개꿀
		Arrays.sort(arr);
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[9]);
		
		// for문 이용
		
//		for(int i=0; i<arr.length; i++) { // 오름차순으로 정렬 해준다.
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		System.out.println(); // 오름차순으로 정렬을 해주었기 때문에 첫번째 값이 최소값 마지막 값이 최대값
//		System.out.println("최소 값 : " + arr[0]);
//		System.out.println("최대 값 : " + arr[9]);
	}

	public void practice12() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//		중복 제거 귀찮다
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; //1~10 사이의 난수 저장
			System.out.print(arr[i] + " ");
			
			for(int j=0; j<i; j++) { //i ,j 비교 중복 제거
				if(arr[i] == arr[j]) { // 두개의 값이 같을경우 i-- 다시 값 구한다.
					i--;
					break;
				}
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

	public void practice13() {
//		주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
//		char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기)
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		
		System.out.print("주민등록 번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()]; // 주민번호 문자열 길이만큼의 char 배열 생성
		
		for(int i=0; i<ch.length; i++) {
			if(i > 7) { // 성별 이후부터는 *로 표시
				ch[i] = '*';
			}else {
				ch[i] = str.charAt(i);
			}
			
			System.out.print(ch[i]);
		}
		
	}

	public void practice14() {
//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//		마지막 문제 후딱하고 자야지
		
		//1. 로또 번호 6자리 저장할 배열 선언
		int[] arr = new int[6];
		
		//2. 난수를 입력해서 로또 번호 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1; //1~45 사이의 난수 저장
			
			for(int j=0; j<i; j++) { // 중복 제거 해주자
				if(arr[i] == arr[j]) {
					i--;
					break; // i-- 해주고 바깥 반복문으로 돌아간다.
				}
			}
		}
		//3. 오름차순으로 정렬을 해주자.
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.print(arr[i] + " "); // 중복값 없고, 오름차순 정렬된 배열 출력
		}
		
	}
	
	public void practice15() {
		//Arrys 메소드 이용해서 간단하게?
		
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
