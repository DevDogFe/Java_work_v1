package com.dogfe.kimblog;

import com.dogfe.kimblog.controller.BlogController;
import com.dogfe.kimblog.controller.UserController;
import com.dogfe.kimblog.dto.BlogDTO;
import com.dogfe.kimblog.dto.UserDTO;

public class MainTest3 {

	// main
	public static void main(String[] args) {

		// UserDTO dto = new UserDTO("티모", "5678", "b@nate.com", "부산");
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		// 로그인 성공
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		UserDTO loginUser2 = userController.requestSignIn("홍길동", "1234");
		
		BlogDTO blogDTO = blogController.requestSelectBoard(4);
		System.out.println(blogDTO);
		blogController.requstDeleteBoard(4, loginUser.getId());

		// id, title, content, readCount, userId

	} // end of main

} // end of class
