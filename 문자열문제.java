package java_study_1128;

import java.util.Scanner;

public class 문자열문제 {

	public static void main(String[] args) {
		
		/*
		 * 같이 풀어보기
		 * contains를 이용해서 특정 이메일 추출하기
		 */
//		String[] email = {"123@naver.com", "456@gmail.com", "789@naver.com"};
//		// 네이버 이메일을 사용하는 계정만 출력하기
//		for(int i=0; i<email.length; i++) {
//			String e = email[i];
//			System.out.println("이메일 주소 : " +e);
//			if(e.contains("naver.com")) {
//				System.out.println("네이버 이메일 : " +e);
//			}
//		}
		// split을 활용하여 특정 문자 개수 구하기
//		String food = "돈까스@돈까스@라면@김밥@돈까스";
//		String[] foodArray = food.split("@"); // @기중으로 문자 나누기
//		
//		int count = 0;
//		for(int i=0; i<foodArray.length; i++) {
//			if(foodArray[i].equals("돈까스")) { // 돈까스랑 비교
//				++count;
//			}
//		}
//		System.out.println("돈까스 개수는 : " +count);
		
		/*
		 * 문제1]문항 사용자로부터 문자열을 입력받아 문자 길이를 출력하세요.
		 */
		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요 : ");
//		String text1 = scan.next();
//		System.out.println("문자열 길이 : "+text1.length());
		
		/*
		 * [문제2]문항 문자열을 연결하는 함수는 무엇인가?
		① split
		② substring
		③ concat
		④ replace
		 */ // 3번
			//concat
		
		/*	[문제3]문항
		   "010-1234-5678" 문자열이 주어질 때 "-" 기준으로 문자열을 분할하려면
			어떤 문자열 함수를 사용해야하는가?
			① split
			② substring
			③ concat
			④ replace
		 */ //1번
		// split
		
		/*[문제4]문항 String text = "Hello World!";
		위 문자열을 모두 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		 */
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
	
		/*문제5]문항
		사용자로부터 두 개의 문자열을 입력받아
		두 문자열이 같으면 “같습니다.” 틀리면 “다릅니다.” 를 출력하는
		프로그램을 작성하세요. 
		 */
//		System.out.println("첫번째 문자를 입력해주세요 : ");
//		String tex = scan.next();
//		System.out.println("두번째 문자를 입력해주세요 : ");
//		String tex2 = scan.next();
//		System.out.println(tex.equals(tex2));

		/*[문제6]문항
			사용자로부터 문자열을 입력받아 그 문자열의
			첫 번째와 마지막 문자를 출력하는 프로그램을 작성하세요.
			예) "안녕하세요" 라는 문자열을 입력했을 때 “안”과 “요”만 출력합니다
		 */
//		System.out.println("문자를 입력해주세요 : ");
//		String tex3 = scan.next();
//		System.out.println(tex3.substring(0, 1));
//		System.out.println(tex3.substring(4, 5));
		
		/*[문제7]문항
			사용자로부터 문자열과 정수 n을 입력받아,
			해당 문자열의 앞에서 n개의 문자를 출력하는 프로그램을 작성하세요.
			예)입력받은 문자열 “아메리카노
			입력받은 정수 n이 3이라고 가정
			해당 문자열의 앞에서 3개의 문자 “아메리”가 출력
		 */
//		System.out.println("문자를 입력해주세요 : ");
//		String tex4 = scan.next();
//		System.out.println("정수를 입력해주세요 : ");
//		int n = scan.nextInt();
//		System.out.println(tex4.substring(0,n));
		
		/*문제8]문항
		String word = "aabbacccaaaaa";
		위 문자열에서 “a”가 몇 번 나타나는지 세는 프로그램을 작성하세요
		 */
//		String word = "aabbacccaaaaa";
//		String[] wordArray = word.split("");
//		
//		int count2 = 0;
//		for(int i=0; i<wordArray.length; i++) {
//			if(wordArray[i].equals("a")) { // 돈까스랑 비교
//				++count2;
//			}
//		}
//		System.out.println("a가 몇번 : " +count2);
		
		/*[문제9]문항
		String email = "user@gmail.com";
		위 문자열에서 split을 사용하여 gmail.com만 출력하시오.
		 */
		String email = "user@gmail.com";
		String[] resilt = email.split("@");
		System.out.println(resilt[1]);

		/*[문제10 - 난이도 Up]문항
		문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을
		포함하고 있는 모든 문자열을 제외하고 출력하세요.
		String[] strArr = {"there","are","no","a","ds"};
		예){"and","notad","abcd"} -> {"and","abcd"}
		1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다.
		따라서 해당 문자열을 제외한 "and"와"abcd"가 출력됩니다.
		 */
		String[] strArr = {"and","notad","abcd"};
		
		for(int i=0; i<strArr.length; i++) {
			String s = strArr[i];
		}
		
		/*
		 * [문제11 - 난이도 Up]문항
	영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
	문자열 my_string이 변수로 주어질 때 모음을 제거한 문자열을 출력하세요.
	String my_string = "nice to meet you";
	예)"nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를출력합니다.
		 */
		
		/*[문제12 - 난이도 Up]문항
		영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		문자열 numbers가 변수로 주어질 때, numbers를 정수로 바꿔 출력하세요.
		String numbers = "onefourzerosixseven"; //14067
		예) "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 출력합니다. 
		 */
		
	}

}
