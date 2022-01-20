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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("newBoard")
public class newBoardController {
	
	@Autowired
	private newBoardService service;
	@GetMapping("write")
	public void write() {
	}
	
	@PostMapping("write")
	public String writePost(newBoardDTO nboard) {
		service.write(nboard);
		return "redirect:/newBoard/list";
	}
	
	@GetMapping("list")
	public void list(Criteria cri, Model model) {
		model.addAttribute("list", service.list(cri));
		int total = service.getTotalCount(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("detail")
	public void detail(newBoardDTO nboard,Model model) {
		model.addAttribute("detail",service.detail(nboard));
	}
	
	@GetMapping("modify")
	public void modify(newBoardDTO nboard,Model model) {
		model.addAttribute("detail",service.detail(nboard));
	}
	
	@PostMapping("modify")
	public String modifyPost(newBoardDTO nboard,RedirectAttributes rttr) {
		//update
		service.modify(nboard);
		rttr.addAttribute("bno", nboard.getBno());
		return "redirect:/newBoard/detail";
	}

}
