package List;

import java.util.List;

public interface LiDAO {

	//수강등록기능 만들기
	
	// 전체회원조회
		List<LiVO> selectAll();

		// 특정회원조회
		LiVO selectOne(LiVO liVO);

		// 회원등록
		void insert(LiVO liVO);

		// 회원수정
		void update(LiVO liVO);

		// 회원삭제
		void delete(int liVO);
	
	
}
