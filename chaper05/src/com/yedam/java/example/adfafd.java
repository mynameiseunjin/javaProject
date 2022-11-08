package com.yedam.java.example;

public class adfafd {
	public static void main(String[] args) {

//		int[] array = { 10, 53, 26, 85, 75 };
//		int sum = 0;
//		for(int i=0;i<array.length; i++) {
//			sum += array[i];
//		}
//		double avg = (double) sum/array.length;
//		System.out.println("총합" + sum);
//		//System.out.println("총합" + sum/array.length);
//		System.out.println("평균" + avg);
//
//			int min = array[0];
//			for(int i=0; i<array.length; i++);
//			if(min > array[i]) {
//				min = array[i];
//		
//			}
//		int num1 = 10;
//		int num2 = 2;
//		int result = 0;
//		String operator = " ";
//		switch(operator) {
//
//		case "+" : result = num1 + num2;
//
//		break;
//
//		case "-" : result = num1 - num2;
//
//		break;
//
//		case "*" : result = num1 * num2;
//
//		break;
//
//		case "/" : result = num1 / num2;
//
//		break;
//
//		default : System.out.println("제대로 입력 해주세요.");
//
//		}
//		System.out.printf("%d %s %d = %d", num1 , operator ,num2, result);
//			
//		}
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	// 문제5) 책 161페이지 3번
			// while문과 Math.random()함수를 이용
			// 2개의 주사위를 던졌을 때 숫자를(숫자1, 숫자2)로 출력
			// 숫자의 합이 5일 경우에 종료, 아닌 경우 계속 던짐
			// 최종으로 주사위를 몇 번 던졌는지 횟수를 출력
			// 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)

			// int con = (int)(Math.random() * 6) + 1;
			int total = 0;
			while (true) {
				int x = (int) (Math.random() * 6 ) + 1;
				int y = (int) (Math.random() * 6) + 1;
				total++;
				System.out.printf("(%d,%d)\n",x,y);
				if ( x + y == 5) {
					break;
				}
			}
			System.out.println("주사위를 던진 횟수는 총"+total+"번 입니다.");
		}

	}

