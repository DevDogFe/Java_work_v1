package ch03;

public class MainTest2 {

	// 코드 시작점
	public static void main(String[] args) {

		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		// int number4 = 5/3; --> number4 = 1
		// double number4 = 5/3; --> number4 = 1 (R value가 int값이므로)
		// double number4 = (double)5 / (double)3; (정확한 값 얻고싶을 때)
		// double number4 = 5.0 / 3.0; (정확한 값 얻고싶을 때)
		int number4 = (int) (5.0 / 4.0);
		int number5 = 5 % 3;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);

		System.out.println("==================");

		// 1. (12+3)/3을 화면에 출력하시오
		System.out.println((12 + 3) / 3);
		// 2. (25%2) 값을 화면에 출력하시오
		System.out.println(25 % 2);
		// 3. 3.0/5를 정수값 result 변수에 담아 주세요
		int result = (int) (3.0 / 5);

	}// end of main

}// end of class
