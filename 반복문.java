package java_study_1126;

public class 반복문 {

	public static void main(String[] args) {
		
		/*
		 이중 for문(중첩 반복)
		 반복문이 다름 바복문을 내포하는 구조
		 이론적으로 2중 3중 4중 ...... n중 까지 가능하나,
		 너무 많은 중첩은 프로그램 구조를 복잡하게 한다. 그래서 2중 중첩이 가능하다.
		*/
		// 3번 1번출력하고 6 번 모두출력 3번 모두출력 할때까지 반복
		       //1번  2번  
		for(int i=0; i<3; i++) { // 아우터 for문
//			 System.out.println("아우터 for문"); // 3번 1번 출력 총 3번
			// 3번 1번 출력 6번 3번 출력 3번 1번 출력 6번 3번  출력3번 1번 출력 6번 3번 
			   //   4번   5번   7번
			for(int j=0; j<3; j++) { // 이너 for문 
//				System.out.println("이너 for문"); // 6번 3번출력 총 9번
			}
		}
		// 아우터 for문이 먼저 실행 -> 이너 for문 모두 실행 -> 아우터 for문 실행 ....
		
		// 구구단 (이주 for문 이용)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
//				System.out.println(i+ "*" +j+"="+j*i);
			}
		}
		// 직사각형 출력(이중 for문)
		int a = 5; // 가로 길이
		int b = 3; // 세로 길이
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*"); // ln아님 print(ln)
			}
			System.out.println(); // 단순 공백 출력
		}
			
		/* [문제9]문항
			다음과 같은 패턴을 출력하는 프로그램을 작성하세요. 사용자로부터 줄 수를 입력받습니다. 
			*
			**
			***
			****
			*****
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*[문제10]문항
			다음과 같은 패턴을 출력하는 프로그램을 작성하세요. 사용자로부터 줄 수를 입력받습니다.
			*****
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
		// v2
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
