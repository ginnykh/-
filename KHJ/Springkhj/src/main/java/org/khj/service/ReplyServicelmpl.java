package org.khj.service;

import org.khj.domain.ReplyDTO;
import org.khj.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReplyServicelmpl implements ReplyService{
	@Autowired
	private ReplyMapper rmapper;
	// 게시판 글쓰기 설계된것을 구현
	public void write(ReplyDTO rdto) {
		rmapper.write(rdto);
		
		
	}
	
	
}
