package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.BoardDTO;
import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;
import org.khj.mapper.filmlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class filmlogServicelmpl implements filmlogService{

	@Autowired
	private org.khj.mapper.filmlogMapper fmapper;
	
	@Transactional
	// 게시판 글쓰기 설계된것을 구현
	public void write(FilmDTO film) {
		fmapper.write(film);
	}
	
	// 게시판 목록리스트 설계된것을 구현
	public ArrayList<FilmDTO> boardlist(filmCriteria fcri){
		return fmapper.boardlist(fcri);
	}
	
	// 게시판 페이징에 쓰일 데이터건수
		public int getTotalCount(filmCriteria fcri) {
			return fmapper.getTotalCount(fcri);
	}
		
	// 게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지 설계된것을 구현
	@Transactional
	public FilmDTO detail(FilmDTO film) {
		// board테이블의 조회수 속성에  + 1
		fmapper.cntupdate(film);
		// 상세페이지 select
		return fmapper.detail(film);
	}	
	
	
	// 게시판 글수정 설계된것을 구현
	public void modify(FilmDTO film) {
		fmapper.modify(film);
	}
	// 게시판 글삭제 설계된것을 구현
	public void remove(FilmDTO film) {
		fmapper.remove(film);
	}
	
}
