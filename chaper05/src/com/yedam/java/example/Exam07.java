package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 로또 번호를 예측하는 프로그램 - 6개

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] numList = null; //초기화 하지 않고 선언만 하는경우 null사용
		int count = 0;

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.새로고침|2.번호예측|3.번호삭제|4.번호출력|5.분석|6.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 로또 번호를 담을 수 있는 배열 초기화
				numList = new int[6]; //new는 특정길이로 초기화 하는경우 사용됨.// int[]arry = new[]{1,2,3}; 은 특정값들로 초기화 하는경우임.
				count = 0;
			} else if (selectNo == 2) { // 1~45중 랜덤한 값을 하나씩 가져옴
				if(count < numList.length) { //count가 무한정 진행되는것을 막기 위해 이중if문 사용
					int num = (int)(Math.random()* 45 ) + 1;
				numList[count++] = num;
				System.out.println("현재 가져온 수의 갯수: " + count);
				}else {
				System.out.println("더이상 숫자를 가져올 수 없습니다.");
				}
			} else if (selectNo == 3) { // 기존에 값 중 가장 최근 값을 하나 삭제
				// count = 6  ->  index = count-1
				numList[--count] = 0; // numList[(count-1)] = 0; 와 동일한 뜻
				System.out.println("현재 가져온 수의 갯수: " +count);
			} else if (selectNo == 4) { // 배열의 값을 전부 출력
				System.out.println("현재 가지고 있는 수의 갯수:" + count);
				for(int i=0; i<count; i++) {
					System.out.print(numList[i]+" ");
				}
				System.out.println();
			} else if (selectNo == 5) { // 중복유무와 중복된 값이 몇번 중복되었는지
				int[]list = new int[45]; //새로운 배열을 만들고 크기를 45로 정함.
				// 개표
				for(int i=0; i < count; i++) { //각 값이 몇개씩 중복되는지
					int index = numList[i] -1;
					list[index]++;
				}
				// 개표상황을 정리해서 보여줌
				boolean isChecked = false;
				for(int i=0; i< list.length; i++) {
					if(list[i] <= 1) continue;
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i+1), list[i]);
					
					isChecked = true;
				}
				
				if(!isChecked) {
					System.out.println("중복 값이 존재하지 않습니다."); 
				}
			} else if (selectNo == 6) {
				run = false;
			}

		}

	}

}
