package org.khj.controller;

import org.khj.domain.boardDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class boardController {
	@GetMapping("write")
	public void write() {
		System.out.println("board/write");
	}
	@PostMapping("write") // GetMapping으로 주면 오류 뜸, 근데 메소드 방식이 달라서 value값이 같아도 PostMapping은 가능
	public void writePost(boardDTO board) {
		System.out.println("write post......" + board);
		
	}
}
