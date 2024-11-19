package java_study_1119d;

public class 복습 {

	public static void main(String[] args) {
		// 자바는 8가지 기본타입과 래퍼런스 타입 총 9가지의 데이터타입을 가지고 있음.
		/*
		 * 가장 많이 사용하는 데이터타입
		 * 1. int : 정수
		 * 2. double : 실수
		 * 3. String : 문자열
		 * 4. boolean : 참 혹은 거짓을 표현하고 싶을 때
		 */
		int x = 10; // 10이라는 정수를 x라는 변수(식별자)에 대입
		/*
		 * int : 데이터 타입(정수형)
		 * x : 변수 이름(식별자 이름)
		 * = : 대입 연산자
		 * 10 : 데이터
		 */
		int y = 20; // 변수이름은 중복될 수 없음
		int a = 20; // 오류발생 : 변수이름 중복됨 -> 변수 이름 변경(오류 수정)
		a = 10; // a 라는 변수 재활용 (변수를 재활용할때는 앞에 데이터타입 작성 X)
		System.out.println("a의 최종 값은 : "+a);
		
		int b = 20; // b라는 변수 생성 -> 선언문(초기화)
		b = 40; // b를 재활용하다.
		
		// 문제 11 (변수 활용하기)
		int n1 = 100;
		int n2 = 90;
		int n3 = 70;
		int avg = 0; // 평균을 구할 변수
		
		avg = (n1 +n2 + n3 ) / 3; // (평균 구한값을 avg에 대입)
		System.out.println("평균 : " +avg);
		
		// 문제 12
		int money = 800;
		double percent = money * 0.1;
		System.out.println("800의 10%는 "+percent);
		
	}

}
