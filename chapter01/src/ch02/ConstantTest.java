package ch02;

public class ConstantTest {

	// 코드의 시작점
	public static void main(String[] args) {

		// 변수 != 상수 (변하지 않는 수)
		// 예약어 final 사용
		// 권장 사항 - 상수는 대문자를 사용하고 연결 단어는 _로 구분

		final int MAX_NUM = 12;// 상수의 선언과 초기화
		// MAX_NUM = 200; 한번 초기화된 상수값은 변경할 수 없다.

		final int MIN_NUM; // 상수 선언
		MIN_NUM = 1; // 상수는 선언 후에 단 한번만 초기화 할 수 있다.

	}// end of main

}// end of class
