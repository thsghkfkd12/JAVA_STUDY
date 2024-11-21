package java_study_1121;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// 거스름돈
//		주어진 돈을 입력받고 500원,100원 동전으로 거스름돈을 받으려고 한다. 거스름돈 구하는 프로그램을 작성하시오. 
		Scanner scan = new Scanner(System.in); //작성 후 ctrl+shift+o로 임포트
//		int obak = 500; //500원
//		int bak = 100; //100원
//		int change = 0; //남은 돈
//		System.out.print("거스름돈을 입력하세요 : ");
//		int myMoney = scan.nextInt();
//		
//		/* 나누기와 나머지 연산자를 이용해서 풀어보자*/
//		change = myMoney / obak;
//		System.out.println("500원 change : " +change);
//		change = myMoney % obak;
//		System.out.println(change);
//		change = change / bak;
//		System.out.println("100원 change : " +change);
//		
		/* 문제 1. if의 설명 중 다른 하나는?
		① 조건문은 프로그램에서 특정 조건에 따라 다른 행동을 한다. 
		② false의 경우 if문을 빠져나온다.
		③ if-else문에서 else는 항상 작성해야한다. 
		④ 중첩 if문 마지막에는 else를 작성해야한다.
		 */ 
		// 1번 정답 3
		
		/* 문제 2.
		 *  int 용돈 = 3000;
		boolean 편의점오픈여부 = true;
		if(용돈 >= 3000 && 편의점오픈여부){
 		//A코드 실행
		}else{
 		//B코드 실행
		}
		[객관식] 위 코드를 해석하고 if와 else 둘 중 어느 구문이 실행될까요?
		① A 코드
		② B 코드
		③ 오류 발생
		 * 
		 */
		// 2번 정답 1
		
		/* 문제 3. 두 정수를 입력받아 큰 수를 출력하는 프로그램을 작성하세요.*/
		
		System.out.println("첫번째 정수를 입력 : ");
		int a = scan.nextInt();
		System.out.println("두번째 정수를 입력 : ");
		int b = scan.nextInt();
		
		if(a >= b) {
			System.out.println("a가 b보다 큽니다.");
		}else {
			System.out.println("b가 a보다 큽니다.");
		}
		
		/* 문제 4. 사용자의 나이를 입력받아 미성년자(19세 미만)인지 성인인지 판별하는 프로그램을 작성하세요. */
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		if(age >= 20) {
			System.out.println("19세 이상입니다.");
		}else if(age <= 18){
			System.out.println("19세 미만입니다.");
		}else {
			System.out.println("19세입니다.");
		}
		
		/* 문제 5. 입력된 수가 5의 배수인지 판별하는 프로그램을 작성해주세요. */
		int e = 5;
		if(e % 5 == 0) {
			System.out.println("5의 배수입니다");
		}else {
			System.out.println("5의 배수 아닙니다.");
		}
		
		/* 문제 6. 숫자를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요. */
		int n = 8;
		if(n % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		/* 문제 7. 숫자를 입력받아 3의 배수, 5의 배수, 3과 5의 공배수,
		 *  또는 해당 없음을 출력하는 프로그램을 작성하세요. */
		int m = 15;
		if(m % 3 == 0 && m % 5 == 0) {
			System.out.println("공배수입니다.");
		}else {
			System.out.println("아닙니다.");
		}
		
		/* 문제 8. 세 과목(국어,수학,영어)의 점수를 입력받아 평균을 계산하고, 
		 * 평균이 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 
		 * "C",60점 이상이면 "D", 그 미만이면 "F"를 
		 * 출력하는 프로그램을 작성하세요. */
		System.out.println("점수 : ");
		int num = scan.nextInt();
		
		if(num >= 90 && num <= 100) {
			System.out.println("A");
		}else if(num >=80 && num <= 90) {
			System.out.println("B");
		}else if(num >=70 && num <= 80) {
			System.out.println("C");
		}else if(num >=60 && num <= 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		/* 문제 9. 두 정수를 입력받아 둘 중 하나라도 음수이면 "음수가 포함되어 있습니다.",
		 * 둘 다 양수이면 "모두 양수입니다."를 출력하는 프로그램을 작성하세요 */
		
		System.out.println("정수 : ");
		int 양 = scan.nextInt();
		System.out.println("정수 : ");
		int 음 = scan.nextInt();
		
		
		/* 문제 10.
		 * 사용자로부터 1부터 5까지의 숫자를 입력받아 해당하는
		과일 이름을 출력하는 프로그램을 작성하세요. 
		(1: 사과, 2: 바나나, 3: 오렌지, 4: 포도, 5: 복숭아)
		 	*switch 이용해서 풀 것
		 */
		System.out.println("숫자 : ");
		int 숫자 = scan.nextInt();
		
		switch(숫자) {
		case 1 :
			System.out.println("사과");
			break;
		case 2 :
			System.out.println("바나나");
			break;
		case 3 :
			System.out.println("오렌지");
			break;
		case 4 :
			System.out.println("포도");
			break;
		case 5 :
			System.out.println("복숭아");
			break;
	}
		
		/* 문제 11. 
		 * 길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 출력하세요.
		
		int n = 15; //사람의 수
		예) 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다. n이 15라고 가정하면 피자는 3판이 필요합니다.
		 */
		
		
		
		
		/* 문제 12.
		 * 길동이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%,
			50만 원 이상 사면 20%를 할인해줍니다. 구매한 옷의 가격 price가 주어질 때, 
			지불해야 할 금액을 출력하세요. Scanner scan = new Scanner(System.in);
			System.out.print("금액을 입력하세요 : ");
			int price = scan.nextInt();
			예)
			580000원에서 20%를 할인한 464000원을 출력합니다. 150,000원에서 5%를 할인한 142500원을 출력합니다.
		 */
		
		
		

	}

}
