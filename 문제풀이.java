package java_study_1212;

class Book{
	String title;
	String author;
	
	Book(String title,String author) {
		
		this.title = title;
		this.author = author;
		
	}
}

//class Calculator{
//	int 게임;
//	
//	public int add(int a, int b) {
//		return a+b;
//	}
//	
//}

public class 문제풀이 {

	public static void main(String[] args) {
		/*
		 * [문제1]문항
			클래스 내에서 같은 이름의 메소드를 여러 개 정의하는 것을 무엇이라고 하는가?
			a) 오버라이딩
			b) 오버로딩
			c) 캡슐화
			1 정답 b) 오버로딩
		 */
		/*[문제2]문항
			객체의 필드 값을 반환하는 메소드를 일반적으로 무엇이라고 부르는가?
			a) getter
			b) setter
			c) constructor
			d) finalizer
		 * 1 정답 a) getter
		 */
		
		/*
		 * [문제3]문항
			Java에서 메소드의 반환 타입을 지정하지 않을 때 사용하는 키워드는?
			a) null
			b) void
			c) empty
			d) none
			3. 정답 b) void
		 */
		
		/*
		 * [문제4]문항
			다음 중 올바른 메소드 선언은?
			a) public void myMethod();
			b) public void myMethod() { }
			c) public myMethod() { }
			d) void public myMethod() { }
			4. 정답 b) public void myMethod() { }
		 */
		
		/*
		 * [문제5]문항
			메소드 오버로딩(Overloading)에 대한 설명으로 옳은 것은?
			a) 같은 이름의 메소드를 여러 개 정의하는 것
			b) 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것
			c) 메소드의 접근 제어자를 변경하는 것
			d) 메소드의 반환 타입을 변경하는 것
			4. 정답 a) 같은 이름의 메소드를 여러 개 정의하는 것
		 */
		
		/*
		 * [문제6]문항
			다음 중 메소드의 반환 타입을 올바르게 설명한 것은?
			a) 메소드가 실행되는 횟수를 나타낸다.
			b) 메소드가 반환하는 값의 데이터 타입을 나타낸다. 
			c) 메소드의 매개변수 개수를 나타낸다. 
			d) 메소드의 접근 제어자를 나타낸다
			6. 정답 b) 메소드가 반환하는 값의 데이터 타입을 나타낸다. 
		 */
		
		/*
		 * [문제7]문항
		다음 중 메소드의 매개변수 전달 방식에 대한 설명으로 옳은 것은?
		a) 기본 자료형은 참조에 의한 전달(Pass by Reference)이다. 
		b) 참조 자료형은 값에 의한 전달(Pass by Value)이다. 
		c) 기본 자료형은 값에 의한 전달(Pass by Value)이다. 
		d) 모든 자료형은 참조에 의한 전달(Pass by Reference)이다.
		7. 정답 a) 기본 자료형은 참조에 의한 전달(Pass by Reference)이다. 
		 */
		
		/*
		 * [문제8]문항
		 *  Calculator 클래스를 생성 후 두 정수를 매개변수로 받아 
		 *  그 합을 반환하는 메소드 add를 작성하세요.
		 */
//		Calculator a1 = new Calculator();
//		int as = a1.add(10, 20);
//		System.out.println("결과 : "+as);
		
		/*
		 * [문제10]문항
		객체를 생성할 때 사용하는 키워드는?
		a) class
		b) new
		c) this
		d) static
		10. 정답 a) class
		 */
		
		/*
		 * [문제11]문항
			클래스의 주요 구성 요소가 아닌 것은?
			a) 필드
			b) 메소드
			c) 생성자
			d) 루프
			10. 정답 d) 루프
		 */
		
		/*
		 * [문제12]문항
			클래스 내에서 데이터를 저장하는 변수를 무엇이라고 하는가?
			a) 메소드
			b) 생성자
			c) 필드
			d) 객체
			12. 정답 c) 필드
		 */
		
		/*
		 * [문제13]문항
			클래스의 인스턴스를 생성할 때 자동으로 호출되는 특별한 메소드는?
			a) main 메소드
			b) 생성자
			c) getter 메소드
			d) setter 메소드
			13. 정답 b) 생성자
		 */
		
		/*
		 * [문제14]문항
			[객체 생성하기]
			"Book" 클래스를 정의하고,
			제목(title)과 저자(author)를 속성으로 추가한 후, 
			이 클래스의 객체를 생성하는 코드를 작성하세요. 
		 */
		
		Book 책 = new Book("책","저자");
		System.out.println(책.title);
		System.out.println(책.author);
		
		

	}

}
