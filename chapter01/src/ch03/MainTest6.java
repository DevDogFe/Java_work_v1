package ch03;

public class MainTest6 {

	// main
	public static void main(String[] args) {

		// 논리 연산자 ( &&, ||)
		// &&: 논리곱
		// ||: 논리합
		// ! : 부정
		// 연산에 결과값은 true, false
		// 보통 비교연산자와 많이 사용

		int num1 = 10;
		int num2 = 20;

		// T && T
//		boolean flag1 = (num1 > 0) && (num2 > 0);
//		System.out.println(flag1);

		// T || T
		boolean flag1 = (num1 > 0) || (num2 > 0);
		System.out.println(flag1);

		// T && F
		flag1 = (num1 > 0) && (num1 < 0);
		System.out.println(!flag1);

		// T || F
		boolean flag2 = (num1 > 0) || (num2 < 0);
		System.out.println(flag2);

		// 논리곱: 하나라도 F => F
		// 논리합: 하나라도 T => T

		System.out.println(!(5 > 3));

	}// end of main

}// end of class
