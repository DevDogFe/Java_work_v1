package com.dogfe.kimblog;

import com.dogfe.kimblog.controller.BlogController;
import com.dogfe.kimblog.controller.UserController;
import com.dogfe.kimblog.dto.UserDTO;

public class MainTest2 {

	// main
	public static void main(String[] args) {

		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		
		// 해당 게시글의 pk값, userid

	} // end of main

} // end of class
