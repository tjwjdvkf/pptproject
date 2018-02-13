package com.sjh.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;

	@Override
	public List<BoardVO> boardList(BoardVO boardVO) {
		return dao.boardList(boardVO);
	}

	@Override
	public void boardSave(BoardVO boardVO) {
		dao.boardSave(boardVO);
		
	}


}
