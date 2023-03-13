package com.dogfe.kimblog.dao;

import com.dogfe.kimblog.dto.UserDTO;

public interface IUserDAO {

	int createUser(UserDTO dto);

	UserDTO checkUserByUsernameAndPassword(String username, String password);

}
