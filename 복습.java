package java_study_1126;

public class 복습 {

	public static void main(String[] args) {  // 메인함수
		
		// for문 (반복문)
		for(int i=0; i<3; i++) {
//			System.out.println("Hello world!");
		}
		
		// 1부터 100까지의 숫자 중 3의 배수... 범위가 정해지면 for문 아니면 while문
		for(int i =1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) { // 3과 5의 공배수
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else
				System.out.println(i);
		}
		
		// 세균 : 1시간에 두배만큼 증식
		int n = 2;
		int t = 10;
		// 1시간부터 10시간이라는 범위가 정해짐 -> for
		for(int i=1; i<=t; i++) { // 10번 실행
			n = n * 2;
			// n *= 2;
			System.out.println(n);
		}
		
		// 콜라츠 추측
		/* 주어진 수가 1이 될 때까지
		 * 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다.
		 * 작업은 다음과 같습니다. => 범위 지정 x => while문으로 코딩하자!
		 */
		int count = 0; // 몇번 반복하는지 체크하는 변수
		int n2 = 6; // 주어진 수
		while(n2 != 1) {  // n2가 1이 될때까지 계속 반복함
			if(n2 % 2 == 0) { // 짝수야?
				n2 = n2 / 2; // 짝수라면 2로 나눈다.
				++count;
			}else { // 짝수가 아니라면?
				n2 = n2 * 3 + 1; // 3을 곱하고 1을 더함
				++count;
			}
		}
		System.out.println("count : " +count); // 8번 만에 1이 됩니다.
		
		
		
		
		

	}

}
