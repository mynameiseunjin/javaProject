package com.yedam.chp1102;

import com.yedam.chapter11.Key;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student compareStudent = (Student) obj; //자동타입변환
			if(this.studentNum == compareStudent.studentNum) 
				return true;
			}
			return false;
		
		
		
		

	}

	@Override
	public int hashCode() {
		return studentNum.hashCode(); // hashcode를 재정의해야 95가 출력됨. 
						//이 부분이 빠진다면 1번 학생의 총점 : null 로 출력.
	}

	
}

