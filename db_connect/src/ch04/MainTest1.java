package ch04;

import java.util.ArrayList;

public class MainTest1 {

	// main
	public static void main(String[] args) {
		
		UserDAO userDAO = new UserDAO();
		
		UserDTO dto = new UserDTO("야스오", "1995", "부산", "010-2222-3333");
		// insert
		
//		boolean isDelete = userDAO.delete("이승기");
//		System.out.println(isDelete);
//		if(isDelete == false) {
//			System.out.println("구매테이블에 이력이 남아 있을 수 있습니다.");
//		}
		
		
		int updateRowCount = userDAO.update(dto, "야스오");
		System.out.println(updateRowCount);
//		int rowCount = userDAO.insert(new UserDTO("장범준", "2019", "경기", "010-1111-2223"));
//		System.out.println("rowCount: " + rowCount);
		
		// select 확인
//		ArrayList<UserDTO> list = userDAO.select();
//		
//		for (UserDTO userDTO : list) {
//			System.out.println(userDTO.getUserName());
//			System.out.println(userDTO.getBirthYear());
//			System.out.println(userDTO.getAddr());
//			System.out.println(userDTO.getMobile());
//			System.out.println("===============");
//		}
		
		
		
	} // end of main

} // end of class
