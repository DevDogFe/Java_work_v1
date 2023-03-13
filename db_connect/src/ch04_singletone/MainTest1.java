package ch04_singletone;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest1 {

	// main
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("1.select 2.insert 3.update 4.delete 0.종료");
			int userInput = scanner.nextInt();
			scanner.nextLine();
			if (userInput == 1) {
				ArrayList<UserDTO> list = new UserDAO().select();
				for (UserDTO userDTO : list) {
					System.out.println(userDTO);
				}
			}
			if (userInput == 2) {
				System.out.println("이름입력(3글자)");
				String userName = scanner.next();
				System.out.println("출생년도입력");
				String birthYear = scanner.next();
				System.out.println("주소입력(2글자)");
				String addr = scanner.next();
				System.out.println("폰번호");
				String mobile = scanner.next();
				new UserDAO().insert(new UserDTO(userName, birthYear, addr, mobile));
			}
			if (userInput == 3) {
				System.out.println("수정할 데이터의 이름입력(3글자)");
				String userName = scanner.next();
				System.out.println("수정할 출생년도입력");
				String birthYear = scanner.next();
				System.out.println("수정할 주소입력(2글자)");
				String addr = scanner.next();
				System.out.println("수정할 폰번호");
				String mobile = scanner.next();
				new UserDAO().update(new UserDTO(userName, birthYear, addr, mobile), userName);
			}
			if (userInput == 4) {
				System.out.println("삭제할 데이터의 이름입력(3글자)");
				String userName = scanner.next();
				new UserDAO().delete(userName);
			}
			if (userInput == 0) {
				flag = false;
				DBClient.getInstance().connectionClose();
				
			}
			
		}

		// insert

//		boolean isDelete = userDAO.delete("이승기");
//		System.out.println(isDelete);
//		if(isDelete == false) {
//			System.out.println("구매테이블에 이력이 남아 있을 수 있습니다.");
//		}

//		int updateRowCount = userDAO.update(dto, "야스오");
//		System.out.println(updateRowCount);
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
