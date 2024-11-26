package java_study_1126;

import java.util.Random;

public class 배열2 {

	public static void main(String[] args) {
		
		// 자바에서 배열을 만드는 방법은 총 2가지임.
		// 첫번째 -> 값이 처음부터 들어있음
		int [] array = {2,3};
		// 두번째
		int []array2 = new int[2]; // 길이만 생성 안에 값 존재 X
		System.out.println("배열 길이는 : " +array2.length);
		
		// 값 넣기
		array2[0] = 10;
		array2[1] = 20;
//		array2[2] = 30; // 배열길이는 2인데 3번째에 20을 넣으려고 하니 에러 발생!
//		System.out.println(array[2]);
		System.out.println(array2[1]);
		// 첫번째 두번째 둘다 많이 쓴다.
		
		// 배열에 랜덤한 값 넣기
		int []numbers = new int[10]; // 10개 공간을 가진 배열 생성!
		// 1~100까지 중 랜덤 값을 배열에 차례로 넣을 예정
		
		// 자바에서는 랜덤값을 Random이라는 클래스를 이용합니다.
		Random random = new Random(); // 랜덤클래스 생성 : 컨트롤 + 쉬프트 + o
		numbers[0] = random.nextInt(100)+1; // 1부터 100까지의 랜덤값을 0번째 인덱스에 대입함.
		System.out.println("0번째 인덱스 값은 : " +numbers[0]);
		// 쿠즈 0번째 ~ 9번째 인덱스에 랜덤 값 넣기!
		numbers[0] = random.nextInt(100)+1;
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
			System.out.println("값 : "+numbers[i]);
		}
		
	}

}
