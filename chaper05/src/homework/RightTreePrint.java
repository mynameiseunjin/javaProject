package homework;

public class RightTreePrint {

	public static void main(String[] args) {
		//    *  ->첫번째줄, 공백 3개, 별 1개
		//   **  ->두번째줄, 공백 2개, 별 2개     ))-> 총 문자 4개
		//  ***  ->세번째줄, 공백 1개, 별 3개
		// ****  ->네번째줄, 공백 0개, 별 4개
		
		
		 for(int i=1; i<=4; i++) { // line
			 for(int j=1; j<=4; j++) { //line에 표시된 글자(캐릭터)수
				 if( j <= (4-i)) { // 최대크기에서 line 빼서 공백출력하기
					 System.out.print(" "); //공백출력
				 }else {
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		
		
		
		
		

	}

}
