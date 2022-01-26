package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.FilmAttachFileDTO;
import org.khj.domain.FilmDTO;

public interface FilmAttachMapper {
	// 게시판 글쓰기 할때 파일과 관련되어 있는 attach테이블에 insert
	public void finsert(FilmAttachFileDTO film);
	// 게시판 상세페이지에 업로드된 이미지를 부리기위한 데이터 list
	public ArrayList<FilmAttachFileDTO> fileList(int bno);
	
}
