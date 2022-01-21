package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;

public interface filmlogService {

	// 게시판 글쓰기 설계
	public void write(FilmDTO film);
	// 게시판 목록 리스트 설계
	public ArrayList<FilmDTO> boardlist(filmCriteria fcri);
	// 게시판 페이징에 쓰일 데이터건수
	public int getTotalCount(filmCriteria fcri);
	
}
