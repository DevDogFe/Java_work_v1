package ch01;

public class DataType1 {

	// 코드 시작점 main함수
	public static void main(String[] args) {

		// 데이터 타입 종류 2가지
		// 1. 기본 데이터 타입(primitive data type)
		// 2. 참조타입(reference type)

		// 정수형 데이터 타입
		// 크기가 다를 수 있다.
		byte b; // 1byte 크기(8bit)
		short s; // 2byte 크기(16bit)
		int i; // 4byte 크기(32bit)
		long l; // 8byte 크기(64bit)

		b = 127;
		b = -128;
		// 데이터 타입 byte는 정수 -127부터 128까지 담을 수 있다.

		s = 128;
		// s = 2000000000; short 범위 넘어섬

		// 인트는 약 +- 21억까지의 정수를 담을 수 있다.
		i = 2100000000;
		// i = 2200000000; 인트 범위 넘어섬

		// L value = R value
		// 컴퓨터 정수값에 기본 단위는 인트이다.
		// l = 2200000000; // long은 22억을 담을 수 있지만 기본단위에서 벗어나서 오류
		l = 2200000000L; // 접미사 L을 붙여 정상작동하게함.(대소문자 둘다 가능)

		System.out.println("32,768");

	}// end of main

} // end of class
