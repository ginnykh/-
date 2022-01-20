package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.newBoardDTO;

public interface newBoardService {
	
	public void write(newBoardDTO nboard);
	
	public ArrayList<newBoardDTO> list (Criteria cri);
	
	public int getTotalCount(Criteria cri);
	
	public newBoardDTO detail(newBoardDTO nboard);
	
	public void modify(newBoardDTO nboard);
}
