package com.uni.khh.chap17.controller;

import java.util.ArrayList;

import com.uni.khh.chap17.model.vo.Book;

public class BookManager {
	
	ArrayList<Book> bookList = new ArrayList<>();

	public void insertBook(Book book) {
		// 전달 받은 book은 현재 도서 번호가 0인 채로 들어오는데
		// 새로운 도서가 추가될 때마다 추가되는 도서의 도서 번호는
		// 리스트 마지막 도서 번호의 다음 번호로 부여해야 됨
	
		// 하지만 리스트에 도서가 없는 경우, 즉 첫 도서 등록일 경우 위의 문장에서 예외 발생
//		 어떤 예외처리가 발생하는지 알아보고 try catch문을 이용하여 오류 해결
		int lastNo = 0; // 우선 변수 생성 및 초기화
		try {
			lastNo = bookList.get(bookList.size()-1).getbNo() + 1; // 마지막 도서 번호 + 1
		}catch(IndexOutOfBoundsException e) {
			lastNo = 1;
		}
		
		// setter를 이용하여 book 도서 번호를 lastNo로 적용
		// bookList의 book 추가
		book.setbNo(lastNo);
		bookList.add(book);
	}

	public int deleteBook(int bNo) {
		// for문을 이용하여 전달받은 도서 번호가 존재하는 도서 삭제
		// 성공적으로 삭제 할 경우 1 리턴
		// 삭제 되지 않은 경우 즉, 존재하는 도서 번호가 없는 경우 0 리턴
		int result = 0;
		
		for(Book b : bookList) {
			if(b.getbNo() == bNo) {
				bookList.remove(bNo-1);
				result = 1;
				break;
			}
		}
		
		return result;
	}

	public ArrayList<Book> searchBook(String title) {
		
		ArrayList<Book> searchList = new ArrayList<Book>(); // 검색 결과값들을 보관할 리스트
		// for문을 이용하여 전달받은 제목을 포함한 도서를 searchList에 추가
		// searchList 리턴
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				searchList.addAll(bookList);
			}
		}
		
		return searchList;
	}

	public ArrayList<Book> selectList() {
		
		return bookList;
	}
}
