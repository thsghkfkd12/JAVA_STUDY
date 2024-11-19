package java_study_1119d;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 스캐너(키보드로 입력받기) 작성 후 ctrl+shift+o로 임포트
		/*문제 1번 int 용돈 = 10000;
			용돈 -= 3000; // 간식 구매	
			용돈 += 5000; // 심부름 보상
			[주관식] 최종 용돈의 값은 얼마일까요? 
		 */
		int 용돈1 = 10000;
		용돈1 -= 3000;
		용돈1 += 5000;
		System.out.println("용돈 : " +용돈1);
		
		/* 문제 2번 int 점수 = 80;점수 += 5; // 보너스 점수
			점수 *= 2; // 더블 점수 이벤트
			[주관식] 최종 점수의 값은 얼마일까요? 
		 */
		int 점수  = 80;
		점수 += 5;
		점수 *= 2;
		System.out.println("점수 : "+점수);
		
		/* 문제 3번 int 나이 = 20;
		boolean 면허증소지 = true;
		boolean 운전가능 = (나이 >= 18) && 면허증소지;
		[주관식] 운전가능은 true일까요 false일까요? 
		 */
		int 나이 = 20;
		boolean 면허증소지 = true;
		boolean 운전가능 = (나이 >= 18) && 면허증소지;
		System.out.println("운전가능 : "+운전가능);
		
		/* 문제 4번 boolean 면허증소지 = true;
			boolean 운전가능 = !면허증소지;
			[주관식] 운전가능은 true일까요 false일까요?
		 */
		boolean 면허증소지1 = true;
		boolean 운전가능1 = !면허증소지1;
		System.out.println("운전가능 : " +운전가능1);
		
		/* 문제 5번 정수형 변수 a와 b를 선언하고 a에 10을 b에 5를 할당 후
			두 개의 정수 a와 b를 곱한 결과를 출력하는 코드를 작성하세요.
		 */
//		System.out.println("첫번째 정수 입력 : ");
//		int a = scan.nextInt();
//		System.out.println("두번째 정수 입력 : ");
//		int b = scan.nextInt();
//		int c = a * b;
//		System.out.println("곱한결과 : " +c);
		
		/* 문제 6번 boolean p = true와 boolean q = false가 있을 때, p && q의 결과는 무엇인지 출력하시오.
		 */
		boolean p = true;
		boolean q = false;
		System.out.println(p && q);
		
		/* 문제 7번 원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요. final double PI = 3.14
			double radius = 5.0; //원의 반지름
			(원의 면적 : PI * 반지름 * 반지름)
		 */
		final double PI = 3.14;
		double radius = 5.0;
		double 원의면적 = PI * radius * radius;
		System.out.println("원의 면적 : "+원의면적);
		
		/* 문제 8번 실수형 변수 weight과 height을 선언하고 weight에 70.5를 할당, 
		    height에는 1.77를할당 후 체질량 지수를 계산하는 프로그램을 작성하세요. double weight = 70.5;
			double height = 1.77;
			double bmi = 0;
		 	*BMI(체질량 지수)공식은 체중(kg) / (신장(m) * 신장(m)) 입니다.
		 */
		double weight = 70.5;
		double height = 1.77;
		double bmi = weight / (height * height);
		System.out.println("bmi : " +bmi);
		
		/* 문제 9번 int 대기번호 = 1;
			System.out.println("다음 번호: " + 대기번호++);
			System.out.println("다음 번호: " + 대기번호++);
			[주관식] 최종 대기번호는 몇번일까요?
		 */
		int 대기번호 = 1;
		System.out.println("다음 번호: " + 대기번호++);
		System.out.println("다음 번호: " + 대기번호++);
		
		/* 문제 10번 2024년 기준 길동이의 나이 age가 주어질 때, 길동이의 출생 연도를 출력하는
			프로그램을 작성하시오. (한국 나이)
			int age = 32;	
			int year = 2024;
			int result = 0;
			코드 구현하기
			System.out.println("출생 연도는: " + result); 
		 	*/
			int age = 32;
			int year = 2024;
			int result = 0;
			result = year - age;
			System.out.println("출생 연도는: " + result);
			
			/* 문제 11번 주어진 돈을 입력받고 500원,100원 동전으로 거스름돈을 받으려고 한다. 거스름돈 구하는 프로그램을 작성하시오.
			 */
			System.out.print("거스름돈을 입력하세요 : "  );
			int myMoney = scan.nextInt();
			int obak = 500; 
			int bak = 100; 
			int change = 0;
			myMoney = bak /= obak;
			System.out.println("오백원" +obak+"개");
			System.out.println("백원" +bak+"개");
	}

}
