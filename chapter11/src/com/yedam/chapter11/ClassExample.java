package com.yedam.chapter11;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// Key 클래스 객체 가져오기
		// 1탄 - 직접 클래스 가져오기
		Class clazz = Key.class; // class는 변수라 예약어로 사용 불가. clazz로 사용함 ㅋㅋ

		System.out.println(clazz);
		// 2탄 - 경로를 통한 클래스 객체 가져오기
		Class clazz2 = Class.forName("com.yedam.chapter11.Key");

		System.out.println(clazz2);

		// 3탄 -> 객체로부터 클래스 객체 얻기
		
		Key key = new Key(1);
		
		
		//class의 객체에 대한...것....
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);
		
		String photogath = clazz.getResource("111/poppyjava.jpg").getPath();
		
		System.out.println(photogath);
		
		
	}

}
