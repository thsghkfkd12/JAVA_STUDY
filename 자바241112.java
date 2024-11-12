package java_study;

// 자바 공부를 시작하겠습니다. (메모 <- 주석)
public class 자바241112 {

	public static void main(String[] args) { //중괄호 시작 
		// 여기에 코드를 작성할 예정
		// 문장마지막에는 세미콜른을 작성한다.
		System.out.println("안녕하세요, 오늘 자바를 배웁니다");
		// Ctrl + F11을 동시에 누르면 JAVA가 실행됩니다.
		// System.out.println : 작성한 내용을 확인할 수 있는 기능.
		
		System.out.println("Hello World!");
		
		// syso -> Ctrl + space -> Enter (System.out.println 빠르게 타이핑)
		System.out.println("아무말대잔치");
		// 코드 작성 후 -> Ctrl + s 눌러서 저장을 해줍니다. (이클립스는 자동 저장 X)
		
		System.out.println("현재 년도는 : " + 2024 + "입니다.");
		// Sysetem.out.println : 출력문
		// 출력문에서 + 는 문자를 더해준다는 의미(문자와 문자를 합친다.)
		
		// 아래에 여러문들의 키와 나이를 입력해주세요
		System.out.println("키 : " + 178 + "입니다.");
		System.out.println("나이 : " + 25 + "입니다.");
		
		// ln은 개행(줄바꿈)을 의미합니다.
		// ln이 없으면 가로로 쭉 출력합니다.
		System.out.print("안녕하세요");
		System.out.print("안녕하세요");
		
		// 변수 : 어떤 값을 대입할 때 사용.
		// int는 숫자를 의미, String은 문자를 의미합니다.
		int age = 20; // 나이
		String address = "대전 서구 둔산동"; // 주소
		String mbti = "ESFJ";
		
		System.out.println("나이는 : " + age);  // age에 대입한 값이 출력됨
		System.out.println("주소는 : " + address); // address에 대입한 값이 출력됩
		System.out.println("MBTI : " + mbti);
		
	}  // 중괄호끝

}
