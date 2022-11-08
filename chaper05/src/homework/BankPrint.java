package homework;

import java.util.Scanner;

public class BankPrint {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금| 2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				// 메뉴 : 예금
				System.out.print("예금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
			} else if (selectNo == 2) {
				// 메뉴 : 출금
				System.out.println("출금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
			} else if (selectNo == 3) {
				// 메뉴 : 잔고
				System.out.println("잔고>" + balance);
			} else if (selectNo == 4) {
				// 메뉴 : 종료
				run = false;
			} else {
				// 기타입력
				System.out.println("정해진 메뉴(1~4)중에서 선택해주세요.");

			}
		}

		System.out.println("프로그램 종료");

	}

}
