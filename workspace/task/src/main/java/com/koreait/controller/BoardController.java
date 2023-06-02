package com.koreait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.koreait.domain.BoardVO;
import com.koreait.domain.Criteria;
import com.koreait.domain.PageDTO;
import com.koreait.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
	private BoardService service;
	
	@GetMapping("/boardList")
	public void boardList(Criteria cri,Model model) {
		model.addAttribute("list", service.getBoardList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, service.getTotal(cri)));
	}
	
	@GetMapping({"/boardView","/modify"})
	public void boardView(@RequestParam("bno") Long bno,Model model,@ModelAttribute("cri") Criteria cri) {
		BoardVO board = service.getBoard(bno);
		model.addAttribute("bno",bno);
		model.addAttribute("title", board.getTitle());
		model.addAttribute("content", board.getContent());
		model.addAttribute("writer", board.getWriter());
		model.addAttribute("regDate", board.getRegDate());
		model.addAttribute("updateDate", board.getUpdateDate());
	}
	
	@GetMapping("/boardWrite")
	public void boardWrite(@ModelAttribute("cri") Criteria cri) {}
	
	@PostMapping("/boardWrite")
	public String boardWrite(BoardVO board, RedirectAttributes rttr) {
		if(service.boardWrite(board)) {
			rttr.addAttribute("result",board.getBno());
		}
		return "redirect:/board/boardList";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr,@ModelAttribute("cri") Criteria cri) {
		if(service.modify(board)) {
			rttr.addFlashAttribute("bno", board.getBno());
			rttr.addFlashAttribute("result", "updateOk");
		}
		return "redirect:/board/boardList"+cri.getListLink();
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam("bno") Long bno,@ModelAttribute("cri") Criteria cri,RedirectAttributes rttr) {
		if(service.remove(bno)) {
			rttr.addFlashAttribute("bno",bno);
			rttr.addFlashAttribute("result", "deleteOk");
		}
		return "redirect:/board/boardList"+cri.getListLink();
	}
}
