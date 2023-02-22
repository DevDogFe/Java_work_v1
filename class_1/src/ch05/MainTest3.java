package ch05;

import java.util.HashMap;

public class MainTest3 {

	// main
	public static void main(String[] args) {
		
		// Map 자료구조 이용해서 전화번호 저장하기
		// 1단계 - String, String
		// 2단계 - String, Object(Person)
		
		HashMap<String, String> phoneNumbers1 = new HashMap<>();
		phoneNumbers1.put("010-1234-5678", "홍길동");

	} // end of main

} // end of class

