package com.yedam.java.ch0601;

public class Car {

	// 필드 : 속성
	int maxSpeed = 100;
	String color = "red";
	
	// 생성자
	public Car() {
		System.out.println("자동차가 출하되었습니다.");
	}
	
	// 메소드 : 동작
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}

}
