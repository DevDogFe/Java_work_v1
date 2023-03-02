package ch01;

import java.io.IOException;

public class SystemInTest2 {

	// main
	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 Enter 입력");
		int i;
		try {

			// i = System.in.read(); // 한줄에 한번 시행되는 코드 --> 반복 --> 엔터키(\n) 누를 때 까지
			while ((i = System.in.read()) != '\n') {
				// 화면에 출력
				System.out.println("i: " + i);
				System.out.println("인코딩: " + (char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
