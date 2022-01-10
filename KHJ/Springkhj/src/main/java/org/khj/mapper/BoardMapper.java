package org.khj.mapper;

import java.util.ArrayList;

import org.khj.domain.BoardDTO;
import org.khj.domain.Criteria;

public interface BoardMapper {
	//寃뚯떆�뙋 湲��벐湲곗� 愿��젴�씠 �릺�뼱 �엳�뒗 DB�옉�뾽�뿉 �꽕怨�
	public void write(BoardDTO board);
	//寃뚯떆�뙋 紐⑸줉由ъ뒪�듃�� 愿��젴�씠 �릺�뼱 �엳�뒗 DB�옉�뾽�뿉 �꽕怨�
	public ArrayList<BoardDTO> list(Criteria cri);
	// 寃뚯떆�뙋 紐⑸줉由ъ뒪�듃�뿉�꽌 �젣紐⑹쓣 �겢由��뻽�쓣 �븣 �궡�슜�씠 �굹�삤�뒗 �긽�꽭�럹�씠吏��� 愿��젴 �릺�뼱 �엳�뒗 DB�옉�뾽 �꽕怨�
	public BoardDTO detail(BoardDTO board);
	// 게시판 목록리스트에서 제목을 클릭했을 대 조회수 +1
	public void cntupdate(BoardDTO board);
	//寃뚯떆�뙋 湲��닔�젙怨� 愿��젴�씠 �릺�뼱 �엳�뒗 DB�옉�뾽�뿉 �꽕怨�
	public void modify(BoardDTO board);
	//寃뚯떆�뙋 湲��궘�젣怨� 愿��젴�씠 �릺�뼱 �엳�뒗 DB�옉�뾽�뿉 �꽕怨�
	public void remove(BoardDTO board);
}
