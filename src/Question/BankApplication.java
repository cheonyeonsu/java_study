package Question;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();

			switch (selectNo) { // 기능은 다 메소드로 만들 수 있음.
			case 1:
				// 계좌 생성
				createAccount();
				break;
			case 2:
				// 계좌 목록 보여주기
				accountList();
				break;
			case 3:
				// 예금기능 실행
				deposit();
			case 4:
				// 출금기능 실행
				withdraw();
			case 5:
				// 종료
				run = false;
				break;
			default:
				System.out.println("1~5사이의 숫자를 입력해주세요.");
				break;
			}
		}

	}

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌 생성");
		System.out.println("------------");

		System.out.println("계좌 번호:");
		String ano = scanner.next(); // String 타입으로 입력을 받는다.

		System.out.println("계좌주:");
		String owner = scanner.next(); // String 타입으로 입력을 받는다.

		System.out.println("초기입금액");
		int balance = scanner.nextInt(); // int 타입으로 입력을 받는다.

		// 계좌 생성
		Account newAccount = new Account(ano, owner, balance);

		// String이 참조타입이기 때문에 아래와 같이 사용하는 것 처럼
		// Account도 참조타입이다.

		// ***배열안에 객체를 넣는다.***
		for (int i = 0; i < accountArray.length; i++) {
			//accountArray[0]에만 계좌 객체가 저장되므로 아래와 같이 처리한다. 
			if (accountArray[i] == null) {
				accountArray[i] = newAccount; // 생성한계 좌를 배열에 넣어준다.
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; // 계좌를 생성하면 for문을 나온다.
			}

		}

		// 계좌 잘 생성되었는지 확인 : 객체라서 주소가 찍힘
		for (Account account : accountArray) {
			System.out.println(account);
		}

		System.out.println(ano);
		System.out.println(owner);
		System.out.println(balance);

	}

	// 계좌 목록 보여주기
	private static void accountList() {
	}

	// 예금하기
	private static void deposit() {
	}

	// 출금하기
	private static void withdraw() {
	}

}
