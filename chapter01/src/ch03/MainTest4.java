package ch03;

public class MainTest4 {

	// main
	public static void main(String[] args) {

		// 증가 연산자: ++, 감소 연산자: --

		int num1 = 1; // 변수 선언 및 초기화
		num1++; // num1 = num1 + 1;
		System.out.println(num1);

		int num2 = 1;
		num2--;
		System.out.println(num2);
		System.out.println("=================================");

		// 1. 증가 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;

		// num3값이 num4로 들어간 이후 num3값이 증가함.
		num4 = num3++;
		System.out.println(num4); // 10
		System.out.println(num3); // 11
		System.out.println("----------------------");

		// 2. 증가 연산자가 앞에 올 경우
		int num5 = 10;
		int num6;
		// 세미콜론 기준으로 먼저 num5 변수에 접근해서 +1증가 이후에
		// num6에 값을 대입한다.
		num6 = ++num5;
		System.out.println(num6); // 11
		System.out.println(num5); // 11
		System.out.println("====================");

		// 감소 연산자 사용

		int num7 = 5;
		int num8;
		num8 = num7--;
		System.out.println(num8);

		int num9 = 5;
		int num10;
		num10 = --num9;
		System.out.println(num10);

	}// end of main

}// end of class
