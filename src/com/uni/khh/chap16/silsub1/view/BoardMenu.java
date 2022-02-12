package com.uni.khh.chap16.silsub1.view;

import java.util.Scanner;

import com.uni.khh.chap16.silsub1.controller.BoardManager;

public class BoardMenu {

	private Scanner sc = new Scanner(System.in);
	BoardManager bm = new BoardManager();

	public void mainMenu() {

		while (true) {
			System.out.println("******** 게시글 서비스 프로그램 ********");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 한 개 보기");
			System.out.println("4. 게시글 제목 수정");
			System.out.println("5. 게시글 내용 수정");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("8. 파일에 저장하기");
			System.out.println("9. 정렬하기");
			System.out.println("10. 끝내기");
			System.out.print("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				bm.writeBoard(); // 게시글 쓰기
				break;
			case 2:
				bm.displayAllList(); // 게시글 전체 보기
				break;
			case 3:
				bm.displayBoard(); // 게시글 한개 보기
				break;
			case 4:
				bm.modifyTitle(); // 게시글 제목 수정하기
				break;
			case 5:
				bm.modifyContent(); // 게시글 내용 수정하기
				break;
			case 6:
				bm.deleteBoard(); // 게시글 삭제하기
				break;
			case 7:
				bm.searchBoard(); // 게시글 검색하기
				break;
			case 8:
				bm.saveListFile(); // 파일 저장하기
				break;
			case 9:
				sortSubMenu(); // 게시글 정렬 메뉴
				break;
			case 10:
				System.out.println("프로그램을 종료하시겠습니까?(y/n)");
				if ('Y' == sc.next().toUpperCase().charAt(0))
					return;
			default :
				System.out.println("잘못된 메뉴 번호 입니다. 다시 입력 하세요.");
			}
		}
	}

	public void sortSubMenu() {
		
		while(true) {
			System.out.println("******* 게시글 정렬 메뉴 ********");
			System.out.println("1. 글번호순 오름차순 정렬");
			System.out.println("2. 글번호순 내림차순 정렬");
			System.out.println("3. 작성날짜순 오름차순 정렬");
			System.out.println("4. 작성날짜순 내림차순 정렬");
			System.out.println("5. 글 제목순 오름차순 정렬");
			System.out.println("6. 글 제목순 내림차순 정렬");
			System.out.println("7. 이전 메뉴로 이동");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				bm.sortList(1, false);
				break;
			case 2:
				bm.sortList(1, true);
				break;
			case 3:
				bm.sortList(2, false);
				break;
			case 4:
				bm.sortList(2, true);
				break;
			case 5:
				bm.sortList(3, false);
				break;
			case 6:
				bm.sortList(3, true);
				break;
			case 7:
				return;
			default:
				System.out.println("잘못된 메뉴 번호입니다. 다시 입력하세요");
				break;
			}
		}
	}
}
