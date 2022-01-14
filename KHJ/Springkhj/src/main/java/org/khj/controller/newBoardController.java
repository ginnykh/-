package org.khj.controller;

import org.khj.domain.Criteria;
import org.khj.domain.PageDTO;
import org.khj.domain.newBoardDTO;
import org.khj.service.newBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("newBoard")
public class newBoardController {
	
	@Autowired
	private newBoardService service; 
	@GetMapping("write")
	public void write() {
		System.out.println("board/write");
	}
	
	@PostMapping("write")
	public String writePost(newBoardDTO board) {
		service.write(board);
		return "redirect:/newBoard/list";
	}
	
	@GetMapping("list")
	public void list(Criteria cri, Model model) {
		model.addAttribute("list", service.list(cri));
		int total = service.getTotalCount(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}

}
