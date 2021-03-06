package org.khj.controller;

import org.khj.domain.SampleMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value = "sample", method = RequestMethod.GET) // GET은 속도는 빠르지만 보안이 좋지않음, url에 다 노출 <-> POST
	public void basic() {
		logger.info("sample 실행됨.");
		
	}
	@RequestMapping(value = "sample/ex01", method = RequestMethod.GET) // GET은 속도는 빠르지만 보안이 좋지않음, url에 다 노출 <-> POST
	public String basic1() {
		logger.info("sample/ex01 실행됨.");
		return "ex01";
		
	}
	
	@RequestMapping(value = "sample/index", method = RequestMethod.GET) // value값 겹치며 안 됨
	public String index() {
		 return "index"; // return타입을 쓰지 않을때는 view에 sample 폴더를 만들어서 index를 넣어줘야 함
	}
	
	@RequestMapping(value = "sample/member", method = RequestMethod.GET)
	public String member(String id, String pw, String name) {
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		System.out.println("name = " + name);
		return "member";
	}
	
	@RequestMapping(value ="sample/memberDTO", method = RequestMethod.GET)
	public void memberdto(SampleMemberDTO smd) {
		System.out.println("id = " + smd.getId());
		System.out.println("pw = " + smd.getPw());
		System.out.println("name = " + smd.getName());
	}
	
}
