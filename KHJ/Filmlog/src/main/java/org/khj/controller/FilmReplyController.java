package org.khj.controller;

import java.util.ArrayList;

import org.khj.domain.FilmReplyDTO;
import org.khj.service.FilmReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Filmreplies")
public class FilmReplyController {
	@Autowired
	private FilmReplyService frservice;
	@PostMapping(value = "new", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody FilmReplyDTO frdto){
		System.out.println("ReplyDTO = " + frdto);
		// insert 성공시 ReplyMapper.xml로 부터 1
		// insert 실패시 ReplyMapper.xml로 부터 0
		int result = frservice.write(frdto); 
		System.out.println(frdto.getBno());
		return result == 1?new ResponseEntity<>("success",HttpStatus.OK) // insert가 정상적으로 처리되었을 때, 
				:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // insert가 비정상적으로 처리되었을 때,
	}
	
	@GetMapping(value = "list/{bno}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ArrayList<FilmReplyDTO>> getList(@PathVariable int bno){ // @PathVariable : REST방식에서 주로 사용, URL 경로의 일부를 파라미터 사용하고자 할 때
		System.out.println(bno);
		return new ResponseEntity<>(frservice.list(bno),HttpStatus.OK);
	}
	// 댓글수정을 하기 위해 댓글내용 가져오기
	@GetMapping(value = "{rno}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<FilmReplyDTO> getDetail(@PathVariable int rno){ 
		System.out.println(rno);
		return new ResponseEntity<>(frservice.detail(rno),HttpStatus.OK);
	}
	
	@PutMapping(value = "update",consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	
	public ResponseEntity<String> update(@RequestBody FilmReplyDTO frdto){
		System.out.println("rdto = "+frdto);
		// int result = 1;
		return frservice.update(frdto) == 1?new ResponseEntity<>("success",HttpStatus.OK) // update가 정상적으로 처리되었을 때, 
		:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // update가 비정상적으로 처리되었을 때,
	}
	
	@DeleteMapping(value = "remove",consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@RequestBody FilmReplyDTO frdto){
		System.out.println("rdto = "+frdto);
		return frservice.remove(frdto) == 1?new ResponseEntity<>("success",HttpStatus.OK) // remove가 정상적으로 처리되었을 때, 
		:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // remove가 비정상적으로 처리되었을 때,
	}
	
	
}
