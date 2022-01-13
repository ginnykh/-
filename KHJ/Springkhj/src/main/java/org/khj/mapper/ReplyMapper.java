package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.ReplyDTO;

public interface ReplyMapper {
	// 댓글 쓰기 설계

	public int write(ReplyDTO rdto);
	
	public ArrayList<ReplyDTO> list(int bno);
	
	public ReplyDTO detail(int rno);
}
