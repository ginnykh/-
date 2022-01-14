package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.ReplyDTO;

public interface ReplyMapper {
	// 댓글 쓰기 설계

	public int write(ReplyDTO rdto);
	
	public ArrayList<ReplyDTO> list(int bno);
	
	public ReplyDTO detail(int rno);
	// 댓글 수정 설계
	// update 성공시 ReplyMapper.xml로 부터 1
	// update 성공시 ReplyMapper.xml로 부터 0
	// 값을 리턴받는다.
	public int update(ReplyDTO rdto);
	public int remove(ReplyDTO rdto);
}
