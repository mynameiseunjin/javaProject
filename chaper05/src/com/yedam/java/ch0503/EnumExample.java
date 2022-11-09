package com.yedam.java.ch0503;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		Week today = null;  //객체 타입은 대문자 시작
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week){ //변수는 소문자로
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
	
		}
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 스터디를 갑니다.");
		}else{
			System.out.println("오늘은...");
		}

	}

}
