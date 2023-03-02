package ch01;

import java.io.IOException;

public class SystemInTest1 {

	// main
	public static void main(String[] args) {

		// 기반 스트림(단순한 기능)

		// 키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳 하나 쓰고 Enter 입력");
		int i;
		// 한 바이트씩 키보드에 값을 입력받아 읽어라.
		try {
			// 입력
			i = System.in.read();
			System.out.println("i: " + i);
			// 컴퓨터 문자표(미리 약속): 정수값을 문자열로 변환 -> 인코딩
			// 반대로 문자열을 정수값으로 바구는것 -> 디코딩
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
