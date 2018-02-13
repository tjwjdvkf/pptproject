package com.sjh.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardCotroller {
	
	@Inject
	private BoardService service;

	@RequestMapping(value="/boardList.do", method=RequestMethod.GET)
	public String boardList(BoardVO boardVO, Model model) {
		
		List<BoardVO> list = service.boardList(boardVO);
		model.addAttribute("list", list);
		
		return "board/boardlist";
	}
	
	@RequestMapping(value="/boardWrite.do", method=RequestMethod.GET)
	public String boardWrite() {
		return "board/boardwrite";
	}
	
	@RequestMapping(value="/boardSave.do", method=RequestMethod.POST)
	 public String boardSave(BoardVO boardVO) {
		
		service.boardSave(boardVO);
		
		return "redirect:boardList.do";
	}
	
	
	
}

