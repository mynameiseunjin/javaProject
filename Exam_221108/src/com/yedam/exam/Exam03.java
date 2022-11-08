package com.yedam.exam;

public class Exam03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operatior = '+';
		
		if(operatior == '+') {
			System.out.printf("%d + %d = %d \n", num1, num2, (num1+num2));
		}else if (operatior == '-') {
			System.out.printf("%d - %d = %d \n", num1, num2, (num1-num2));
		}else if (operatior == '*') {
			System.out.printf("%d * %d = %d \n", num1, num2, (num1*num2));
		}else if (operatior == '/') {
			System.out.printf("%d / %d = %d \n", num1, num2, (num1/num2));
		}

		switch(operatior) {
		case '+':
			System.out.printf("%d + %d = %d \n", num1, num2, (num1+num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d \n", num1, num2, (num1-num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d \n", num1, num2, (num1*num2));
			break;
		case '/':
			System.out.printf("%d / %d = %d \n", num1, num2, (num1/num2));
			break;
			
			
			
			
			
		}
		
		
		
	}

}
