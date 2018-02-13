package com.sjh.board;

import java.util.List;

public interface BoardDAO {
	//게시판 리스트
	public List<BoardVO> boardList(BoardVO boardVO);
	//게시판 작성
	public void boardSave(BoardVO boardVO);

}
