package com.sjh.board;

import java.util.List;

public interface BoardService {
	//�Խ��� ����Ʈ
	public List<BoardVO> boardList(BoardVO boardVO);
	//�Խ��� �ۼ�
	public void boardSave(BoardVO boardVO);
}
