package com.uni.khh.chap15.hw2.run;

import com.uni.khh.chap15.hw2.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}

}
