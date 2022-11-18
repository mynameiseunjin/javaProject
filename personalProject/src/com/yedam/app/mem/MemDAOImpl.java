package com.yedam.app.mem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.DAO;

public class MemDAOImpl extends DAO implements MemDAO {
	// 싱글톤
	private static MemDAO instance = null;

	public static MemDAO getInstance() {
		if (instance == null)
			instance = new MemDAOImpl();
		return instance;
	} //

	// 전체회원조회
	@Override
	public List<MemVO> selectAll() {
		List<MemVO> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			String sql = "SELECT * FROM Manager";
			rs = stmt.executeQuery(sql);
			int count = 0;
			while (rs.next()) {
				MemVO memVO = new MemVO();
				memVO.setMan_num(rs.getString("Man_num"));
				memVO.setMan_id(rs.getString("Man_num"));
				memVO.setMan_pw(rs.getString("Man_pw"));
				memVO.setMan_name(rs.getString("Man_num"));
				memVO.setMan_gender(rs.getString("Man_gender"));
				memVO.setMan_tel(rs.getInt("Man_tel"));
				list.add(memVO);

				if (++count >= 20)
					break;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 특정회원조회
	@Override
	public MemVO selectOne(MemVO memVO) {
		MemVO findVO = null;
		try {
			connect();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM  Manager WHERE Man_num =" + memVO.getMan_num();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				findVO = new MemVO();
				findVO.setMan_num(rs.getString("Man_num"));
				findVO.setMan_id(rs.getString("Man_num"));
				findVO.setMan_pw(rs.getString("Man_pw"));
				findVO.setMan_name(rs.getString("Man_num"));
				findVO.setMan_gender(rs.getString("Man_gender"));
				findVO.setMan_tel(rs.getInt("Man_tel"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findVO;

	}

	// 회원등록
	@Override
	public void insertMem(MemVO memVO) {
		try {
			connect();
			String sql = "INSERT INTO Manager VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memVO.getMan_num());
			pstmt.setString(2, memVO.getMan_id());
			pstmt.setString(3, memVO.getMan_pw());
			pstmt.setString(4, memVO.getMan_name());
			pstmt.setString(5, memVO.getMan_gender());
			pstmt.setInt(6, memVO.getMan_tel());

			int result = pstmt.executeUpdate();

			if (result < 0) {
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 회원수정
	@Override
	public void updateMem(MemVO memVO) {
		try {
			connect();
			String sql = "UPDATE Manager SET Man_tel = ? WHERE Man_num = ? ";// 회원번호를 입력해서 tel 수정해라
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memVO.getMan_tel());
			pstmt.setString(2, memVO.getMan_num());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 수정되었습니다.");

			} else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 회원삭제
	@Override
	public void deleteMem(int memNO) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM Manager WHERE Man_num = " + memNO;
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("정상적으로 삭제가 되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 로그인
	@Override
	public MemVO loginInfo(MemVO inputInfo) {
		MemVO loginInfo = null;
		try {
			connect();
			String sql = "SELECT * FROM manager WHERE man_id = '" + inputInfo.getMan_id() + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				// 아이디가 존재하면
				if (rs.getString("man_pw").equals(inputInfo.getMan_pw())) {
					// 비밀번호 일치 -> 로그인 성공
					loginInfo = new MemVO();
					loginInfo.setMan_id(rs.getString("Man_id"));
					loginInfo.setMan_pw(rs.getString("Man_pw"));

				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");

				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return loginInfo;
	}

}
