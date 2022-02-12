package com.uni.khh.chap16.silsub1.model.comparator;

import java.util.Comparator;

import com.uni.khh.chap16.silsub1.model.vo.Board;

public class DescBoardNo implements Comparator<Board> {
	
	@Override
	public int compare(Board o1, Board o2) {

		return o1.getBoardNo() - o2.getBoardNo();
	}

}
