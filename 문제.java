package java_study_1219;

//class Animal {
//	 public void makeSound() {
//	 System.out.println("The animal makes a sound");
//	 }
//}
//
//class Dog extends Animal {
//	
//	@Override 
//	public void makeSound() {
//		 System.out.println("The dog barks");
//	}
//}

//Vehicle 기본(default) 상속클래스는 Object
class Vehicle extends Object{
 //protected : 동일 패키지 혹은 상속받은 클래스에서 접근 가능
 //*public : 동일 프로젝트 안에서 모든 클래스가 접근 가능
 //*private : 클래스 안에서만 접근 가능, 외부 호출 불가능(데이터 보호)
 protected String brand = "Ford";

 public Vehicle() {
    System.out.println("Vehicle constructor called");
 }
 
 public void honk() {
    System.out.println("Tuut, tuut!");
 }
}
/*
* Car 자식클래스
* Vehicle 부모클래스
*/
class Car extends Vehicle {
 //private : Car 클래스 안에서만 사용가능합니다. *외부로 호출 불가능
 private String modelName = "Mustang";

 public Car() {
    super(); //부모 생성자 호출 (부모 생성자가 기본생성자일 경우 생략가능)
    //super()는 항상 위에다 작성!
    //기본 생성자가 가정 먼저 호출됩니다.
    System.out.println("Car constructor called");
 }

 @Override
 public void honk() {
    System.out.println("Beep, beep!");
 }

 public void printInfo() {
    System.out.println(brand + " " + modelName);
 }
}



public class 문제 {

	public static void main(String[] args) {
		
		/*
		 *[문제1]문항
		자바에서 상속을 구현할 때 사용하는 키워드는?
		a) extends
		b) implements
		c) inherit
		d) super 
		 */ // 1번 문제 정답 a) extends
		
		/*
		 * [문제2]문항
			자바에서 모든 클래스의 최상위 클래스는?
			a) Main
			b) Super
			c) Object
			d) Base
		 */ // 2번 문제 정답 c) Object

		/*
		 * [문제3]문항
			상속의 주요 장점이 아닌 것은?
			a) 코드 재사용
			b) 다형성 구현
			c) 다중 상속 지원
			d) 계층 구조 형성
		 */ // 3번 문제 정답 c) 다중 상속 지원
		
		/*
		 * [문제4]문항
			자식 클래스가 부모 클래스의 메소드를 재정의하는 것을 무엇이라고 하는가?
			a) 오버로딩
			b) 오버라이딩
			c) 캐스팅
			d) 추상화
		 */ // 4번 문제 정답 b) 오버라이딩
		
		/*
		 * [문제5]문항
			자바에서 클래스가 여러 클래스를 동시에 상속받는 것을 허용하는가?
			a) 허용한다
			b) 허용하지 않는다
			c) 특정 조건에서만 허용한다
			d) 컴파일러 설정에 따라 다르다
		 */ // 5번 문제 정답 b) 허용하지 않는다
		
		/*
		 * [문제6]문항
			상속을 통해 얻을 수 없는 이점은?
			a) 코드의 재사용성
			b) 다형성의 구현
			c) 캡슐화의 향상
			d) 구조적 설계의 용이성
		 */ // 6번 문제 정답 d) 구조적 설계의 용이성
		
		/*
		 * [문제7]문항
			상속 관계에서 자식 클래스의 객체를 생성할 때 가장 먼저 호출되는 생성자는?
			a) 자식 클래스의 생성자
			b) 부모 클래스의 생성자
			c) Object 클래스의 생성자
			d) 매개변수가 없는 기본 생성자
		 */ // 7번 문제 정답 b) 부모 클래스의 생성자
		 
		/*
		 * [문제8]문항
			다음과 같은 Animal 클래스가 주어졌을 때, 이를 상속받는 Dog 클래스를
			작성하세요. class Animal {
			 public void makeSound() {
			 System.out.println("The animal makes a sound");
			 }
			}
			Dog 클래스는 makeSound() 메서드를 오버라이드하여
			"The dog barks"를 출력해야 합니다.
		 */
		
		/*
		 * [문제9]문항
			class Vehicle {
			 protected String brand = "Ford";
			 public void honk() {
			 System.out.println("Tuut, tuut!");
			 }
			}
			class Car extends Vehicle {
			 private String modelName = "Mustang";
			
			 public Car() {
			 System.out.println("Car constructor called");
			 }
			
			 @Override
			 public void honk() {
			 System.out.println("Beep, beep!");
			 }
			
			 public void printInfo() {
			 System.out.println(brand + " " + modelName);
			 }
			}
			public class Main {
			 public static void main(String[] args) {
			 Car myCar = new Car();
			 myCar.honk();
			 myCar.printInfo();
			
			 Vehicle myVehicle = new Car();
			 myVehicle.honk();
			 }
			}
			문제. 이 코드의 실행 결과는 무엇인가요?
		 */
		
		
			Car myCar = new Car();
			// Car는 Vehicle를 상속받았기 때문에 부모클래스의 생성자가 가장 먼저 호출된다.
			// 순서 : 부모생성자 -> 자식생성자 -> 호출
			myCar.honk();
			myCar.printInfo();
				
				
			Vehicle myVehicle = new Car();
			/*
			 * 부모클래스는 자식클래스를 대입받을 수 있음.
			 * 하지만, 자식클래스에서 정의된 메소드와 필드변수는 사용할 수 없음
			 */
			myVehicle.honk();
		
		
		
	}

}
