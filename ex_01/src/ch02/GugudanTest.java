package ch02;

import java.util.Scanner;

public class GugudanTest {

	// 메인 함수
	public static void main(String[] args) {
		// 1단부터 9단까지
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				System.out.println((i + 1) + " * " + (j + 1) + " = " + ((i + 1) * (j + 1)));
//			}
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단부터?");
		int startNumber = sc.nextInt();
		System.out.println("몇단까지?");
		int endNumber = sc.nextInt();
		
		for (int i = startNumber; i < endNumber + 1; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println((i) + " * " + (j + 1) + " = " + ((i) * (j + 1)));
			}
		}

	} // end of main

} // end of class
