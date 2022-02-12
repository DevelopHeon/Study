package com.uni.khh.chap16.silsub1.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6977972509800431050L;

	private int boardNo;
	
	private String boardTitle;
	
	private String boardWrtier;
	
	private Date boardDate;
	
	private String boardContent;
	
	private int readCount;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int boardNo, String boardTitle, String boardWrtier, Date boardDate, String boardContent) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWrtier = boardWrtier;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWrtier() {
		return boardWrtier;
	}

	public void setBoardWrtier(String boardWrtier) {
		this.boardWrtier = boardWrtier;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "게시글번호: " + boardNo + " 제목: " + boardTitle + " 작성자: " + boardWrtier
				+ " 작성날짜: " + boardDate + " 내용: " + boardContent + " 조회수: " + readCount;
	}
	
	
}
