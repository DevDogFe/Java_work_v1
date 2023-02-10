package ch04;

import java.util.Scanner;

public class WhileMainTest1 {

	// main thread
	public static void main(String[] args) {

		// 1 - 10 연산 코드
		int num = 1;
		int sum = 0;
		
		int userInput = 345;

		while (num <= userInput) {
			System.out.println("현재값: " + num); // 무한루프에 조심
			sum += num;
			num++;
		}

		System.out.println("연산에 대한 결과값은: " + sum + "입니다.");

	} // end of main

} // end of class
