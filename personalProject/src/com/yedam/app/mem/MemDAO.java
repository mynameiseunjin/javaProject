package com.yedam.app.mem;

import java.util.List;



public interface MemDAO {

	// 전체회원조회
	List<MemVO> selectAll();
	// 특정회원조회
	MemVO selectOne(MemVO memVO);

	// 회원등록
	void insertMem(MemVO memVO);

	// 회원수정
	void updateMem(MemVO memVO);

	// 회원삭제
	void deleteMem(int memVO);
	
	//로그인
	MemVO loginInfo(MemVO inputInfo);
}
