package ch04;

import java.util.ArrayList;

public interface IUserDAO {
	
	// user TBL 전체 조회 기능
	ArrayList<UserDTO> select();
	// user 정보 저장
	int insert(UserDTO dto);
	// user 정보 수정
	int update(UserDTO dto, String targetUserName);
	// user 정보 삭제
	boolean delete(String userName);
	
}
