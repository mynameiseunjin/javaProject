package com.yedam.chp1102;

public class Turnup {
	public static void main(String[] args) {

		// 1) 문자열 뒤집기
		// -입력되는 문자열을 뒤집어서 출력
		// ex) input : abc , output : cba

		String str = "abc";
		String str2 = " ";

		for (int i = str.length() - 1; i > -1; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);

		// 2) 문자열 개수 세기
		// -아스키 코드 이용
		// -입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
		// ex) input : 1a2v4b , output : 숫자 3개, 영어 3개

		String subject = "1a2v4b";

		int index = subject.indexOf("1a2v4b");

		System.out.println(index);

		
		
		
		
		
		
		// 3) 입력한 생년월일 6자리를 입력했을 경우 만나이를 구하는 프로그램 작성
		// -조건-
		// 금년 기준으로 100년이 넘어간 경우는 제외한다. 또한 생일은 신경쓰지 않는다.
		// (221114 -> 1922년 11월 14일 x, 2022년 11월 14일 o)
		// ex) input : 000510 ,   output : 21살

	}
}