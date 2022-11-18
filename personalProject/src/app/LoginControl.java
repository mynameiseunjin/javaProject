package app;


import java.util.Scanner;

import com.yedam.app.mem.MemDAO;
import com.yedam.app.mem.MemDAOImpl;
import com.yedam.app.mem.MemManagement;
import com.yedam.app.mem.MemVO;


//생성자
public class LoginControl {
	Scanner sc = new Scanner(System.in);
	MemDAO memDAO = MemDAOImpl.getInstance();
	private static MemVO loginInfo = null;

	public static MemVO getLoginInfo() {
		return loginInfo;
	}

	public LoginControl() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();
			if (menuNo == 1) {
				// 로그인
				login();
			} else if (menuNo == 2) {
				// 종료
				exit();
				break;
			} else {
				showInputError();
			}
		}
	}

	private void menuPrint() {
		System.out.println("==============");
		System.out.println("1.로그인  2.종료");
		System.out.println("==============");

	}

	private int menuSelect() {
		int menuNo = 0;
		try { // 예외처리
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {// 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생
			System.out.println("숫자로 입력하세요.");
		}
		return menuNo;
	}
	
	//
	private void LoginControl() {
		
	}
	
	

	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	private void showInputError() {
		System.out.println("메뉴를 다시 확인하세요.");
	}

	private void login() {
		// 아이디 비번 입력
		MemVO inputInfo = inputMember();
		// 로그인 시도
		loginInfo = memDAO.loginInfo(inputInfo);

		// 로그인 실패할 경우 그대로 메소드 종료함.
		if (loginInfo == null)
			return;

		// 로그인에 성공할 경우 프로그램 실행 ->실행프로그램 만들기!!
		//new MemDAOImpl().run();
		System.out.println("로그인 완료.");
		new MemManagement().menuPrint(); // 메뉴 연동
	}

	private MemVO inputMember() {
		MemVO info = new MemVO();
		System.out.println("아이디를 입력하세요 > ");
		info.setMan_id(sc.nextLine());
		System.out.println("비밀번호를 입력하세요 >");
		info.setMan_pw(sc.nextLine());
		return info;
	}

}
