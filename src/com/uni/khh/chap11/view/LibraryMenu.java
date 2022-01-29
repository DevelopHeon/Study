package com.uni.khh.chap11.view;

import java.util.Scanner;

import com.uni.khh.chap11.controller.LibraryManager;
import com.uni.khh.chap11.model.vo.Book;
import com.uni.khh.chap11.model.vo.Member;

public class LibraryMenu {

	LibraryManager lm = new LibraryManager();
	
	Scanner sc = new Scanner(System.in);
	
//	회원이 만화책 또는 요리책을 빌리려고 한다. 먼저 프로그램이 실행되면 회원의 인적 사항을 입력하고
//	회원등록을 해준다. 그 다음에 메뉴가 출력되면서 마이페이지, 도서전체조회, 도서검색, 도서대여 기능을
//	할 수 있다. 도서를 대여할 때 해당 도서가 만화책일 경우 나이제한이 있기 때문에 회원 나이와 만화책
//	의 제한 나이를 비교해야 되고, 대여할 도서가 요리책일 경우 해당 도서에 요리학원 쿠폰이 있으면 쿠폰
//	이 해당 멤버 객체에게 발급된다.
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryManager의 insertMember() 메소드에 전달
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		Member m = new Member(name, age, gender);
		
		lm.insertMember(m);
		
		while(true) {
			
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println(lm.myinfo()); 
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
//				continue;
			}
		}
		
	}

	public void selectAll() {
		// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
		Book[] bList = lm.selectAll();
		
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword : String)
		// LibraryManager의 searchBook() 메소드에 전달
		// 그 결과 값을 Book[] 자료형으로 받기
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
		// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
		for(Book b : searchList) {
			if(b == null) { // b에 null값이 담겨있을경우 밑에 문장 건너 뛰기
				continue;
			}
			
			System.out.println(b.toString());
		
		}
	
}
	
	private void rentBook() {
		// 도서 대여를 위해 도서번호를 알아야 된다. 
		// selectAll() 메소드 호출을 통해 도서 리스트 한번 출력 해주고
		selectAll();
		
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (num : int)
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// LibraryManager의 rentBook(num) 메소드에 전달
		int result = lm.rentBook(num);
		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우  “성공적으로 대여되었습니다.” 출력
		// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
		// 마이페이지를 통해 확인하세요” 출력
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여 되었습니다. 요리학원 쿠폰이 발급 되었습니다.");
			System.out.println("마이페이지를 통해 확인하세요.");
		}
	
	}
}
