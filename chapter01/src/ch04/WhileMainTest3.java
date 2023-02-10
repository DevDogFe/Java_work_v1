package ch04;

import java.util.Scanner;

public class WhileMainTest3 {

	// 메인 작업자(메인 쓰레드)
	public static void main(String[] args) {

		int num;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈 정수값을 입력해주세요.");
		// 사용자가 0을 입력하면 프로그램을 종료하게 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담아주세요.
		do {
			num = scanner.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("연산된 값은 " + sum + "입니다.");
		System.out.println("프로그램 종료");

	} // end of main

} // end of class
