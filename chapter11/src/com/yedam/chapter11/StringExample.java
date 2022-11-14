package com.yedam.chapter11;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1"; //100번지
	// String c = "1"; //100번지
	// String b = new String("1"); // 200번지
	// string은 같은 데이터라면 같은 주소인데 new연산자를 사용하게 된다면 같은 데이터라도 다른 주소를 참조한다.

	// 바이트 -> 문자열
	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 111, 32, 74, 97, 118, 97 };
		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);

		// String str2 = new String(바이트 배열, 시작점, 갯수);
		String str2 = new String(bytes, 5, 4);// byte로부터 여섯번째부터 4자리까지 가져오세요 라는 뜻.
		System.out.println(str2);

		// String 메소드
		// 1) charAt(int index) - 특정 문자 위치를 반환

		String ssn = "123456-479456";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";

		// 주소를 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}

		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		} else {
			System.out.println("다른 문자열 가짐");
		}

		// 바이트 배열로 변환
		byte[] bytes2 = null;
		String str = "안녕하세요??";
		bytes2 = str.getBytes();

		System.out.println(bytes2.length);// 한글은 한 글자당 3byte임. 그래서 15바이트가 나옴.

		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String" + str3);

		try {
			byte[] bytes3 = str.getBytes("EUC-KR");

			System.out.println("bytes3.length : " + bytes3.length);

			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> string " + str4);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 문자열 찾기
		String subject = "자바 프로그래밍";

		int index = subject.indexOf("프로그래밍");

		System.out.println(index);

		index = subject.indexOf("a");

		System.out.println(index);
		
		
		
		//문자열의 문자 개수 얻기
		
		System.out.println(subject.length());//8

		
		//문자열 위치 변경
		
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		//Java 프로그래밍
		System.out.println(newStr);
		
		
		//oldStr = "자바";
		//oldStr += "프로그래밍";//200번지
		//oldStr += "재밌다"; //300번지
		
		
		//Stringbuilder 또는 buffer
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append(1234);
		System.out.println(sb);
		
		
		//대소문자 바꾸기
		String strVal = "adfjadfafdadf";
		String strVal2 = "AFDAFDADFSAFAFD";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		//trim() : 문자열 공백 지우는것
		String strTrim = "   자바   ";
		System.out.println(strTrim);//   자바   
		System.out.println(strTrim.trim());//자바

		
		
		//substring()
		//substring(index,end)
		//index부터 end까지 자르세요.
		//substring(index)
		//index부터 끝까지 자르세요.
		
		String ssn2 = "880815-12345678";
		
		String firstNum = ssn2.substring(0,6);
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//split()
		String strSplit = "1-1-1-1-1-2-3-4-5-6-9";
		
		String[]strAry = strSplit.split("-");
		
		for(String temp : strAry) {  //향상된 for문
			System.out.println(temp);
		}
		
		//문자열 변환
		
		//숫자나, 소수, 불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
