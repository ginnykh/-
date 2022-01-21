package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;

public interface filmlogMapper {
	
	// 게시판 글쓰기
	public void write(FilmDTO film);
	// 게시판 목록
	public ArrayList<FilmDTO> boardlist(filmCriteria fcri);
	// 게시판 페이징에 쓰일 전체 건수
	public int getTotalCount(Criteria cri);
	
	
}
