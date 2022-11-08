package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제1) 주어진 배열의 총 합과 평균을 구하세요.
		int[] array = { 10, 53, 26, 85, 75 };

		int sum = 0;

		for (int i=0; i < array.length; i++) { // 배열은 index로 계산해야하기때문에 시작값은 0이다.
			sum += array[i];
		}

		System.out.println("총합 : " + sum);
		double avg = sum / (double) array.length;
		System.out.printf("평균: %.2f\n ", avg);

		// 문제2) 배열의 최대값과 최소값을 구하세요.

		int max = array[0];// [array.length-1]; 최대보다 -1인값으로 사용도 가능
		int min = array[0];

		for (int i=0; i < array.length; i++) {
			// 최대값
			if (max < array[i]) {
				max = array[i];
			}

			// 최소값
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		//문제3) 문제2에서 구한 최대값과 최소값이 각각 몇번째 값인지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;
		
		for (int i=0; i < array.length; i++) {
			// 최대값
			if (max == array[i]) {
				maxIndex = i;
			}

			// 최소값
			if (min == array[i]) {
				minIndex = i;
			}
		}
		System.out.println("최대값: "+max+"는"
		+(maxIndex+1)+"번째입니다.");//index는 0부터 시작하기때문에 +1해야함
		
		System.out.println("최소값: "+min+"은"
				+(minIndex+1)+"번째입니다.");
		
		
		
		
		
		
		
		
		
	}
}
