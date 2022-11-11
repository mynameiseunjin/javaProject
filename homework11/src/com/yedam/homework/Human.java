package com.yedam.homework;

public class Human {

	//필드
	public String name;
	public int hi;
	public int we;
	
	//생성자
	public Human(String name,int hi,int we) {
		this.name = name;
		this.hi = hi;
		this.we = we;
	}
	
	//메소드
	 public void getInformation() {
		 System.out.println("이름 : " + name);
		 System.out.println("키 : " + hi );
		 System.out.println("몸무게 : " + we );
	 }
}
