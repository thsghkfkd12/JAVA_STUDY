package java_study_1220;

/*
 * 1. 모든 Java의 클래스는 Object를 상속받고 있음
 * 2. 기본 생성자
 */
class B extends Object{
	// 1. 필드변수(전역변수) : 모든 메소드에서 접근 가능
	int x;
	
	public B() { // default 생성자
		// 생성자 특징
		/*
		 * 1. 리턴값 없음
		 * 2. 메소드이름과 클래스이름이 동일
		 */
	}
	// 오버로딩 : 메소드이름은 동일하나 파라미터 값이 다를 때
	// 오버로딩 => 메소드이름 짓기 힘들어서
	public B(int x) { // 파라미터 값이 존재한 생성자
		this.x = x; // this를 이용해서 파라미터 값을 필드변수 'x'에 대입
	}
	
	public void showMessage() {
		System.out.println("안녕하세요 저는 B클래스 입니다.");
	}
	
}

// extends : 상속
// Java는 다중상속을 지원 X => interface
// implements : 구현하다 ('A' 클래스는 'C'를 구현하다.
class A extends B implements C{
	// A클래스는 '자식클래스' B클래스는 '부모클래스'
	/*
	 * A클래스는 B클래스에 선언된 메소드와 필드변수를 사용할 수 있음.
	 * 단, 접근지정자가 public 혹은 protected로 도어있어야 함
	 */
	@Override
	public void showMessage() { // 부모클래스 메소드 '재정의'(오버라이딩)
		System.out.println("저는 A클래스 입니다.");
	}

	@Override
	public void showMessage2() {
		/*
		 * 인터페이스에 정의된 메소드를 '강제로' 구현해야하는 특징을 가지고 있음, (계약 관계)
		 */
		System.out.println("인터페이스 메소드 재정의 하기");
	}
}	
interface C{ // 정의서
	/*
	 * 인터페이스는 메소드 '선언'만 사능 '구현' 불가능
	 */
	public void showMessage2();
}


public class 복습 {

	public static void main(String[] args) {
		
		A a = new A(); // A클래스 호출('A'클래스 객체 생성
		//A클래스는 부모의 필드변수와 메소드를 사용할 수 있음
		a.showMessage();
		a.x = 10;
		a.showMessage2();

	}

}
