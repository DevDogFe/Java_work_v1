package com.dogfe.kimblog.service;

import com.dogfe.kimblog.dao.UserDAO;
import com.dogfe.kimblog.dto.UserDTO;

public class UserService {
	
	private UserDAO userDAO;
	
	public UserService() {
		initData();
	}
	
	private void initData() {
		userDAO = new UserDAO();
	}
	
	public String signUp(UserDTO dto) {
		String msg = "";
		if(dto.getUsername().equals("")) {
			msg = "username을 입력해주세요.";
			System.out.println(msg);
		} else if(dto.getPassword().equals("")) {
			msg = "비밀번호를 입력해주세요.";
			System.out.println(msg);
		} else {
			msg = "가입할 수 있는 아이디와 비밀번호입니다.";
			dto.setUserRole("USER");
			userDAO.createUser(dto);
		}
		return msg;
	}
	
	public UserDTO signIn(String username, String password) {
		boolean isValid = true;
		if(username.equals("")) {
			isValid = false;
		}
		if(password.equals("")) {
			isValid = false;
		}
		UserDTO dto = null;
		if(isValid) {
			dto = userDAO.checkUserByUsernameAndPassword(username, password);
		}
		
		return dto;
	}
	
}
