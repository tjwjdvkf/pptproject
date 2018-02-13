package com.sjh.board;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession session;

	@Override
	public List<BoardVO> boardList(BoardVO boardVO) {
		return session.selectList("boardList",boardVO);
	}

	@Override
	public void boardSave(BoardVO boardVO) {
		session.insert("boardSave",boardVO);
	}


}
