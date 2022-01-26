package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.FilmAttachFileDTO;
import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;
import org.springframework.transaction.annotation.Transactional;

public interface filmlogService {

	// 게시판 글쓰기 설계
	public void write(FilmDTO film);
	// 게시판 목록 리스트 설계
	public ArrayList<FilmDTO> boardlist(filmCriteria fcri);
	// 게시판 페이징에 쓰일 데이터건수
	public int getTotalCount(filmCriteria fcri);
	// 게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지
	public FilmDTO detail(FilmDTO film);
	// 게시판 수정페이지
	public void modify(FilmDTO film);
	// 게시판 삭제페이지
	public void remove(FilmDTO film);
	// 게시판 상세페이지에 파일업로드된 이미지 출력
	public ArrayList<FilmAttachFileDTO> fileList(int bno);
		
}
