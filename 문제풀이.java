package java_study_1203;

public class 문제풀이 {

	public static void main(String[] args) {
		/* 
		 * 2. concat
		 * 3. split
		 */
		// 4. 대문자로 변환
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		// 5. 
		String x = "고구마";
		String y = "고구마";
		if(x == y) { 
			// 위에 코드는 문자를 비교하는게 아닌
			// 메모리에 저장된 주소를 비교하는 것
			System.out.println("같습니다.");
		}
		if(x.equals(y)) { // 문자 비교
			System.out.println("같습니다.");
		}
		
		// 6.
		String h = "흑백요리사";
		System.out.println(h.substring(0,1)); // 첫번째
		System.out.println(h.substring(h.length()-1, h.length())); // 마지막 단어
		
		// 7. substring
		
		// 8. 위문자열어서 "a"가 몇 번 나타나는지 세는 프로그램을 작성하세요.
		String word = "aabbacccaaaaa";
		String[] array = word.split("");
		int count = 0;
		for(int i=0; i<array.length; i++) { // 일반 for
			if(array[i].equals("a")) {
				++count;
			}
		}
		System.out.println("총 : "+count);
		
		String a = array[0];
		System.out.println(a);
		
		for(String i : array) { // 배열의 길이만큼 자동으로 반복한다. (for-each문)
			// i에 자동으로 배열값이 대입됨
			System.out.println("배열 값 : "+ i);
		}
		
		// 문제 10
		/*
		 * 문자열 배열 strArr가 주어집니다.
		 *  배열 내의 문자열 중 "ad"라는 부분 문자열을
			포함하고 있는 모든 문자열을 제외하고 출력하세요.
		 */
		String[] strArr = {"and","notad","abcd"};
		for(String i : strArr) {
			if(!i.contains("ad")) { // ad가 포함되어 있다면?, ! = ad가 없다면
				System.out.println(i);
			}
			if(i.contains("ad") == true) { // 잘못된 코드
				// contains가 true 혹은 false인데, 한번 더 true를 비교할 필요는 없다.
			}
		}
		
		// 문제 11
		/*
		 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
		 문자열 my_string이 변수로 주어질 때 모음을 제거한 문자열을 출력하세요.
		*/
		String my_string = "nice to meet you";
		String[] vow = {"a","e","i","o","u"}; // 1. 모음 배열 초기화(선언)
		for(String i : vow) { // 2. 모음을 for-each로 반복돌린다.
			my_string = my_string.replaceAll(i, ""); // 3. replaceAll로 모음을 ""로 대체
		} 
		System.out.println(my_string); // 출력!
		
		// 문제 12
		/*
		 * 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		    문자열 numbers가 변수로 주어질 때, numbers를 정수로 바꿔 출력하세요.
		 */
		String numbers = "onefourzerosixseven"; // 결과 : 14067
		String[] matchNumbers = {"zero","one","two","therr","four","five","six","seven","eight","nine"}; // 1.배열 초기화
		
		for(int i=0; i<matchNumbers.length; i++) { // 2. 반복문 생성
			// 3. replaceAll로 특정 단어 숫자로 교체
			// Integer.toString : 숫자에서 -> 문자로 변환
			String n = matchNumbers[i] ;
			numbers = numbers.replaceAll(matchNumbers[i], Integer.toString(i));
		}
		System.out.println("정답 : "+numbers);
		
		
		
		
		
		

	}

}
