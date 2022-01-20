package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.AttachFileDTO;
import org.khj.domain.BoardDTO;
import org.khj.mapper.AttachMapper;
import org.khj.mapper.BoardMapper;
import org.khj.domain.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private org.khj.mapper.BoardMapper bmapper;
	@Autowired
	private AttachMapper amapper;
	
	@Transactional
	// 게시판 글쓰기 설계된것을 구현
	public void write(BoardDTO board) {
		// 제목과 내용을 board테이블에 insert
		bmapper.insertSelectKey(board);
		// 파일명, 파일경로, 파일타입, uuid값을 attach테이블에 insert
// BoardDTO에 있는 AttachList를 가져와서 반복문으로 실행하여 attach변수에 저장
		board.getAttachList().forEach(attach->{
			// BoardDTO의 bno값을 가져와서 AttachFileDTO에 bno에 저장
			attach.setBno(board.getBno());
			amapper.insert(attach);
		});
	}
	
	
	
	// 게시판 목록리스트 설계된것을 구현
	public ArrayList<BoardDTO> list(Criteria cri) {
		return bmapper.list(cri);
	}
	// 게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지 설계된것을 구현
	@Transactional
	public BoardDTO detail(BoardDTO board) {
		// board테이블의 조회수 속성에  + 1
		bmapper.cntupdate(board);
		// 상세페이지 select
		return bmapper.detail(board);
	}
	// 게시판 글수정 설계된것을 구현
	public void modify(BoardDTO board) {
		bmapper.modify(board);
	}
	// 게시판 글삭제 설계된것을 구현
	public void remove(BoardDTO board) {
		bmapper.remove(board);
	}
	// 게시판 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri) {
		return bmapper.getTotalCount(cri);
	}
	public ArrayList<AttachFileDTO> fileList(int bno){
		return amapper.fileList(bno);
		
	}
}
