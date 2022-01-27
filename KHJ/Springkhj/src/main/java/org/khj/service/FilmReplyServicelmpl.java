package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.FilmReplyDTO;
import org.khj.mapper.FilmReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FilmReplyServicelmpl implements FilmReplyService{
	@Autowired
	private FilmReplyMapper frmapper;
	// 게시판 글쓰기 설계된것을 구현
	public int write(FilmReplyDTO frdto) {
		System.out.println("FilmReplyServiceImpl="+frdto);
		// insert 성공시 ReplyMapper.xml로 부터 1
		// insert 실패시 ReplyMapper.xml로 부터 0
		// 값을 리턴받는다.
		return frmapper.write(frdto);
	}
	
	// 댓글 목록리스트 설계된것을 구현
	public ArrayList<FilmReplyDTO> list(int bno) {
		return frmapper.list(bno);
	}
	
	// 댓글 수정을 하기 위해 댓글내용 가져오기 
	public FilmReplyDTO detail(int rno) {
		return frmapper.detail(rno);
	}
	// 댓글수정 설계된것을 구현
	public int update(FilmReplyDTO frdto) {
		return frmapper.update(frdto);
	}
	// 댓글 삭제 설계된것을 구현
	public int remove(FilmReplyDTO frdto) {
		return frmapper.remove(frdto);
	}
	
}
