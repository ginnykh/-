package org.khj.controller;

import org.khj.domain.RestSampleDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class RestSampleController {
	// 단순 문자열을 반환
	@GetMapping(value = "getText", produces = "text/plain; charset=UTF-8")
	public String getText() {
		
		return "안녕하세여푸항항";
		
	}
	// 객체 반환                                          // produces 생략 가능
	@GetMapping(value = "getSample", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
	public RestSampleDTO getSample() {
		// RestSampleDTO rs = new RestSampleDTO(100,"정","자바");
		// return rs; 이 두 줄이 아래 한 줄과 같음
		return new RestSampleDTO(100,"정","자바"); 
	}
	
	
	
}
