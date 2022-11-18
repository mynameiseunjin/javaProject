package Course;

import java.util.List;

public interface CoDAO {

	//수강내역기능 만들기
	
	// 전체회원조회
			List<CoVO> selectAll();

			// 특정회원조회
			CoVO selectOne(CoVO coVO);

			// 회원등록
			void insert(CoVO coVO);

			// 회원수정
			void update(CoVO coVO);

			// 회원삭제
			void delete(int coVO);
	
	
}
