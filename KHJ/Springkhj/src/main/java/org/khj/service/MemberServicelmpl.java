package org.khj.service;

import org.khj.domain.memberDTO;
import org.khj.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServicelmpl implements MemberService {
	@Autowired
	private MemberMapper mmapper;
	// 회원가입하기 설계된것을 구현
	public void insert(memberDTO mdto) {
		mmapper.insert(mdto);
	}
	// 로그인 설계된것을 구현
	public memberDTO login(memberDTO mdto) {
		return mmapper.login(mdto);
	}
}
