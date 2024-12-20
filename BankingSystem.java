package java_study_1220.bank;

import java.util.Scanner; // 내장 클래스

// 메인 클래스(Console 출력 확인)
public class BankingSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank(); // Bank 클래스 호출(생성)

		while (true) { // 은행 업무 선택
			System.out.println("안녕하세요, 길동은행입니다. 무엇을 도와드릴까요?");
			System.out.println("[1] 계좌 생성 [2] 입금 [3] 출금 [4] 잔액 조회 [5] 종료");

			System.out.print("업무 선택 : ");
			int choice = scanner.nextInt(); // 스캐너로 업무 입력받기
			scanner.nextLine(); // 버퍼 지우기

			switch (choice) {
			case 1:
				System.out.print("새 계좌번호 : ");
				String newAccountNumber = scanner.next(); // 계좌번호 입력받기
				bank.createAccount(newAccountNumber);
				// Bank 클래스에 정의된 createAccount 메소드 호출
				break;
			case 2:
				System.out.print("입금 계좌번호 입력 : ");
				String depositAccount = scanner.next(); // 입금할 계좌번호 입력받기
				System.out.print("입금액 : ");
				double depositAmount = scanner.nextDouble(); // 입금액 입력받기
				// 입금할 계좌가 없다면?
				// Bank 클래스에 findAccount 정의된 메소드호출
				BasicAccount account = bank.findAccount(depositAccount); // 계좌 조회
				if (account != null) { // 값이 없다면? ('numll'은 값이 없다를 의미)
					account.deposit(depositAmount); //입력받은 입금액 최종 완료
				} else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 3:
				System.out.print("출금 계좌번호 입력 : ");
				String withdrawAccount = scanner.next(); // 출금할 계좌번호 입력
				System.out.print("출금액 : ");
				double withdrawAmount = scanner.nextDouble(); // 출금액 입력

				BasicAccount wAccount = bank.findAccount(withdrawAccount); // 계좌 조회
				if (wAccount != null) { // 계좌가 null이 아니라면?
					// BasicAccount 클래스에 정의된 withdraw 메소드 호출
					wAccount.withdraw(withdrawAmount); // 출금
				} else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 4:
				// 잔액 조회
				System.out.print("계좌번호 입력 : ");
				String balanceAccount = scanner.next(); // 잔액 조회할 계좌번호 입력

				BasicAccount bAccount = bank.findAccount(balanceAccount); // 계좌 조회
				if (bAccount != null) {
					System.out.println("현재 잔액 : " + bAccount.getBalance());
				} else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				scanner.close(); // 스캐너 종료
				System.exit(0); // 시스템 강제 종료
				break;
			default: // 1~5번 말고 다른번호를 입력한다면?
				System.out.println("잘못된 선택입니다.");
			}

		}

	}

}
