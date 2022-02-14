package com.uni.khh.chap17.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.uni.khh.chap17.controller.BookManager;
import com.uni.khh.chap17.model.vo.Book;

public class BookMenu {

	public BookMenu() {}
	
	private Scanner sc = new Scanner(System.in);
	
	Book book = null;
	BookManager bm = new BookManager();
	
	public void mainMenu() {
		
		do {
		System.out.println("**** 도서 관리 프로그램 ****");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 도서 검색 출력");
		System.out.println("4. 전체 출력");
		System.out.println("0. 끝내기");
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			insertBook();
			break;
		case 2:
			deleteBook();
			break;
		case 3:
			searchBook();
			break;
		case 4:
			selectList();
			break;
		case 0:
			System.out.print("정말 끝내시겠습니까? (y/n)");
			if('Y' == sc.next().toUpperCase().charAt(0)) {
				System.out.println("프로그램 종료");
				return;
			}
			break;
		default :
			System.out.println("잘못된 메뉴 입니다. 재입력 하세요.");
			continue;
		}
		
		}while(true);
	}

	public void insertBook() {
		// "도서 제목 : " >> 입력 받음 (title:String)
		// "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (category:int)
		// "도서 저자 : " >> 입력 받음 (author:String)
		// 위에서 입력 받은 title, category, author를 매개변수로 한 Book 객체 생성 (book)
		// BookManager의 insertBook 메소드로 book 전달
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		book = new Book(title, category, author);
		
		bm.insertBook(book);
	}
	
	public void deleteBook() {
		// “도서 번호 : “ >> 입력 받음 (bNo)
		// BookManager의 deleteBook 메소드로 bNo 전달
		//  리턴 값 전달 받음 (result)
		
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제");
		}else {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
	}
	
	public void searchBook() {
		// “도서 제목 : “ >> 입력 받음 (title)
		// BookManager의 searchBook 메소드로 title 전달
		//  리턴 값 전달 받음 (searchList)
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		searchList = bm.searchBook(title);
		// searchList가 비어 있을 경우 >> “검색 결과가 존재하지 않습니다.”출력
		// searchList가 비어있지 않을 경우 >> for문 통해 출력
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
	}
	
	public void selectList() {
		// BookManager의 selectList() 메소드 호출
		//  리턴 값 전달 받음 (bookList)
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("도서 목록이 존재하지 않습니다.");
		}else {
			for(int i=0; i<bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
}
