package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.FilmReplyDTO;

public interface FilmReplyService {
	// 댓글 쓰기 설계
	public int write(FilmReplyDTO frdto);
	// 댓글 목록리스트 설계
	public ArrayList<FilmReplyDTO> list(int bno);
	// 댓글수정을 하기 위해 댓글내용 가져오기
	public FilmReplyDTO detail(int rno);
	// 댓글수정 설계
	public int update(FilmReplyDTO frdto);
	// 댓글 삭제 설계
	public int remove(FilmReplyDTO frdto);
}
