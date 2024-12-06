package java_study_1206;

import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
		
		// 7번
		int n = 15;
		// 7조각을 주는 이상한 피자가게
		// 상수 변수명은 대문자로
		final int SLICE = 7; // 한판에 7조각
		
		// 게시판에서 많이쓴다.
		int x = n % SLICE;
		int result = n / SLICE;
		if(x > 0) { // 못먹은 사람이 있다면
			++result; // 증감 연산자로 한판 더
		}
		
		// 8번 팩토리얼
//		System.out.println("정수 입력받기 : ");
		Scanner scan = new Scanner(System.in);
////		int num = scan.nextInt();
//		int factorial = 1;
////		for(int i=2; i<=num; i++) {
//			factorial = factorial * i;
//		}
////		System.out.println(num+"!="+factorial);
		
		// 10번 다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
		/*
		  ****
		  ***
		  **
		  *
		 */
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 개행용
		}
		
		// 11번 힌트는 .length() 이용해서 if/else 처리하기
		String word = "hh";
		System.out.println("문자 길이 : "+word.length());
		
		// 17번
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int count = 0;
		// for-each 이용해서 풀어보가기
		for(int i : array) {
			if(height < i) { // if로 키큰사람 체크하기
				++count; // 증감연산자 이용
			}
		}
		System.out.println("정답 : "+count);
		
		
		/*
		 * [문제18 - 난이도 Up]문항군 전략가 길동이는 전쟁 중 적군이 다음과 같은
		 * 암호 체계를 사용한다는 것을 알아냈습니다.
		1. 암호화된 문자열 cipher를 주고받습니다. 
		2. 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		  문자열 cipher와 정수 code가 변수로 주어질 때 해독된 암호 문자열을 출력하시오. 
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		예) "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째, 24번째
		 글자를 합친 "attack"을 출력합니다
		 */
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
//		System.out.print(cipher.substring(3, 4));
//		System.out.print(cipher.substring(7, 8));
//		System.out.print(cipher.substring(11, 12));
//		System.out.print(cipher.substring(15, 16));
//		System.out.print(cipher.substring(19, 20));
//		System.out.print(cipher.substring(23, 24));
		String answer= ""; // 최종 결과
		for(int i=0; i<cipher.length(); i++) { //문자 길이만큼 반복문 돌리기
			if((i+1) % code == 0) { // code의 배수라면?
				answer += cipher.substring(i, i+1); // substring으로 한글자만 가져옴
			}
		}
		System.out.println("해독한 단어는 : "+answer+"입니다.");
		
		/*
		 *  [문제19 - 난이도 Up]문항
			전화번호 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한
			나머지 숫자를 전부 *으로 가린 문자열을 출력하는 프로그램을 완성해주세요.
			 String phone_number = “0171238888”;
			예)
			027778888은 *****8888
			01033334444은 *******4444가 나와야 합니다.
		 */
		// 첫번째 방법
		String phone_number = "027778888";
		
		int temp = phone_number.length() - 4; // 4자리를 제외한
		String star = "";
		for(int i=0; i<temp; i++) {
			star += "*"; 
		}
		String lastNumber= phone_number.substring(temp); // 6번째 자리부터 모두 나오게 하기
		System.out.println("lastNumber : "+lastNumber);
		phone_number = star + phone_number.substring(temp);
		System.out.println("phone_number : "+phone_number);
		
		// 2번째 방법split
		String[] num =phone_number.split(""); // split으로 한글자 한글자 배열에 담기
		String result2 = ""; //결과
		for(int i=0; i<num.length; i++) { // 배열 길이만큼 반복
			if(i < (phone_number.length()-4)) {
				result2 += "*";
			}else {
				result2 += num[i];
			}
		}
		System.out.println("result2 : "+result2);
		
		String str = "Hello";
		String str2 = "World";
		System.out.println(str + str2); // HelloWorld
		String a = "";
		for(int i=0; i<3; i++) {
			a += "!";
		}
		System.out.println(a);
		// "=" : 대입연산자 (덮어씌우기, 기존 값을 무시하고 새로운 값을 대입함)
		
		/*
		 * [문제20 - 난이도 Up] [while문 이용하기]문항  사칙연산
			○○치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
			쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도쿠폰이 발급됩니다. 
			시켜먹은 치킨의 수 chicken이 변수로 주어질 때받을 수 있는 최대 서비스 치킨의 수를 출력하세요.
			int chicken = 100;
			예)
			1. 1081마리를 주문하면 쿠폰이 1081장 발급되므로 서비스 치킨 108마리를 주문할 수 있습니다. 
			그리고 쿠폰이 1장 남습니다. 
			2. 108마리를 주문하면 쿠폰이 108장 발급되므로 서비스 치킨 10마리를주문할 수 있습니다. 
			그리고 쿠폰이 8장 남습니다.
			 3. 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를
			주문할 수 있습니다. 
			4. 1마리를 주문하면 쿠폰이 1장 발급됩니다.
			 5. 가지고 있는 쿠폰이 총 10장이므로 서비스 치킨 1마리를 추가로주문할 수 있습니다.
			  6. 따라서 108 + 10 + 1 + 1 = 120 을 출력합니다.
		 */
		int chicken = 100; // 백마리 주문
		int chickenCount = 0; // 총 내가 먹을 수 있는 치킨수
		// 1. 반복을 하면서 쿠폰이 있는지? 었는지를 계속 체크해야합니다.
		// 2. 10번 반복할지 5번 반복할지 모름 -> while
		while(chicken >= 10) { // 3. 조건식 생각하기
			int coupon = chicken % 10; // 나머지값을 쿠폰에 대입
			chickenCount += chicken / 10;
			chicken = coupon + chicken / 10;
		}
		System.out.println("최대 서비스 치킨 수 : "+chickenCount);
		
		/*
		 * [문제21 - 난이도 Up] [contains 활용하기]문항
		문자열 my_string이 변수로 주어집니다.
		 my_string에서 중복된 문자를 제거하고
		하나의 문자만 남긴 문자열을 출력하세요. 
		String my_string = "people";
		예) "people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 출력합니다.
		 */
		String my_string = "people"; // p와 e가 중복됨
		String[] strArray = my_string.split("");
		String result3 = ""; // 최종 결과
		for(int i=0; i<strArray.length; i++) {
			if(!result3.contains(strArray[i])) {
				result3 += strArray[i];
			}
		}
		System.out.println("정답 : "+result3);
 		
		/*
		 *[문제22 - 난이도 Up]문항
		개미 군단이 사냥을 나가려고 합니다.
		개미군단은 사냥감의 체력에 딱 맞는병력을 데리고 나가려고 합니다. 
		장군개미는 5의 공격력을, 병정개미는 3의공격력을 일개미는 1의 공격력을 가지고 있습니다.
		 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고
		가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면더
		적은 병력으로 사냥할 수 있습니다.
		사냥감의 체력 hp가 변수로 주어질 때, 
		사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가필요한지를 출력하시오.
		int hp = 24;
		예)
		1. hp가 24이므로, 장군개미 네마리 병정개미 한마리 일개미 한마리로
		사냥할 수 있습니다. 따라서 6을 출력합니다.
		 2. hp가 999이므로, 장군개미 199 마리 병정개미 한마리 일개미 한마리로
		사냥할 수 있습니다. 따라서 201을 출력합니다.
		 */ 
		// 그리드(탐욕) 알고리즘
		int hp = 24; // 여치 hp
		int count2 = 0;
		
		count2 += hp / 5; // 장군개미
		hp %= 5;
		count2 += hp / 3 ; // 병정개미
		hp %= 3;
		count2 += hp;
		System.out.println(count2);
		
		
		
		
		
		
		
		
	
	}

}
