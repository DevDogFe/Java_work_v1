package com.dogfe.kimblog;

import com.dogfe.kimblog.controller.UserController;
import com.dogfe.kimblog.dto.UserDTO;

public class MainTest {

	// main
	public static void main(String[] args) {
		UserController controller = new UserController();
		UserDTO dto1 = controller.requestSignIn("홍길동", "1234");
		UserDTO dto2 = controller.requestSignIn("피카츄", "1212");
		UserDTO dto3 = controller.requestSignIn("이순신", "5678");
		System.out.println(dto1);
		System.out.println(dto2);
		System.out.println(dto3);

	} // end of main

} // end of class
