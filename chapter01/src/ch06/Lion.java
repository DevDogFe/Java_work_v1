package ch06;

//함수를 선언하는 코드 방법

//함수를 사용하는 코드 방법

public class Lion {

	// 함수를 설계하는 코드 작성 (정수를 반환하는 함수)
	// 함수 선언부
	static int addNumber(int n1, int n2) {

		// 함수 구현부
		int result; // 지역 변수
		result = n1 + n2;

		return result; // 리턴 키워드를 만나면 실행의 제어권을 반납한다.(데이터)
	}// end of addNumber

	// 아무 값도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + "님 반갑습니다.");
	}

	// 매개 변수가 없는 함수 설계
	static int calcSum() {

		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// calcSum2 정수값 3개를 받아서 덧셈 연산 후 결과를 반환 하시오.

	static double calcSum2(double num1, double num2, double num3) {

		double result = num1 + num2 + num3;
		return result;
	}

	// calcSum3 정수값 1, 실수값 1, 논리값 1개 받고
	// "정수값: "[] , 실수값 [], 논리값[] <---------- 문자열 연산
	// 리턴 타입은 String으로

	static String calcSum3(int n, double d, boolean b) {
		String result = "정수값: [" + n + "] 실수값: [" + d + "] 논리값: [" + b + "]";
		return result;
	}

	// main 함수 - 텅빈, 리턴 값이 없다.
	public static void main(String[] args) {

		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber: " + myNumber);

		// 함수호출2
		// 함수를 호출할 때는 모양을 맞춰주어야 한다.
		sayHello("애쉬");
		sayHello("티모");
		sayHello("바론");

		int calResult = calcSum();
		System.out.println(calResult);
		System.out.println(calcSum());

		System.out.println(calcSum2(1.1, 2.2, 3.3));
		System.out.println(calcSum3(100, 0.5, 5 > 3));

	}// end of main
	
	//함수란?
	//자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련의 코드 묶음

}// end of class
