package org.khj.controller;

import java.util.ArrayList;

import org.khj.domain.AttachFileDTO;
import org.khj.domain.BoardDTO;
import org.khj.domain.Criteria;
import org.khj.domain.PageDTO;
import org.khj.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("board")
public class BoardController {
	@Autowired
	// private BoardService service = new BoardService();
	private BoardService service;
	// 글쓰기 화면으로....
	@GetMapping("write")
	public void write() {
	// System.out.println("board/write");
	}
	// 글쓰기 버튼을 클릭하면...
	@PostMapping("write")
	public String writePost(BoardDTO board) {
		System.out.println("write post....."+board);
		service.write(board);
		
		return "redirect:/board/list";
	}
	// 게시판 목록 리스트
	@GetMapping("list")
	public void list(Criteria cri, Model model) { // pageNum이랑 amount가 Criteria에 저장
//		System.out.println("board/list");
		model.addAttribute("list", service.list(cri));	
		int total = service.getTotalCount(cri); // 바로 넣어도 상관없음
		model.addAttribute("pageMaker",new PageDTO(cri, total));
	}
	// 게시판 목록 리스트에서 제목을 클릭하면....
	@GetMapping("detail")
	public void detail(BoardDTO board,Model model) {
		model.addAttribute("detail",service.detail(board));
	}
	
	
	// /board/fileList/210.json
	// 게시판 상세페이지에서 이미지를 출력하기 위한 select된 결과를 javascript로
	@GetMapping(value = "fileList/{bno}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ArrayList<AttachFileDTO>> fileList(@PathVariable int bno){
//		System.out.println("fileList");
		return new ResponseEntity<>(service.fileList(bno),HttpStatus.OK);
	}
	
	// 글수정 화면으로....
	@GetMapping("modify")
	public void modify(BoardDTO board,Model model) {
		model.addAttribute("detail",service.detail(board));
//		System.out.println("board/modify");
	}
	// 글수정 버튼을 클릭하면.....
	@PostMapping("modify")
	public String modifyPost(BoardDTO board,RedirectAttributes rttr) {
		System.out.println(board);
		//update
		service.modify(board);
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/detail";
	}
	// 글삭제 버튼을 클릭하면.....
	@GetMapping("remove")
	public String remove(BoardDTO board) {
		System.out.println(board);
		service.remove(board);
		return "redirect:/board/list";
	}	
}





