package org.khj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class filmlogController {
	private static final Logger logger = LoggerFactory.getLogger(filmlogController.class);
	@RequestMapping(value = "filmlog/boardIndex", method = RequestMethod.GET)
	public String boardIndex() {
		return "boardIndex";
	}
	
	@RequestMapping(value = "filmlog/boardList", method = RequestMethod.GET)
	public String boardList() {
		return "boardList";
	}
	
	@RequestMapping(value = "filmlog/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "filmlog/memberIndex", method = RequestMethod.GET)
	public String memberIndex() {
		return "memberIndex";
	}
	
	@RequestMapping(value = "filmlog/writeIndex", method = RequestMethod.GET)
	public String writeIndex() {
		return "writeIndex";
	}
	
	@RequestMapping(value = "filmlog/footer", method = RequestMethod.GET)
	public String footer() {
		return "footer";
	}
	
	
}