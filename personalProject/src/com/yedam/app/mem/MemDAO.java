package com.yedam.app.mem;

import java.util.List;



public interface MemDAO {

	// 전체회원조회
	List<MemVO> selectAll();

	// 특정회원조회
	MemVO selectOne(MemVO memVO);

	// 회원등록
	void insert(MemVO memVO);

	// 회원수정
	void update(MemVO memVO);

	// 회원삭제
	void delete(int memVO);

}
