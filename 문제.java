package java_study_1205;

import java.util.Random;

public class 문제 {

	public static void main(String[] args) {
		/*
		 * [문제1]문항
			○○은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다.
			 ○○은 무엇일까요?
			1. 변수
			2. 실수
			3. 상수
			4. 정수
		 */
		// 1번 정답 상수
		
		/*
		 * [문제2 문항
 		문자형변수 x를 선언하고 “10”을 할당 후
		정수형 변수 y를 선언하고 x의 값을 y에 대입하세요. *문자에서 정수형으로 ‘형변환’ 해야합니다.
		 */
		String a = "10"; 
		int y = Integer.parseInt(a);
		System.out.println(y);
		
		/*
		 * [문제3]문항
			다음 중 잘못된 식별자(변수이름)는?
			1. monster3
			2. apple_13_pro
			3. 3apple
			4. AaaAAA
		 */ 
		// 3번정답 3apple
		
		/*
		 * [문제4] 문항 1부터 100까지의 숫자 중 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요.
		 */
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println("짝수 : " +i);
			}else {
				System.out.println("홀수 : " +i);
			}
		}
		
		/*
		 * [문제5]문항
		boolean 면허증소지 = true;
		boolean 운전가능 = !면허증소지;
		최종 운전가능 값은 무엇일까요? 
		 */ //false
		boolean 면허증소지 = true;
		boolean 운전가능 = !면허증소지;
		System.out.println(운전가능);
		
		/*
		 * [문제6]문항 1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요.
		 */
		int s = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		/*
		 * [문제7]문항
			길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
			모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 출력하세요.
    		int n = 15; //사람의 수 예) 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
 			n이 15라고 가정하면 피자는 3판이 필요합니다.
		 */
		
		int n = 15;
		int sizze = 3;
		int sizzes= 0;
		sizzes = n / sizze;
		System.out.println("피자수 : "+sizzes);
		
		/*
		 * [문제8]문항
		 *  사용자로부터 정수를 입력받아 팩토리얼을 계산하는 프로그램을 작성하세요.
		 *   (예: 5! = 5 * 4 * 3 * 2 * 1)
		 */
		int num = 5;
		int f = 1;
		for(int i=1; i<num; i++) {
			f = f * i;
			System.out.println(f);
		}
		
		/*
		 * [문제9]문항 2부터 5까지의 구구단을 출력하는 프로그램을 작성하세요.
		 */
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		/*[문제10]문항
			다음과 같은 패턴을 출력하는 프로그램을 작성하세요. 
			****
		 	***
		 	**
		 	* 
		 */
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * [문제11]문항
			사용자로부터 문자열을 입력받아 그 문자열의 길이를 출력하는 프로그램을 작성하세요. 
			단, 길이가 11 이상인 문자열은 “아이디는 10글자 이하로 작성해주세요.”
			라고 출력할 것.
		 */
		String userId = "홍길동";
		if(userId.length() >= 10) { // 문자열길이가 10이상이라면?
			System.out.println("아이디는 10글자 미만으로 작성해주세요");
		}else  {
			System.out.println("사용가능한 아이디입니다.");
		}
		
		/*
		 * [문제12]문항
			열에 대한 설명 중 다른 것은?
			① 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간이다.
 			② int[] array = new int[10]; 총 10개의 공간이 생성되었다.
  			③ 배열은 항상 0부터 시작한다. 
  			④ 반복문을 이용하여 처리하기에 적합하지 않은 자료구조다.
		 */
		// 12 정답 4번
		
		/*
		 * [문제13]
		문항 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		 배열에서 가장 큰 값을 작성하세요.
		 */
		
		int[] array = {1,2,3,4,7,8,9,10}; 
		int max = 0;
		Random random = new Random();
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextInt(100) +1;
		}
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값 : "+max);
		
		/*
		 * [문제14]문항
		 *  크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 
		 *  배열의 모든 요소의 평균과 합산을 출력하는 프로그램을 작성하세요.
		 */
		
		int[] array2 = new int[10];
		for(int i=0; i<array2.length; i++) {
			array2[i] = random.nextInt(100) + 1;
			System.out.println(array2[i]);
		}
		
		/*
		 * [문제15]문항
		 *  문자열 "Java Programming"에서 'a'의 개수를 세는 코드를 작성하세요.
		 */
		
		String aa = "Java Programming";
		String[] aa2 = aa.split("");
		
		int con = 0;
		for(int i=0; i<aa2.length; i++) {
			if(aa2[i].equals("a")) {
				++con;
			}
		}
		System.out.println(con);
		
		/*
		 * [문제16]문항
			아이스 아메리카노는 한잔에 5,500원입니다.
 			money가 변수로 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 출력하시오.
			int money = 15000;
			예) 15000원이면 커피 2잔과 4000원이 남습니다.
		 */
		int money = 15000;
		int aic = 5500;
		int my = money / aic;
		money = money % aic;
		System.out.println("커피 : "+my);
		System.out.println("잔돈 : "+money);
		
		/*
		 * [문제17]문항
		길동는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
		길동이네 반 친구들의 키가 담긴 정수 배열 array와 길동이의 키 height가
		변수로 주어질 때, 길동이보다 키 큰 사람 수를 출력하시오.
		int[] array = {149, 180, 192, 170};
		int height = 167;
		예) 149, 180, 192, 170 중 길동이보다 키가 큰 사람은
		180, 192, 170으로 세 명입니다.
		 */
		int[] array3 = {149, 180, 192, 170};
		int height = 167;
		for(int i=0; i<array3.length; i++) {
			if(array3[i] > height) {
				System.out.println("길동이보다 기가큰 사람은"+array3[i]+"입니다");
			}
		}
		
		/*
		 * [문제18 - 난이도 Up]문항군 전략가 길동이는 전쟁 중 적군이 다음과 같은
		 * 암호 체계를 사용한다는 것을 알아냈습니다.
		 1. 암호화된 문자열 cipher를 주고받습니다. 
		 2. 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		  문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 출력하시오. 
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		예) "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째, 24번째
		 글자를 합친 "attack"을 출력합니다
		 */
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		
		
		
		
		

	}

}
