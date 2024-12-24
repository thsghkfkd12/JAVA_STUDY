package java_study_1224;

public class Bank { // 계좌를 생성하고 관리하는 클래스
	// 세번째 순서 - 'Bank' 클래스 만들기
	
	// 필드변수
	private BasicAccount[] accounts; // 여러개 계좌를 저장하는 배열
	private int accountCount; // 계좌 개설 개수
	
	
	public Bank() {
		// 필드변수 포기화
		accounts = new BasicAccount[10];
		accountCount = 0;
	}
	
	// 계좌생성
	public void createAccount(String accountNumber) {
		if(accountCount < accounts.length) {
			accounts[accountCount] = new BasicAccount(accountNumber); // 객체배열 데이터 대입
			accountCount++; // 계좌 생성했으니깐 count 증가
			System.out.println("계좌 생성 완료");
			System.out.println("가능 횟수 : " + accountCount +"번 남았습니다.");
		}else {
			System.out.println("더 이상 계좌를 생성할 수 없습니다.");
		}
	}
	
	// 계좌조회
	public BasicAccount findAccount(String accountNumber) {
		for(int i=0; i<accountCount; i++) {
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i]; // 해당 index 리턴(클래스 리턴)
			}
		}
		// 찾는 계좌번호가 없다면 null이 리턴될꺼임.
		return null; // 리턴타입이 '클래스'는 기본(default) null을 리턴한다.
	}
	
	

}
