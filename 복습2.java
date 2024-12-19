package java_study_1219;

/*
 *  *상속(다형성)*
 */
class X{
	
	int money;
	
	public X(int money) {
		this.money = money;
	}
	
	public void showMeTheMoney() {
		System.out.println("my money : " + this.money + "$");
	}
}

class B { // 만수루 B 클래스 등장
	public void showMeTheMoney() {
		System.out.println("my money : " + 100000000 + "$");
	}
}

// extends : 상속하다
// 아쉽게도 Java는 다중상속이 불가능합니다. (C++, Python 다중상속을 지원합니다.)
class Y extends X{ // Y클래스가 X클래스를 상속받다.
	// Y클래스는 X클래스의 필드변수와 메소드를 사용할 수 있다.
	int myMoney;
	
	// 부모클래스에서 기본생성자를 수정했다면 자식클래스 생성자에서 부모클래스 생성자를 무조건 호출해야한다.
	public Y() {
		super(40000); // public X(int money) {}
	}
	
	/*
	 * int를 리턴하는 getMoney 메소드
	 */
	public int getmyMoney() {
		return this.money;
	}
	
	@Override // 부모클래스에 정의된 메소드 '재정의(오버라이딩)'
	public void showMeTheMoney() {
		System.out.println("my(Y) money : " + 900000 + "$");
	}
		
	public void showMessage() { // 리턴값이 없는 void 메소드
		System.out.println("안녕하세요, Y입니다.");
	}
}


public class 복습2 {

	public static void main(String[] args) {

		X x = new X(0); // X클래스 호출(객체 생성 or 인스턴스화)
		x.showMeTheMoney();
		// x는 showMessage가 없음
		// 부모클래스는 자식클래스의 메소드와 필드변수를 사용할 수 없음
		/*
		 * 자식은 부모의 메소드와 필드변수를 사용할 수 있지만
		 * 부모는 자식클래스의 메소드와 필드변수를 사용할 수 있다. 
		 */
		
		Y y = new Y(); // Y클래스 호출
		y.showMeTheMoney(); // X클래스에서 정의된 메소드 사용
		y.showMessage();
		
		int result = y.getmyMoney(); // 리턴타입이 있는 메소드 호출
		// resulit 변수에 getmyMoney 최종값을 리턴받음.
		System.out.println("result : " +result);
	}

}
