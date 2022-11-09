package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3]; // []은 배열임. 따라서 int[]의 배열이라는 뜻
		// 2차원 배열, 2차원 배열이 갖고있는 int의 크기

		// 첫번째 : 변수사용o
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];

			for (int j = 0; j < mathScore.length; j++) {
				System.out.println("\t mathScore[" + j + "] :" + mathScore[j]);
			}

		}
		System.out.println("-------------------------------------------------");

		// 두번째 : 변수사용x
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");

			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("\t mathScores[" + i + "][" + j + "] :" + mathScores[i][j]);

			}

		}

		int[][] scoreList = { { 86, 65 }, { 58, 95, 73 }

		};

		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			for (int j = 0; j < scoreList[i].length; j++) { // scoreList[0]으로 바꾸면 첫번째 배열의 길이만큼만 출력된다. 2는 넣을 수 없다. 왜냐하면
															// 인덱스는 전체길이-1이기때문.
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println();
		}

		int[][] englishScore = new int[2][];
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];

		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.print("englishScore[" + i + "][" + j + "] :");
				System.out.println(englishScore[i][j]);
			}
		}

		//

		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[1].equals(strArray[2]));

		System.out.println();

		// for문으로 배열 복사
		int[] oldIntAry = { 1, 2, 3 };
		int[] newIntAry = new int[5];
		for (int i = 0; i < oldIntAry.length; i++) { // 배열의 크기는 작은쪽에 맞춰져야함.
			newIntAry[i] = oldIntAry[i];
		}

		for (int i = 0; i < newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}

		// System.arraycopy()
		String[] oldStrAry = { "java", "array", "copy" };
		String[] newStrAry = new String[5];

		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);

		for (int i = 0; i < newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}

		// 향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		//int index = -1;  
		
		for( int score : scores ) {
			sum += score;
			//System.out.println("인덱스 : " + ++index);
	}
		System.out.println("점수 총합:" + sum );
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 =" +avg);
	}
}
