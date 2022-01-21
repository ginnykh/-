package org.khj.controller;

import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;
import org.khj.service.filmlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("filmlog")
public class filmlogController {
	
	@Autowired
	private filmlogService fservice;
	
	// 글쓰기 화면으로
	@GetMapping("write")
	public void write() {
		System.out.println("write");
	}
	
	// 글쓰기 버튼을 클릭하면 목록으로 가기
	@PostMapping("write")
	public String writePost(FilmDTO film) {
		fservice.write(film);
		return "redirect:/filmlog/boardlist";
	}
	
	// 게시판 목록
	@GetMapping("boardlist")
	public void boardlist (filmCriteria fcri , Model model) {
		model.addAttribute("boardlist",fservice.boardlist(fcri));
		int total = fservice.getTotalCount(fcri);
		model.addAttribute("pageMaker", new FilmDTO(fcri, total));
	}
	
}
