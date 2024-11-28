package java_study_1128;

import java.util.Random;

public class 배열문제 {

	public static void main(String[] args) {
		/* 
		 * 1번, 4번 맞춰보기
		 * 
		 */
		
		int[] array = {1,2,3,4,5,6,7,8,9,10}; // 첫번째 방법
		int[] array2 = new int[10];  // 두번째 방법
		for(int i=0; i<array2.length; i++) { // for문이용해서 값 초기화
			array2[i] = i+1;
			System.out.println(array2[i]);
		}
		int result = array2[2] * array2[5]; // 2번째 인덱스 * 5번째 인덱스
		System.out.println("1번 정답 : "+result);
		
		// 4번
		// 랜덤한 값
		Random random = new Random(); 
		// 배열값 초기화
		int[] array3 = new int[10]; // 크기가 10인 정수 배열을 선언
		for(int i=0; i<array3.length; i++) {
			array3[i] = random.nextInt(100) + 1;  // 1~100까지 랜덤값 대입 
		}
		
		// 최대값 구하기
		int max = 0; //최대값
		for(int i=0; i<array3.length; i++) {
			if(max < array3[i]) { // max가 배열에 있는값보다 작다면?
				max = array3[i]; // 최대값변수에 값 대입!
			}
		}
		System.out.println("최대값은 ? " +max);
		
		
	}

}
