package java_study_1206;

public class 질문 {
	public static void main(String[] args) {
		
		
		 // [문제22 - 난이도 Up] 개미 군단 -> 그리드(탐욕) 알고리즘
		 int hp = 24; // 여치 hp
		 int count2 = 0;
		 
		 count2 += hp / 5; // 장군개미
		 hp %= 5;
		 
		 count2 += hp / 3 ; // 병정개미
		 hp %= 3;
		 
		 count2 += hp;
		 System.out.println(count2);
		 
		//문제 20
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
			
			//문제 21
			String my_string = "people"; // p와 e가 중복됨
			String[] strArray = my_string.split("");
			String result3 = ""; // 최종 결과
			for(int i=0; i<strArray.length; i++) {
				if(!result3.contains(strArray[i])) {
					result3 += strArray[i];
				}
			}
			System.out.println("정답 : "+result3);
		
	}
}
