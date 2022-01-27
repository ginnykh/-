package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.FilmReplyDTO;

public interface FilmReplyMapper {
	// 댓글 쓰기 설계

	public int write(FilmReplyDTO frdto);
	
	public ArrayList<FilmReplyDTO> list(int bno);
	
	public FilmReplyDTO detail(int rno);
	// 댓글 수정 설계
	// update 성공시 ReplyMapper.xml로 부터 1
	// update 성공시 ReplyMapper.xml로 부터 0
	// 값을 리턴받는다.
	public int update(FilmReplyDTO frdto);
	public int remove(FilmReplyDTO frdto);
}
