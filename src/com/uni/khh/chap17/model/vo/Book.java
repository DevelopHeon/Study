package com.uni.khh.chap17.model.vo;

public class Book {
	
	private int bNo;
	
	private String title;
	
	private int category;
	
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		
		String cago = "";
		
		switch(category) {
		case 1:
			cago = "인문";
			break;
		case 2:
			cago = "자연과학";
			break;
		case 3:
			cago = "의료";
			break;
		case 4:
			cago = "기타";
			break;
		}
		
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + cago + ", author=" + author + "]";
	}
	
	
}
