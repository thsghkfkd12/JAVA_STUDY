package java_study_1122;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {

		/*[문제1]
		문항 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요. 
		 */
		for(int i=1; i<=10; i++) {
			System.out.println("i : "+i);
		}
		
		/*[문제2]
		문항 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
		 */
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"는 짝수입니다.");
			}
			
		}
		
		/*[문제3]
		 * 문항 1부터 100까지의 숫자 중 짝수 개수를 구하는 프로그램을 작성하세요. 
		 */
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum++;
				System.out.println(i+"는 짝수입니다."+sum);

			}
		}
		
		/*[문제4]
		 * 문항 사용자로부터 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 입력 : ");
		int gg = scan.nextInt();
		for(int i=1; i<=9; ++i) {
			System.out.println(gg+"*"+i+"="+gg*i);
		}
		
		/*문제5]
		문항 1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요. 
		 */
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				System.out.println(i+"는 3의 배수입니다.");
			}
		}
		
		/*[문제6]
		문항 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램을 작성하세요.
		 팰토리얼 : 5! = 5 * 4 * 3 * 2 * 1
		예) 5를 입력받으면 5*4*3*2*1 값인 120이 나와야합니다.
		*/
	
		
		int num = 5;
		int fac = 1;
		for(int i=1; i <= num; i++) {
			fac = fac * i;
			System.out.println(fac);
		}

		/*[문제7]
			문항 1부터 100까지의 숫자 중 3의 배수는 "Fizz", 5의 배수는 "Buzz",
			3과 5의 공배수는 "FizzBuzz"를 출력하고, 나머지 숫자는 그대로
			출력하는 프로그램을 작성하세요.
			*/
		
		for(int i=1; i<=100; i++) {
			 if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.err.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		
		/*문제8] 문항 1부터 10까지의 합을 구하는 프로그램 작성하기
		 */
		int ss = 0;
		for(int i=0; i<=10; i++) {
			ss = ss + i;
			System.out.println("1부터 10까지의 합 : " +ss);
		}
		
		/*
		 * [문제11] 문항
			떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때 t시간 후
			세균의 수를 출력하세요.
			int n = 2;
			int t = 10;
			예) 처음엔 2마리, 1시간 후엔 4마리, 2시간 후엔 8마리, ..., 10시간 후엔
			2048마리가 됩니다. 따라서 2048을 출력합니다.
		 */
		int n = 2;
		int t = 10;
		for(int i=n; i<=t; ++i) {

			System.out.println(n);
			
		}
		

		
		
	}

}
