package app;

import java.lang.reflect.Member;
import java.util.Scanner;

//매니저 객체
import com.yedam.app.mem.MemDAO;
import com.yedam.app.mem.MemDAOImpl;

//생성자
public class MemManagement {
	Scanner sc = new Scanner(System.in);
	private static Member loginInfo = null;

	public static Member getLoginInfo() {
		return loginInfo;
	}

	public MemManagement() {
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
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void showInputError() {
		System.out.println("메뉴를 다시 확인하세요.");
	}
	
	private void login() {
		//아이디 비번 입력
		Member inputInfo = inputMember();
		//로그인 시도
		LoginInfo = 
	}

	private Member inputMember() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
