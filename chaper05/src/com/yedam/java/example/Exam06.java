package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] scores = null; //while문 내부에 선언 불가.
		int studentNum = 0;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());

			switch(selectNo) { //switch문을 사용하기 위해서는 boolean탑입을 사용해야한다.
			case 1:
				System.out.print("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("score[%d] : %d\n",i,scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					//최고점수
					if(max < scores[i]) { //i번째에 있는 scores가 max보다 크다
						max = scores[i];
					}
					
					//총합
					sum += scores[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균 : " + ((double)sum / scores.length));//두 수중 하나는 double로 처리해야 소숫점 이하까지 표시됨.
				break;
			case 5:
				run = false;
				break;
				default:
					System.out.println("정해진 메뉴를 입력하지 않았습니다.");
					System.out.println("다시 입력해주세요.");
			}
		}

	}
}
