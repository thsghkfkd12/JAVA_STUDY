package java_study_1114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//문제 1번 정수형 변수 age를 선언하고 25를 할당하는 코드를 작성 후 출력 하세요
 
		// 1번 정답
		int age = 25;
		System.out.println("이 정수는 : " +age+ "입니다");
		
		// 문제 2번
		// ○○은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다. ○○은 무엇일까요?
		// 1. 변수
		// 2. 실수
		// 3. 상수
		// 4. 정수
		// 2번 정답 상수
		
		// 문제 3번 문자열 "Hello, Java!"를 출력하는 코드를 작성하세요. 
		
		// 3번 정답
		String k = "Hello,";
		String y = " Java!";
		
		String num = k + y;
		System.out.println("" +num+ "");
		
		// 문제 4번 두 개의 정수 a와 b를 더한 결과를 출력하는 코드를 작성하세요.
		
		// 4번 정답
		int a = 10;
		int b = 5;
		int num2 = a + b;
		System.out.println("두 정수의 값은 : " +num2+"");
		
		// 문제 5번 실수형 변수 height으로 선언하고 180.5를 할당하는 코드를 작성하세요
		
		// 5번 정답
		double height = 180.5;
		System.out.println("" +height+"");
		
		// 문제 6번 사용자로부터 이름과 나이를 입력받아,
		// "안녕하세요, [이름]님! 당신은 [나이]살입니다."라는 메시지를 출력하세요.
		
		// 6번 정답
//		System.out.println("이름을 입력하세요 : ");
//		String nam1 = scan.next();
//		System.out.println("나이를 입력하세요 : ");
//		int ag1 = scan.nextInt();
//		
//		System.out.println("안녕하세요 " +nam1+ "님! 당신은" +ag1+"살입니다" );
		
		// 문제 7번 다음 각 데이터 타입에 맞는 변수를 선언하고 적절한 값으로 초기화하세요. 
	        //    1. 정수형 (int) 7
		int v = 7;
		System.out.println("정수형 : "+v+"");
			//    2. 실수형 (double) 10.00
		double c = 10.51;
		System.out.println("실수형 : "+c+"");
		    //    3. 문자형 (char) 'a'
		char N = 'a';
		System.out.println("문자형 : "+N+"" );
		    //    4. 논리형 (boolean) true
		boolean n = true;
		System.out.println("논리형 : "+n+"");
		
		// 문제 8번 사용자로부터 두 개의 정수를 입력받아, 그 합을 출력하세요
	
		// 8번 정답
//		System.out.println("첫번째 정수를 입력하세요 : ");
//		int m = scan.nextInt();
//		System.out.println("두번째 정수를 입력하세요 : ");
//		int M = scan.nextInt();
//		
//		int Z = m + M;
//		System.out.println("두 정수의 값 : "+Z+"");
		
		// 문제 9번
		// 문자형변수 x를 선언하고 “10”을 할당 후 정수형 변수 y를 선언하고
		// x의 값을 y에 할당하세요.
		// HINT) Integer.parseInt
		
		// 9번 정답
		String z = "10";
		int A = 10;
		int S = Integer.parseInt(z);
		
		int D = A + S;
		System.out.println(""+D+"");
		
		
		// 문제 10번
//		다음 중 잘못된 식별자(변수이름)는?
//				1. monster3
//				2. apple_13_pro
//				3. 3apple
//				4. AaaAAA

		// 10번 정답 3apple
		
		// 문제 11번
		// 아래와 같이 사용자로부터 3개의 정수를 입력받아, 평균을 출력하세요.(소수점 제외)
		System.out.println("첫번째 정수를 입력하세요 : ");
		int C = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int Q = scan.nextInt();
		System.out.println("세번째 정수를 입력하세요 : ");
		int E = scan.nextInt();
		int avg = (C + Q + E) / 2;
		System.out.println("입력받은 세정수의 평균은 : "+avg+"입니다.");
		// 11번 정답
	}

}
