package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;

public interface filmlogMapper {
	
	// 게시판 글쓰기
	public void write(FilmDTO film);
	// 게시판 목록
	public ArrayList<FilmDTO> boardlist(filmCriteria fcri);
	// 게시판 페이징에 쓰일 전체 건수
	public int getTotalCount(filmCriteria fcri);
	public FilmDTO detail(FilmDTO film);
	public void cntupdate(FilmDTO film);
	// 게시판 글수정과 관련이 되어 있는 DB작업에 설계
	public void modify(FilmDTO film);
	// 게시판 글삭제와 관련이 되어 있는 DB작업에 설계
	public void remove(FilmDTO film);
	public void insertSelectKey(FilmDTO film);
}
