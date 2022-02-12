package com.uni.khh.chap16.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.uni.khh.chap16.silsub1.model.comparator.AscBoardDate;
import com.uni.khh.chap16.silsub1.model.comparator.AscBoardNo;
import com.uni.khh.chap16.silsub1.model.comparator.AscBoardTitle;
import com.uni.khh.chap16.silsub1.model.comparator.DescBoardDate;
import com.uni.khh.chap16.silsub1.model.comparator.DescBoardNo;
import com.uni.khh.chap16.silsub1.model.comparator.DescBoardTitle;
import com.uni.khh.chap16.silsub1.model.dao.BoardDao;
import com.uni.khh.chap16.silsub1.model.vo.Board;

public class BoardManager {

	BoardDao bDao = new BoardDao();
	Board bo = new Board();
	ArrayList<Board> list = null;

	Scanner sc = new Scanner(System.in);

	public void writeBoard() {

		System.out.println("새 게시글 쓰기 입니다.");
		System.out.println("글 제목 : ");
		String title = sc.nextLine();
		System.out.println("작성자 : ");
		String writer = sc.nextLine();
		// 날짜는 Date 클래스의 now로 현재 날짜 전달 해 준다.
		Date now = new Date();

		System.out.println("글 내용 (exit 입력시 종료) : ");
		String write = "";
		String content = ""; // 여러 줄 작성 위해 String 변수 2개 선언
		while (true) {
			write = sc.nextLine();
			if (write.equals("exit")) {
				break;
			}
			content += write + "\n";
		}

		// 예외처리 오랜만에 해도 헷갈림 ㅡㅡ
		try { // 게시글 작성 하는것이 첫번째 글이면 IndexOutOfBoundsException 예외 발생
			bDao.writeBoard(new Board(bDao.getLastBoardNo() + 1, title, writer, now, content));
		} catch (IndexOutOfBoundsException e) { // catch로 잡아서 객체 생성 해주어야 한다.
			bDao.writeBoard(new Board(1, title, writer, now, content));
		}
	}

	public void displayAllList() {
		// 전체 게시글 받아줄 list에 displayAllList()를 통해 담아주고
		list = bDao.displayAllList();

		// Iterator를 통해 list에 담긴 객체들 전부 출력
		Iterator iter = list.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void displayBoard() {

		System.out.print("조회할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		// => 해당 글 번호의 게시글 전달 받아 출력하고
		bo = bDao.displayBoardd(num);

		// 조회수를 올리기 위해 BoardDao의 upReadCount() 메소드에 해당 글 번호 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력

		if (bo == null) {
			System.out.println("조회할 게시글이 없습니다.");
		} else {
			System.out.println(bo);
		}

		bDao.upReadCount(num);
	}

	public void modifyTitle() {
		// 위와 거의 비슷
		System.out.print("수정할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		bo = bDao.displayBoardd(num);

		System.out.print("변경 할 글 제목 : ");
		String title = sc.nextLine();

		bDao.modifyTitle(num, title);

		if (bo == null) {
			System.out.println("조회할 게시글이 없습니다.");
		} else {
			System.out.println(bo);
		}
	}

	public void modifyContent() {
		// “수정할 글 번호 : “ >> 입력 받음
		System.out.print("내용 수정할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		// 해당 글 번호의 게시글 전달 받아 출력
		bo = bDao.displayBoardd(num);

		// “변경할 글 내용 : “ >> 입력 받음
		System.out.print("변경 할 글 내용(exit 입력시 종료) : ");
		String write = "";
		String content = "";
		while (true) {
			if (write.equals("exit"))
				break;
			write = sc.nextLine();
			content += write + "\n";

		}
		// BoardDao의 modifyContent() 메소드에 해당 글 번호와 변경할 제목 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		bDao.modifyContent(num, content);

		if (bo == null) {
			System.out.println("조회할 게시글이 없습니다.");
		} else {
			System.out.println(bo);
		}
	}

	public void deleteBoard() {
		// “삭제할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드를 호출하여 해당 글 번호의 게시글 전달 받아 출력
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		// 있을 경우 “정말로 삭제하시겠습니까? (y/n) : “ >> 입력 받음
		// 대소문자 관계없이 Y 일 경우 BoardDao의 deleteBoard() 메소드에 해당 글 번호 전달
		System.out.print("삭제할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		bo = bDao.displayBoardd(num);

		if (bo == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(bo);
			System.out.print("정말로 삭제하시겠습니까? (y/n)");
			if ('Y' == sc.nextLine().toUpperCase().charAt(0)) {
				bDao.deleteBoard(num);
			}
		}

	}

	public void searchBoard() {
		// “검색할 제목 : “ >> 입력 받음
		// BoardDao의 searchBoaard() 메소드에 입력 값 전달
		// 제목은 중복될 수 있기 때문에 결과값 다중  list로 결과값 전달받음
		System.out.print("검색할 제목 : ");
		String title = sc.nextLine();
		list = bDao.searchBoard(title);

		// 결과값이 없으면 “검색 결과가 없습니다.” 출력
		// 결과값이 있으면 list출력
		if (list == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}

	public void saveListFile() {

		bDao.saveListFile();
	}

	public void sortList(int item, boolean isDesc) {
		// BoardDao의 displayAllList()의 메소드 호출하여 전체 글 리스트 전달
		list = bDao.displayAllList();
		System.out.println(list);
		// item 1일경우 게시글 번호 오름차순, 내림차순
		if (item == 1) {
			if (isDesc == false) {
				list.sort(new AscBoardNo());
			} else {
				list.sort(new DescBoardNo());
			}
		// item 2일 경우 날짜 오름차순, 내림차순
		} else if (item == 2) {
			if (isDesc == false) {
				list.sort(new AscBoardDate());
			} else {
				list.sort(new DescBoardDate());
			}
		// item 3일경우 제목 오름차순, 내림차순
		} else {
			if (isDesc == false) {
				list.sort(new AscBoardTitle());
			} else {
				list.sort(new DescBoardTitle());
			}
		}
	}
}
