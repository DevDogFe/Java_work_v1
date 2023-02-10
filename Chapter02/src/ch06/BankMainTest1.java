package ch06;

public class BankMainTest1 {

	// 메인 함수
	public static void main(String[] args) {

		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withdraw(6_000);
		
		// 신입 개발자가 실수로 멤버 변수에 접근하여 --> 입금/출금
//		bankB.balance = 100_000; // parivate 선언하는 순간 외부에서 접근 불가
		// 외부에서 접근해서 안되는 변수에 접근함으로써 실수할 가능성이 생긴다.
		// 예방 -> 접근 제어지시자를 할당한다. -> private
		// 정보 출력
		bankB.showInfo();
		
		//현재 계좌 잔액을 지역변수에 담아보기
		int currentMoney = bankB.getBalance();
		System.out.println("현재 잔액: " + currentMoney);
		
		//set 메서드 사용해보기
		bankB.setBalance(-200_000);
		bankB.showInfo();
		
	}// end of main

}// end of class
