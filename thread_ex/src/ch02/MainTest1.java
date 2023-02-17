package ch02;

public class MainTest1 {

	// main thread
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		// Father, Mother은 생성하려면 BankAccount객체가 필요하므로 BankAccount에 의존하고 있다.
		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		father.start(); // 3초
		mother.start(); // 0.5초 

		// 정상처리 10 + 1 - 0.5 만원 = 10만5천원
	} // end of main

} // end of class
