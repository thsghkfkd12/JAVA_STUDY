package java_study_1217;

import java.util.Scanner;

/*
 * 계산기 클래스는 더 이상 수정불가능 (내장클래슨느 실제 수정 불가능)
 * Scanner 클래스 -> 내장 클래스(자바를 설치했을 때 이미 자바안에 있는 클래스 들)
 * Random 클래스 
 */
class 계산기{
	// 파라미터값을 각 더해서 리턴하는 함수 sum
	public int sum(int x, int y) {
		return x + y;
	}

class 계산기2{
	// 파라미터값을 각 더해서 리턴하는 함수 sum
	public int sum(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
}
}
// *****extends : 상속 
// 상속을 이용해 '계산기' 클래스 기능을 물려 받을 수 있음'
// '계산기3'(자식클래스 == subClass)은
//'계산기'(부모클래스 == superClass)에 있는 필드변수와 메소를 사용할 수 있다.

class 계산기3 extends 계산기{
	
	// 부모클래스에 있는 메소드 가져오기
	// @Override : 오버라이딩(부모클래스 메소드 ***************'재정의')
	/*
	 * 오버로딩 : 메소드 이름은 중복 허용하기(파라미터 타입 다르게 지정)
	 * 오버라이딩 : 부모클래스에 정의된 메소드를 자식클래스에서 호출해서 메소드 '재정의'
	 */
	@Override 
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return super.sum(x, y);
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
}

public class 수업 {

	public static void main(String[] args) {
		
		계산기 계산기1 = new 계산기();
		int result = 계산기1.sum(10, 10);
		System.out.println("결과 : "+result);
		
		// 빼기와 더하기 기능이 있는 클래스가 필요
		/*
		 * 자바는 **무료 오픈소스**이기 때문에 내장클래스를 확인할 수 있음
		 */
		Scanner scan = new Scanner(System.in); // 컨트롤쉬프트영어o (자동 임포트)
		
		계산기3 계산기3 = new 계산기3();
		계산기3.sum(10, 20); // 자식클래스가 부모클래스에 있는 메소드 사용 가능
		
	}

}	
