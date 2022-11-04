package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		//byte var5 = 128;
		System.out.println(var1);
		//System.out.println(var5);
		
		//long var6 = 100000000000;
		long var7 = 1000000;
		
		//char 타입
		
		char v1 = 65;   //'A' 가능 작은 따옴표 : 숫자 리터럴
		char v2 = '가';
		int v3 = v1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//String 
		String name = "홍길동";  //큰따옴표: 문자열 리터럴
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3)); 
		// char vs String
		char v4 = 'A';   //char-큰 따옴표로 한글자 입력 불가 "A":x
		String v5 = "A"; //String은 'A'(작은따옴표)불가 
		String v6 = "-";
		
		//String str1 = "누군가 "안녕" 하면서 인사했다.";  -> 큰따옴표 인식 불가
		String str1 = "누군가 \"안녕\" 하면서 인사했다."; //큰따옴표를 내부에 있는 값으로 사용하고싶다면 역슬래시 사용
		System.out.println(str1);
		
		//float
		float num1 = 3.14F;
		double num2 = 3.14;
		
		float varF = 0.1234567891234560789F;
		double varD = 0.1234567891234560789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		
		boolean stop = (1 > 2);
		if (stop) {
			System.out.println("중지");
		}else {
			System.out.println("시작");
		}
				
	}
	

	
	

}
