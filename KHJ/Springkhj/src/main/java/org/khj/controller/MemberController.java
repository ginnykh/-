package org.khj.controller;

import javax.servlet.http.HttpSession;

import org.khj.domain.memberDTO;
import org.khj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberService mservice;
	
	// 회원가입 화면 이동
	@GetMapping("member")
	public void write() {
		System.out.println("board/write");
	}
	// 회원가입 화면을 통해 얻어진 데이터 insert
	@PostMapping("member")
	public void Postmember(memberDTO mdto) {
		mservice.insert(mdto);
	}
	
	// 로그인 화면 이동
	@GetMapping("login")
	public void login() {
		System.out.println("member/login");
	}
	// 로그인 화면을 통해 얻어진 데이터를 활용하여 select
	@PostMapping("login")
	public String postLogin(memberDTO mdto, HttpSession session) {
		memberDTO login = mservice.login(mdto);
		
		// memberDTO에 있는 memberDTO [id = hungry, password = qorhvk, name = 배고파]를 세션 영역의 login이라는 변수에 저장
		// 세션객체 (session)의 login변수에, login갑승ㄹ 저장 ( setAttribute )
		session.setAttribute("login", login);
		
//		session.invalidate(); // 로그아웃
		
		// session영역의 login이라는 변수에 값이 있으면 로그인 된 채로
		if(session.getAttribute("login") != null) {
			// main페이지로 이동
			return "redirect:/";
		}else { // session영역의 login이라는 변수에 값이 없으면 ( null )
			// 다시 로그인 할 수 있게 로그인 페이지로 이동
			return "redirect:/member/login";
			
		}	
	}
}
