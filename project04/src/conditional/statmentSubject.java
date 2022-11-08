package conditional;

public class statmentSubject {
		public static void main(String[] args) {
			//문제 1) 두 개의 정수가 주어졌을 때
			//		 두 정수의 합이 자연수이면
			//		 'Natural Number'로 출력하는 코드를 작성하세요.
			
			int a = 2;
			int b = 3;
			
			if (a+b > 0) {
				System.out.println("Natural Number");
			}
			
			//문제 2) 두 개의 정수가 주어졌을 때
			//		 두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요.
			
			int x = 3, y = 5;
			
			if(x > y) {
				System.out.println(">");
			}else if(x == y) {
				System.out.println("=");
			}else {
				System.out.println("<");
			}
			
			//문제 3) 체질량 지수인 BMI에 따라서 비만도를 네가지 단계로 구분.
			//		 BMI = 체중(kg) / ( 키(m) * 키(m) )
			//		 저체중 (18.5미만), 정상(18.5 이상 25미만),
			//		 과체중(25 이상 30미만), 비만 ( 30이상 )
			
			
			double weight = 61;
			double height = 1.60;
			double bmi = weight /(height * height);
			
			if(bmi >= 30) {
				System.out.println("비만");
			}else if(bmi >= 25) {
				System.out.println("과체중");
			}else if(bmi >=18.5) {
				System.out.println("정상");
			}else {
				System.out.println("저체중");
		
			
				
			//문제 4) 선택한 단의 6번째 값을 출력하는 코드
			//		 예를 들어, 2단 일 경우 2 x 6 =12
			// 		 단, 출력문에는 변수 사용하지 않는다.
				
				int dan = (int)(Math.random() * 9) + 1;
					
				switch(dan) {
				case 1:
					System.out.printf("%d x 6 = %d\n", 1 , 1*6);  //System.out.println(" 1 x 6 = 6");
					break;
				case 2:
					System.out.printf("%d x 6 = %d\n", 2 , 2*6);
					break;
				case 3:
					System.out.printf("%d x 6 = %d\n", 3 , 3*6);
					break;
				case 4:
					System.out.printf("%d x 6 = %d\n", 4 , 4*6);
					break;
				case 5:
					System.out.printf("%d x 6 = %d\n", 5 , 5*6);
					break;
				case 6:
					System.out.printf("%d x 6 = %d\n", 6 , 6*6);
					break;
				case 7:
					System.out.printf("%d x 6 = %d\n", 7 , 7*6);
					break;
				case 8:
					System.out.printf("%d x 6 = %d\n", 8 , 8*6);
					break;
				case 9:
					System.out.printf("%d x 6 = %d\n", 9 , 9*6);
					break;
				}
				//문제 5) 다음과 같이 점수 범위에 따라 등급을 구문
				// 		 해당 점수에 대한 등급을 출력하는 코드
				//		 90점 이상 100점 이하 : A등급,  -> 90,91,...,100
				//		 80점 이상 90점 미만 : B등급,  -> 80,81,...,89
				//		 70점 이상 80점 미만 : C등급,  -> 70,71,...,79
				//	 	 60점 이상 70점 미만 : D등급,  -> 60,61,...,69
				//		 60점 미만 : E등급
					
					
					
				double score = 75;
				 
				switch((int)(score / 10)) {
				case 10:
				case 9:
					System.out.println("A등급");
					break;
				case 8:
					System.out.println("B등급");
					break;
				case 7:
					System.out.println("C등급");
					break;
				case 6:
					System.out.println("D등급");
					break;
				default :
					System.out.println("E등급");
					
					
					
				
				
					
					
					
					
				}
				
				
					
					
				
				
				
				
				
				
			
			
			}
		
		}
}

