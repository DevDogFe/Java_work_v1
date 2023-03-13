package com.dogfe.kimblog.controller;

import com.dogfe.kimblog.dto.UserDTO;
import com.dogfe.kimblog.service.UserService;

public class UserController {
	UserService userService;
	
	public UserController() {
		initData();
	}
	
	private void initData() {
		userService = new UserService();
	}
	
	public String requestSignUp(UserDTO dto, String host) {
		String msg = "외부IP는 가입이 불가합니다.";
		if(host.equals("localhost")) {
			msg = userService.signUp(dto);
		}
		return msg;
	}
	
	public UserDTO requestSignIn(String username, String password) {
		UserDTO dto = null;
		dto = userService.signIn(username, password);
		
		return dto;
	}
}
