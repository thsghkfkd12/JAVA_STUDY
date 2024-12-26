package java_study_1226;

public class Book {
	
	// Book에 관련된 정보들만 작성합니다.
	private String title; // 제목
	private String author; // 저자
	private String isbn; // 도서고유번호
	
	// 생성자로 전역변수(필드변수) 초기화
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	// Source ->  ...getters and... -> get 표시 모두선택
	// getters 함수 생성
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public String toString() { // 도서 출력
		return "제목 : " + title + ", 저자 : " + author + ", ISBN : " + isbn;
	}
	
	
	
}
