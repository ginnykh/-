package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.newBoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class newBoardServicelmpl implements newBoardService{

	@Autowired
	private org.khj.mapper.newBoardMapper nmapper;
	
	public void write(newBoardDTO nboard) {
		nmapper.write(nboard);
	}
	
	public ArrayList<newBoardDTO> list(Criteria cri){
		return nmapper.list(cri);
	}
	
	
	public int getTotalCount(Criteria cri) {
		return nmapper.getTotalCount(cri);
	}
	
	@Transactional
	public newBoardDTO detail(newBoardDTO nboard) {
		// board테이블의 조회수 속성에  + 1
		nmapper.cntupdate(nboard);
		// 상세페이지 select
		return nmapper.detail(nboard);
	}
	
	public void modify(newBoardDTO nboard) {
		nmapper.modify(nboard);
	}
	
}
