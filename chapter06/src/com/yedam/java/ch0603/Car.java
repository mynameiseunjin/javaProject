package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	// 생성자
	public Car(String model) {
		//this.model = model;
		this(model,"은색", 250);
	}
	
	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		//System.out.println("인스턴스를 생성했습니다."); //this를 생성하기전에 호출을 하면 this 사용 안됨.
		//this.company = "웨스턴"; //this를 실행하기전에 어떤 명령어도 허용되지않는다.
		this(model, color, 250 );
	}

	public Car() {
	} // 괄호가 비어있는 생성자 만들어서 main에 값을 넣어줌.

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
