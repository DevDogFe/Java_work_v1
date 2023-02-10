package ch04;

import java.util.Scanner;

public class ContinueMainTest1 {

	// 메인
	public static void main(String[] args) {

		// 스캐너를 사용해서 사용자의 정수값을 입력 받아서 배수에 갯수를
		// 출력하는 프로그램 만들기
		// 테스트 값은 1000, (3입력)
		System.out.println("정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("몇까지 확인하겠습니까?.");
		int maxInput = sc.nextInt();
		int count = 0;
		for (int i = 1; i < maxInput + 1; i++) {
			if (i % input != 0) {
				continue;
			}
			count++;
		}
		System.out.println(maxInput + "이하의 정수 중에서 " +
		                    input + "의 배수는 " + count + "개");

	}// end of main

}// end of class
