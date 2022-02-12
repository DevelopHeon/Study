package com.uni.khh.chap16.silsub1.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.uni.khh.chap16.silsub1.model.vo.Board;

public class BoardDao {

	ArrayList<Board> list = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public BoardDao() { // ObjectInputStream을 통해서 파일을 읽어온다.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			try { // 형변환 필요
				
				list.addAll((ArrayList<Board>) ois.readObject());
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getLastBoardNo() {
		// 마지막 게시글 번호 얻어오기 위한 메서드
		// size - 1 은 마지막 객체 번호
		return list.get(list.size() - 1).getBoardNo();
	}

	public void writeBoard(Board bo) {
		// ArrayList에 Board 객체 추가
		list.add(bo);
	}

	public ArrayList<Board> displayAllList() {
		// 전체 조회 위해 list 반환
		return list;
	}

	public Board displayBoardd(int num) {
		// 하나만 읽어오기
		Board board = null;
		// for문을 통해 같은 번호의 게시글을 찾고
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == num) { // 찾았을 경우 board에 담는다. 1개이기때문에 그냥 객체에 담아주고
				board = list.get(i);
				break;
			}
		}
		// 위에 null로 선언 해 주었기 때문에 일치하는 번호가 없으면 null 반환
		return board;
	}

	public void upReadCount(int num) {
		// 위와 거의 유사, 게시글 조회 수 올려주는 처리만 해주면 된다.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == num) { // count 필드변수로 선언 해줘서 해도 될듯
				list.get(i).setReadCount(list.get(i).getReadCount() + 1);
				break;
			}
		}
	}

	public void modifyTitle(int num, String title) {
		// 수정할 게시글 번호와 제목 매개변수로 Controller에서 전달받는다.
		for (Board b : list) {
			if (b.getBoardNo() == num) {
				// 게시글 번호가 일치 하다면 setter를 이용해서 제목을 새롭게 전달받은 title로 변경
				b.setBoardTitle(title);
				break;
			}
		}
	}

	public void modifyContent(int num, String content) {

		for (Board b : list) {
			if (b.getBoardNo() == num) {
				b.setBoardContent(content);
				break;
			}
		}
	}

	public void deleteBoard(int num) {
		// 전달받은 글 번호 게시글 삭제
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == num) {
				// remove 메소드 이용 게시글 번호 일치하면 삭제
				list.remove(i);
				break;
			}
		}
	}

	public ArrayList<Board> searchBoard(String title) {
		// 전달받은 글 제목과 일치하는 게시글 담기위해 ArrayList 생성
		ArrayList<Board> sList = new ArrayList<Board>();

		// for문을 통해 title이 일치하는 게시글을 contains 메소드를 이용해 찾고
		for (Board b : list) {
			if (b.getBoardTitle().contains(title)) {
				// 새로 만든 ArrayList에 추가
				sList.add(b);

				// 조회수 올리기
				b.setReadCount(b.getReadCount() + 1);
			}
		}
		// sList 반환
		return sList;
	}

	public void saveListFile() {
		// 파일 저장을 위한 메소드 OutputStream을 통해 파일을 저장
		// try resource를 쓰면 Stream 닫아주지 않아도 된다
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			
			oos.writeObject(list);
			
			System.out.println("board_list.dat에 성공적으로 파일을 저장하였습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
