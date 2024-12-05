package java_study_1205;

public class 복습 {

	public static void main(String[] args) {
		
		/*
		 * 1. 사칙연산 - 거스름돈
		 */
		int money = 74900;
		
		// 결과 -> 오만원 1장, 만원 2장, 천원 4장, 5백원1개, 100원 4개
		
		int 오만원 = 50000;
        int 만원 = 10000;
        int 천원 = 1000;
        int 오백원 = 500;
        int 백원 = 100;
        int 오만원개수 = money / 오만원;
        money = money % 오만원;
        int 만원개수 = money / 만원;
        money = money % 만원;
        int 천원개수 = money / 천원;
        money = money % 천원;
        int 오백원개수 = money / 오백원;
        money = money % 오백원;
        int 백원개수 = money / 백원;
        money = money % 백원;
        
        System.out.println("오만원 : "+오만원개수);
        System.out.println("만원 : "+만원개수);
        System.out.println("천원 : "+천원개수);
        System.out.println("오백원 : "+오백원개수);
        System.out.println("백원 : "+백원개수);


		
		/*
		 * 그리드(탐욕) 알고리즘 ex) 거스름돈
		 * => 선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫒아 최종 답에
		 * 도달하는 방법
		 */
		
		// 상수 : 변경 불가능
		// 츠로그래밍에서는 상수표현은 데이터타입 앞에 'final' 키워드가 온다.
		// 상수를 표현할 땐 변수이름을 대문자로 적어야 합니다. (개발자 약속)
		final double PI = 3.14;
		
		/*
		 * 문제) 원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요.
		 * double radius = 5.0; // 원의 반지름
		 * 원의 면적은 PI * 반지름 * 반지름 입니다.
		 */
		double radius = 5.0;
		System.out.println(PI * radius * radius);
		
		/*
		 * 문제) 피타고라스
		 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가
		 * 변수로 주어질 때, 한 변의 길이의 제곱, b를 출력하시오.
		 */
		int a = 3;
		int c = 5;
		int b = c*c - a*a; // b구하기 => 16이 나와야함
		System.out.println(b);
		
		int[] array = {1,3,5}; // 배열선언
		System.out.println(array[0]);
		// 맨 마지막 인덱스 출력하기
//		System.out.println(array[2]); 세모
		System.out.println(array[array.length-1]);
		
		// 문제 1번 인덱스 값과 2번 인덱스 값 서로 교환하기
		
		int temp = array[1]; // temp(임시공간 라는 의미)에 3대입
		array[1] = array[2]; // 1번 인덱스에 5대입
		array[2] = temp; // 2번 인덱스에 3대입
		// swap
		
		// 배열문제가 나오면 모조건 for문
		for(int i : array) { // foreach문(배열 길이만큼 자동으로 반복)
			System.out.println("i : "+i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
