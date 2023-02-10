package ch01;

import java.util.Random;

public class ForSum {

	static int ranNum() {
		Random random = new Random();
		int randomNum = random.nextInt(6) + 1;
		return randomNum;
	}

	// 코드 시작
	public static void main(String[] args) {

		int sum = 0;
		int num = 3;
		final int MAX = 101;
		for (int i = 0; i < MAX; i++) {
			if (i % num == 0) {
				sum += i;
			}
		}

		System.out.println(num + "의 배수 합계: " + sum);
		System.out.println("===========================");

		int num1 = 0;
		int num2 = 0;

		while (num1 + num2 != 5) {
			num1 = ranNum();
			num2 = ranNum();
			System.out.println("주사위1 값: " + num1 + " 주사위2 값: " + num2);
		}
	}// end of main

}// end of class
