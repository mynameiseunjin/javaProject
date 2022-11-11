package com.yedam.homework;

public class Employee {
	
	//필드
	public String name;
	public int income;

	
	//생성자
	public String getName() {
		return name;
	}


	public int getIncome() {
		return income;
	}


	//메소드
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + income );
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
}
