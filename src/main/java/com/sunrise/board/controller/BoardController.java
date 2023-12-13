package com.sunrise.board.controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;


import com.sunrise.board.vo.BoardVO;

import oracle.jdbc.proxy.annotation.Post;

import com.sunrise.board.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService bbService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String board(Locale locale, Model model) {
		
		List<BoardVO> list = bbService.boardList();
		model.addAttribute("list",list);
		
		return "boardList";
	}
	
	/* AJAX */
	@RequestMapping(value = "/totalChecker", produces = "application/json; charset=utf8")
	@ResponseBody
	public int totalCheck(@RequestParam("param") String parameter) {
		int result = 0;
		result = bbService.totalCheckerLogic(parameter);
		return result;
	}
	
	@RequestMapping(value = "/write",method = RequestMethod.GET)
	public String write() throws Exception {
		return "boardWrite";
	} 
	
	@PostMapping(value = "/insert")
	public String insert(BoardVO boardVO) throws Exception{
		bbService.insertList(boardVO);
		//return "redirect:/boardList";
		return "redirect:list";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model, int boardNum) throws Exception{
	//public String detail(Model model) throws Exception{	
		BoardVO boardVO = bbService.detail(boardNum);
		
		model.addAttribute("boardVO", boardVO);
		return "detail";
	}
	
	//게시물 수정 페이지로 이동 
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String getUpdate(BoardVO boardVO, Model model, int boardNum) throws Exception {
	//public String getUpdate(Model model) throws Exception{		
	//	BoardVO boardVO = bbService.detail(boardNum);
		model.addAttribute("boardVO", bbService.detail(boardNum));
		return "boardUpdate";
	} 	 
	
	//게시글 수정 
	//@RequestMapping(value = "/update", method = RequestMethod.POST)
	@PostMapping(value = "/update")
	public String postUpdate(BoardVO boardVO) throws Exception { 
		bbService.update(boardVO);
		return "redirect:list";
	}
	
	@PostMapping(value = "/delete")
	public String delete(BoardVO boardVO) throws Exception {
		bbService.delete(boardVO.getBOARD_NUM());
		return "redirect:list";
	}
}
