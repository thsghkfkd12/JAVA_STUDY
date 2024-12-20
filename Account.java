package java_study_1220.bank;

/*
 * 기능 정의서 (메소드(기능) 정의)
 */
public interface Account { // 계좌의 기본 기능을 정의합니다.
	/*
	 * 인터페이스에 작성된 메소드는 '무조건' 접근지정자가 'public'(생략가능)
	 */
	public void deposit(double amount); // 입금
	public boolean withdraw(double amount); // 출금
	public double getBalance(); // 잔약조회
	public String getAccountNumber(); // 계좌번호 조회

}
