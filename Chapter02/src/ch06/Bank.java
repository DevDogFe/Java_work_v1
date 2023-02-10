package ch06;

public class Bank {

	// 아무것도 지정하지 않으면 default
	// private -> class Bank에서만 접근 가능
	private int balance;
	public String name;

	// 입금하다.
	public void deposit(int money) {
		balance += money;
		showInfo();
	}

	// 출금하다.
	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌 잔액은 " + balance + "입니다.");
	}

	// getter메서드 만들기
	// get -> read-only --> 데이터를 주입 받지 못하고 리턴만 시킨다.
	public int getBalance() {
		return this.balance;
	}

	// setter메서드 만들기
	// set -> 데이터 주입 가능
	public void setBalance(int money) {
		// 방어적 코드 작성
		if (money <= 0) {
			System.out.println("잘못된 입력값입니다.");
			return; // 함수, 메서드의 실행 종료
		}
		this.balance = money;
	}

}
