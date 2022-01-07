package org.khj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// @RequestMapping("filmlog") 하면 아래 value값들의 filmlog/ 안 쓰고 통합적으로 할 수 있음
public class filmlogController {
	private static final Logger logger = LoggerFactory.getLogger(filmlogController.class);
	@RequestMapping(value = "filmlog/boardIndex", method = RequestMethod.GET)
	public void boardIndex() {
	}
	
	@RequestMapping(value = "filmlog/boardList", method = RequestMethod.GET)
	public void boardList() {
	}
	
	@RequestMapping(value = "filmlog/login", method = RequestMethod.GET)
	public void login() {
	}
	
	@RequestMapping(value = "filmlog/memberIndex", method = RequestMethod.GET)
	public void memberIndex() {
	}
	
	@RequestMapping(value = "filmlog/writeIndex", method = RequestMethod.GET)
	public void writeIndex() {
	}
	
//	@RequestMapping(value = "filmlog/footer", method = RequestMethod.GET)
//	public void footer() {
//	}
//	
//	@RequestMapping(value = "filmlog/header", method = RequestMethod.GET)
//	public void header() {
//	}
	
}
