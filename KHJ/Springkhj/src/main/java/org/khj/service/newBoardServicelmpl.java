package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.newBoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class newBoardServicelmpl implements newBoardService{

	@Autowired
	private org.khj.mapper.newBoardMapper nmapper;
	
	public void write(newBoardDTO board) {
		nmapper.write(board);
	}
	
	public ArrayList<newBoardDTO> list(Criteria cri){
		return nmapper.list(cri);
	}
	
	
	public int getTotalCount(Criteria cri) {
		return nmapper.getTotalCount(cri);
	}
	
}
