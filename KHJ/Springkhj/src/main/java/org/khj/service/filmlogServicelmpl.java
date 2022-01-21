package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.FilmDTO;
import org.khj.domain.filmCriteria;
import org.khj.mapper.filmlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class filmlogServicelmpl implements filmlogService{

	@Autowired
	private filmlogMapper fmapper;
	
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
		public int getTotalCount(Criteria cri) {
			return fmapper.getTotalCount(cri);
	}
}
