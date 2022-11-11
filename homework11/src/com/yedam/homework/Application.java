package com.yedam.homework;

public class Application {
	public static void main(String[] args) {

		EmpDept empDept = new EmpDept(null);
		
		empDept.name = ("이지나");
		empDept.income = 3000;
		empDept.part = ("교육부서");
		
		empDept.getInformation();
		empDept.print();
	}
}
