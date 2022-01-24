package org.khj.controller;

import org.khj.domain.FilmDTO;
import org.khj.domain.FilmPageDTO;
import org.khj.domain.filmCriteria;
import org.khj.service.filmlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		model.addAttribute("pageMaker", new FilmPageDTO(fcri, total));
	}
	
	
		// 게시판 목록 리스트에서 제목을 클릭하면
		@GetMapping("detail")
		public void detail(FilmDTO film,Model model) {
			model.addAttribute("detail",fservice.detail(film));
		}
		
		
		// 글수정 화면
		@GetMapping("modify")
		public void modify(FilmDTO film,Model model) {
			model.addAttribute("detail",fservice.detail(film));
		}
		
		// 글수정 버튼을 클릭
		@PostMapping("modify")
		public String modifyPost(FilmDTO film,RedirectAttributes rttr) {
			// update
			fservice.modify(film);
			rttr.addAttribute("bno", film.getBno());
			return "redirect:/filmlog/detail";
		}
		
		// 글삭제 버튼을 클릭
		@GetMapping("remove")
		public String remove(FilmDTO film) {
			fservice.remove(film);
			return "redirect:/filmlog/boardlist";
		}	
		
}
