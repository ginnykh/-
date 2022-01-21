package org.khj.service;

import org.khj.domain.memberDTO;

public interface MemberService {
	// 회원가입하기 설계
	public void insert(memberDTO mdto);
	// 로그인 설계
	public memberDTO login(memberDTO mdto);
}
