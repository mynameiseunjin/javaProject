package com.yedam.java;

public class OperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);

		byte b = 100;
		//byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result3 :" + result3);
		
		//증감연산자
		int x = 10;
		int y = 10;
		int z;
		System.out.println("--------------------");
		x++;  // 11
		++x;  // 12
		System.out.println("x = "+ x );
		
		System.out.println("--------------------");
		y--;  
		--y;  
		System.out.println("y = "+ y );
		
		System.out.println("--------------------");
		z= x++;
		System.out.println("z = "+ z );  
		System.out.println("x = "+ x );  
	
		System.out.println("--------------------");
		z= ++x;
		System.out.println("z = "+ z );  
		System.out.println("x = "+ x );  
		
		System.out.println("--------------------");
		z= ++x; y++;
		System.out.println("z = "+ z );  
		System.out.println("x = "+ x );  
		System.out.println("y = "+ y );  
		//	1) ++x 
		//	3) y++ <- 문제가 생기기때문에 2,3번 순번을 바꿔야한다.
		//	2) +   x + y => 15 + 8 => 23
		//  4) =  => z = (x + y) = 23
		
		
		/***/
		x = 5;
		y = 5;
		
		System.out.println("------------------");
		z = x++ + --y;
		//3) x++  => 5
		//1) --y  => 4
		//2) x + y =>  5+ 4 = 9
 		//4) z = x + y => z =   
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		System.out.println("------------------");
		z = --x + y++;
		// 1) --x  => 5
		// 2) x + y  => 5 + 4 = 9
		// 3) y++ => 5
		// 4) z = x+y  => z= 9
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) {  //if문은 항상 참이기 때문에 !를 사용하여 강제로 반전시킴.
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업중 입니다.");
		}
		
		//산술 연산자
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1 + v2;
		System.out.println("result : "+ result);
	
		result = v1 - v2;
		System.out.println("result : "+ result);
	
		result = v1 * v2;
		System.out.println("result : "+ result);
	
		result = v1 / v2;
		System.out.println("result : "+ result);
		
		result = v1 % v2;
		System.out.println("result : "+ result);
	
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2);
		System.out.println(">=: " + bResult);
		bResult = ( num1 == num2 );
		System.out.println("==: " + bResult);		
		bResult = (num1 != num2 );
		System.out.println("!=: " + bResult);
		
		char char1 ='A'; // 65
		char char2 ='B'; // 66
		System.out.println("문자 비교: " + (char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int Vs double : " +(v3 == v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float Vs double: " +(v5 == v6));
		System.out.println("float Vs float: " +(v5 ==(float)v6));
		
		
		//논리 연산자
		int charCode = 'A';
		
		//유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
		if((charCode >= 65) && (charCode <= 90 )) { 
			System.out.println("대문자");
		}
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if((charCode >= 97) & (charCode <= 122 )) {
			System.out.println("소문자");
		}
		
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9를 뜻 함.
		if((charCode > 48) && (charCode < 57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		if((numValue % 2 == 0)|(numValue % 3 == 0)){
		System.out.println("2 또는 3의 배수군용ㅋㅋ");
		}
		
		if((numValue % 2 == 0)||(numValue % 3 == 0)){
			System.out.println("2 또는 3의 배수군용ㅋㅋ");
		}
		
		//복합 대입 연산자
		int resultA = 0;
		resultA += 10; //resultA = resultA + 10
		System.out.println("+= :"+ resultA);
		resultA -= 5; //resultA = resultA - 5
		System.out.println("-= :"+ resultA);
		resultA *= 3; //resultA = resultA * 3
		System.out.println("*= :"+ resultA);
		resultA /= 5; //resultA = resultA / 5
		System.out.println("/= :"+ resultA);
		resultA %= 3;
		System.out.println("%= :"+ resultA);
		
		
		//삼항연산자
		int score = 85;
		char grade = (score > 90) ? 'A' :'b' ;
		System.out.printf("성적은 %d이고 등급은 %s 입니다.\n",score,grade );
		
		int age = 17;
		String message = (age >= 20)? "성인" : "미성년자" ;
		System.out.printf("나이는 %d살이며, %s입니다.\n",age,message);
		
		
}	
}

