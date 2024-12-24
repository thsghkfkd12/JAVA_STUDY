package java_study_1224;

// ************************
class Book { // Book클래스 선언
	private String title; // 제목
	private int price; // 가격
	
	public Book(String title, int price) { // 생성자로 필드변수 초기화
		this.title = title;
		this.price = price;
	}
	
	public void showBook() {
		System.out.println(this.title + "의 가격은 "+this.price + "원입니다.");
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getTitle() {
		return this.title;
	}
}

public class 테스트2 {

	public static void main(String[] args) {
		
		// 객체 배열(동일한 데이터타입을 저장하는 공간 혹은 자료구조)
		// 자바는 객체도 데이터타입 (자바는 일반 데이터타입(int,double,boolean...) + 객체(클래스)
		int [] array = new int[10]; // 저장 공간이 10개인 int형 배열
		String[] array2 = new String[10]; // 저장 공간이 10개인 String형 배열
		
		Book[] bookArray = new Book[10]; // 저장 공간이 10개인 Book 타입 배열
		// bookArray에 올 수 있는데이터가 2개가입니다.
		
		// 배열에 데이터 넣기
		Book book1 = new Book("자바의 정석", 30000);
		Book book2 = new Book("파이썬 기초", 25000);
		Book book3 = new Book("알고리즘 입문", 40000);
		
		bookArray[0] = book1; // 0번째(index)에 book1 대입
		bookArray[1] = book2; // 0번째(index)에 book2 대입
		bookArray[2] = book3; // 0번째(index)에 book3 대입
		
		bookArray[0].showBook();
		bookArray[1].showBook();
		bookArray[2].showBook();
		
		// for문으로
		for(int i=0; i<3; i++) {
			bookArray[i].showBook();
		}
		System.out.println("========================================");
		for(int i=0; i<3; i++) {
			if(bookArray[i].getPrice() >= 30000) {
				bookArray[i].showBook();
			}
			
		}
		System.out.println("========================================");
		// equsls : 자바는 문자비교를 '=='가 아닌 'equsls'을 사용함
		for(int i=0; i<3; i++) {
			if(bookArray[i].getTitle().equals("파이썬 기초")) {
				bookArray[i].showBook();
			}
		}
		
		Object[] bookArray2 = new Object[10]; //Object 배열에 Book 대입가능
		bookArray2[0] = book1;
		
		
		
		
	}

}
