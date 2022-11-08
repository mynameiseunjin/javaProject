package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		

		
		
		
		//배열을 선언 -> 모든 타임을 값으로 가질 수 있음.
		int[] intAry = null;
		//System.out.println("intAry[0]: " + intAry[0]);

		// 값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균: " + avg);
		
		//주의사항
		int[]scoreList = null;
		scoreList = new int[]{83, 90, 87}; //new연산자 사용해야함.(생성자호출하기위해)
		
		sum = 0;
		for(int i=0; i<3; i++) {
			sum = sum + scoreList[i];
		}
		System.out.println("총합: " + sum);
		
		sum = add(new int[] {83, 90, 87});
			
		// new연산자로 배열 생성
		int [] array = new int[3];
		for (int i=0; i<3; i++) {
			System.out.println("array["+i+"] : " + array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i=0; i<strAry.length; i++) { //크기지정 
			strAry[i] = String.valueOf(i); //string.valueof를 하지않으면 값은 null로 나옴
		}
		
		for(int i=0; i<strAry.length; i++) {
			System.out.println("strAry["+i+"] : " +strAry[i]);
		}
		
		

	}

	private static int add(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}

}
