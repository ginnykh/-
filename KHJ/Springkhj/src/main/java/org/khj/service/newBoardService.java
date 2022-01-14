package org.khj.service;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.newBoardDTO;

public interface newBoardService {
	
	public void write(newBoardDTO board);
	public ArrayList<newBoardDTO> list (Criteria cri);
	
	public int getTotalCount(Criteria cri);
}
