package com.yedam.chapter1102;

public class BoxingUnboxing {

	public static void main(String[] args) {
		//박싱
		
		//1)생성자를 사용한 박싱
		Integer obj1 = new Integer(100); //구문을 사용할수있지만 권유하지않는다.는뜻으로 가로바
		Integer obj2 = new Integer("200");
		//2)생성자를 사용하지 않는 박싱
		Integer obj3 = Integer.valueOf("300");

		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		//자동박싱
		Integer obj4 = 100;
		
		//자동 언박싱
		int value4 = obj4;
		int value5 = obj4.intValue();//
		
		//타입 변환
		int value6 = Integer.parseInt("777");
		double value7 = Double.parseDouble("333");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		//포장 값 비교
		Integer obj10 = 100;
		Integer obj11 = 100;
		System.out.println(obj10 == obj11);
		//포장값의 범위안에 있을 때만 객체가 비교됨 
		//범위안이 아니라면 언박싱 후 비교해야함.
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
