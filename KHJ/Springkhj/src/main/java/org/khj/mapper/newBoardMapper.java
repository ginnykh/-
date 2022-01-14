package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.Criteria;
import org.khj.domain.newBoardDTO;

public interface newBoardMapper {

	public void write(newBoardDTO board);
	
	public ArrayList<newBoardDTO> list(Criteria cri);
	
	public int getTotalCount(Criteria cri);
	
}


