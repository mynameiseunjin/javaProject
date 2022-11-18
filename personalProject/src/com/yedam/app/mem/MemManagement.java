package com.yedam.app.mem;

import java.util.List;
import java.util.Scanner;

//로그인 후 보여지는 화면
public class MemManagement {
	Scanner sc = new Scanner(System.in);
	MemDAO memDAO = MemDAOImpl.getInstance();
	private String list;

	public MemManagement() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelcet();
			// 각 메뉴의 기능을 실행하는 부분
			if (menuNo == 1) {
				// 1.전체조회
				selectAll();
			} else if (menuNo == 2) {
				// 2.회원조회
				selectOne();
			} else if (menuNo == 3) {
				// 3.회원등록
				insertMem();
			} else if (menuNo == 4) {
				// 4.회원수정
				updateMem();
			} else if (menuNo == 5) {
				// 5.회원삭제
				deleteMem();
			} else if (menuNo == 9) {
				// 9.종료
				end();
				break;
			} else {
				// 기타
				printErrorMessage();
			}
		}
	}

	// 기타선택메세지
	private void printErrorMessage() {
		System.out.println("====================================");
		System.out.println("메뉴를 잘 못 입력했습니다. 다시 확인하세요.");
		System.out.println("====================================");
	}

	// 9번 선택할경우
	private void end() {
		System.out.println("===================");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("===================");
	}

	// 메뉴선택공간
	public void menuPrint() {
		System.out.println("===============================================================");
		System.out.println("1.전체조회 | 2.회원조회 | 3.회원등록 | 4.회원수정 | 5.회원삭제 | 9.종료  ");
		System.out.println("===============================================================");
	}

	// 1~5,9 외 다른숫자나 문자를 입력했을 경우 다시 메뉴선택공간으로 return
	private int menuSelcet() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자만 사용가능합니다.");
		}
		return menuNo;
	}

	// 전체조회
	private void selectAll() {
		List<MemVO> list = memDAO.selectAll();//memDAO와 MemDAO헷갈려....ㅜ
		if (list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}

		for (MemVO memVO : list) {
			System.out.printf("%d: %s, \n", memVO.getMan_num(), memVO.getMan_name(), memVO.getMan_id());
		}
	}
	//단건조회
	private void selectOne() {
		MemVO findMem = inputMemInfo();
		MemVO memVO = memDAO.selectOne(findMem);
		if (memVO == null) {
			System.out.printf("%d 회원은 존재하지 않습니다. \n", findMem.getMan_num());
		} else {
			System.out.println("조회결과 > ");
			System.out.println(memVO);
		}
	}
	
	private MemVO inputMemInfo() {
		MemVO memVO = inputMemInfo();
		memDAO.insertMem(memVO);
		return memVO;
	}

	private void insertMem() {
		MemVO memVO = inputMemAll();
		memDAO.insertMem(memVO);
	}

	private void updateMem() {
		MemVO memVO = inputMemInfo();
		memDAO.updateMem(memVO);
	}

	private void deleteMem() {
		int memNo = inputMemNo();
		memDAO.deleteMem(memNo);
	}

	private MemVO inputMemAll() {
		MemVO memVO = new MemVO();
		System.out.println("회원번호 > ");
		memVO.setMan_num(list);
		System.out.println("ID > ");
		memVO.setMan_id(sc.nextLine());
		System.out.println("이름 > ");
		memVO.setMan_name(sc.nextLine());
		System.out.println("성별(남,여) > ");
		memVO.setMan_gender(sc.nextLine());
		System.out.println("연락처 끝 4자리 > ");
		memVO.setMan_tel(sc.nextLine());

		return memVO;

	}

	private int inputMemNo() {

		int memNo = 0;
		try {
			memNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자로 입력해주세요.");
		}
		return memNo;
	}

}
