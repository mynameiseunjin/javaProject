package com.yedam.homework;

public class EmpDept extends Employee {

	//필드 - 부서이름 초기화
	String part = "part";

	//생성자
	public String getPart() {
		return part;
	}
	//초기화
	public EmpDept(String part) {
		this.part = part;
	
	}
	
	//메소드
	
	@Override // 오버라이드만 사용하면 자식만 출력
	public void getInformation() {
		
		super.getInformation();//부모 정보까지 출력됨
		System.out.println("부서: " + part);
	}
	@Override
	public void print () {
		
		//super.print();
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	
	
	
	
	
}
