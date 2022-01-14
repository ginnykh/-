package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.ReplyDTO;
import org.khj.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReplyServicelmpl implements ReplyService{
	@Autowired
	private ReplyMapper rmapper;
	// 게시판 글쓰기 설계된것을 구현
	public int write(ReplyDTO rdto) {
		// insert 성공시 ReplyMapper.xml로 부터 1
		// insert 실패시 ReplyMapper.xml로 부터 0
		// 값을 리턴받는다.
		return rmapper.write(rdto);
	}
	
	// 댓글 목록리스트 설계된것을 구현
	public ArrayList<ReplyDTO> list(int bno) {
		return rmapper.list(bno);
	}
	
	// 댓글 수정을 하기 위해 댓글내용 가져오기 
	public ReplyDTO detail(int rno) {
		return rmapper.detail(rno);
	}
	// 댓글수정 설계된것을 구현
	public int update(ReplyDTO rdto) {
		return rmapper.update(rdto);
	}
	// 댓글 삭제 설계된것을 구현
	public int remove(ReplyDTO rdto) {
		return rmapper.remove(rdto);
	}
	
}
