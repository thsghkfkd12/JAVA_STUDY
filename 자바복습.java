package java_study;

import java.util.Scanner;

public class 자바복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자는 string, 숫자는 int
		String name = "김경민"; // 이름
		int age = 25; // 나이
		String address = "대전 동구 인동"; // 주소
		String hobby = "소설"; // 취미
		String mbti = "infp"; // mbti
		// name ~ mbti : 변수명(이름)
		//대문자 X -> 소문자 O (개발자들 약속)
 		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("취미 : " + hobby);
		System.out.println("mbti : " + mbti);
		
		// 입력받기
		Scanner scan = new Scanner(System.in);
		// 입력하신 후, Ctrl + shift + o 를 눌러주세요.
		
		System.out.print("이름을 입력해주세요 => ");
		String n = scan.next(); // 따로 입력 출력하는데에
		System.out.println("입력하신 이름은 : "+n+" 입니다."); // 출력하는데 따로 입력
		
		
		
	}

}
