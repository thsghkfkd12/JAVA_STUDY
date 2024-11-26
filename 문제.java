package java_study_1126;

import java.util.Random;

public class 문제 {

	public static void main(String[] args) {
		
//		1번)
//    10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
//    2번째 인덱스와 5번째 인덱스를 곱한 값을 출력하시오.
		int []sum = new int[10];
		Random random = new Random();
		
		for(int i=0; i<sum.length; i++) {
			sum[i] = random.nextInt(100)+1;
			
		}
		System.out.println(sum[2]+"*"+sum[5]+"="+sum[2]*sum[5]);
		
//    2번)
//    1번 문항 이어서
//    배열에 저장된 값을 모두 더하는 프로그램을 작성하세요.
		int s = 0;
		for(int i=0; i<sum.length; i++) {
			s += sum[i];
		}
		System.out.println("총합 : " +s);
   
//    3번)
//    크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 배
//    열의 요소들 중 짝수만 출력하는 프로그램을 작성하세요.
		for(int i=0; i<sum.length; i++) {
			sum[i] = random.nextInt(100)+1;
			int d = sum[i];
			if(d % 2 == 0) {
				System.out.println("짝수 : "+d);
			}
		}
		

//    4번)
//    크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
//    최댓값을 구하는 프로그램을 작성하세요.
		for(int i=0; i<sum.length; i++) {
			sum[i] = random.nextInt(100)+1;
			int a = sum[i];
			if(a != 100) {
				System.out.println("최대 값 : " +a);
			}
		}

		
	}

}
