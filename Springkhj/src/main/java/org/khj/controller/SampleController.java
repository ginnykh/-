package org.khj.controller;

import org.khj.domain.SampleMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample")
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// @RequestMapping(value = "sample", method = RequestMethod.GET) // GET�� �ӵ��� �������� ������ ��������, url�� �� ���� <-> POST
	@GetMapping("") // ���� ������ ����ؼ� ��� ����
	public void basic(Model model) {
		logger.info("sample �����.");
		// aaaa문자열을 abcd변수에 저장하여 sample.jsp에 보내기
		model.addAttribute("abcd", "aaaa");
		
	}
	// @RequestMapping(value = "sample/ex01", method = RequestMethod.GET) // GET�� �ӵ��� �������� ������ ��������, url�� �� ���� <-> POST
	@GetMapping("ex01")
	public String basic1(Model model) {
		logger.info("sample/ex01 �����.");
		
		// bbbb문자열을 zzzz변수에 저장하여 sample.jsp에 보내기
		model.addAttribute("zzzz", "bbbb");
		return "ex01";
		
	}
	
	// @RequestMapping(value = "sample/index", method = RequestMethod.GET) // value�� ��ġ�� �� ��
	@GetMapping("index")
	public String index(Model mod) { // model 변수 이름은 내 맘대로 줘도 ㄱㅊ
		// cccc문자열을 yyyy변수에 저장하여 sample.jsp에 보내기
		mod.addAttribute("yyyy", "cccc");
		 return "index"; // returnŸ���� ���� �������� view�� sample ������ ���� index�� �־���� ��
	}
	
	// @RequestMapping(value = "sample/member", method = RequestMethod.GET)
	@GetMapping("member")
	public String member(String id, String pw, String name, Model model) {
		System.out.println("id = " + id);
		model.addAttribute("id", id);
		System.out.println("pw = " + pw);
		model.addAttribute("pw", pw);
		System.out.println("name = " + name);
		model.addAttribute("name", name);
		
		// id값을 id변수에 저장하여 member.jsp에 보내기
		// pw값을 pw변수에 저장하여 member.jsp에 보내기
		// name값을 name변수에 저장하여 member.jsp에 보내기
	
		
		return "member";
	}
	
	// @RequestMapping(value ="sample/memberDTO", method = RequestMethod.POST)
	@PostMapping("memberDTO")
	public String memberdto(SampleMemberDTO smd, Model model) {
		System.out.println("id = " + smd.getId());
		System.out.println("pw = " + smd.getPw());
		System.out.println("name = " + smd.getName());
		model.addAttribute("id", smd);
		model.addAttribute("pw", smd);
		model.addAttribute("name", smd);
		
		return "memberDTO";
//		return "redirect:/"; // 넘기려고 하는 Controller의 value값으로 넣어주기
//		return "redirect:/sample/member"; // 같은 Controller내에서도 가능
		
		// SampleMemberDTO값을 id변수에 저장하여 index.jsp에 보내기 ( post방식을 get으로 바꾸거나 그 반대, 근데 get은 보안성이 떨어져서 post로 할것 )
		
	}
	
}
