package Ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "MSSQL";

	// main --> 실행하는 코드 작성(사용쪽 코드)
	public static void main(String[] args) {

		// 사용자에게 정보를 입력받는다
		// String userName, String pw
		// 스캐너 활용 --> 이름 한글자 이상, pw 특수문자 포함
		final int SAVE = 1;
		final int UPDATE = 2;
		final int END = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		while (flag) {
			System.out.println("1.저장기능 호출 2.수정기능 호출 0. 종료");
			int userChoice = scanner.nextInt();
			scanner.nextLine();
			if (userChoice == SAVE) {
				System.out.println("이름을 입력해주세요.");
				String inputUserName = scanner.nextLine();
				System.out.println("PW를 입력해주세요.");
				String inputUserPw = scanner.nextLine();
				UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
				IUserInfoDao dao;
				if (UserInfoClient.dbName.equals("ORACLE")) {
					dao = new UserInfoOracleDao();
				} else if (UserInfoClient.dbName.equals("MYSQL")) {
					dao = new UserInfoMysqlDao();
				} else {
					dao = new UserInfoMsSqlDao();
				}
				dao.insertUserInfo(userInfo);
			} else if (userChoice == UPDATE) {
				System.out.println("이름을 입력해주세요.");
				String inputUserName = scanner.nextLine();
				System.out.println("PW를 입력해주세요.");
				String inputUserPw = scanner.nextLine();
				UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
				IUserInfoDao dao;
				if (UserInfoClient.dbName.equals("Oracle")) {
					dao = new UserInfoOracleDao();
				} else if (UserInfoClient.dbName.equals("MYSQL")) {
					dao = new UserInfoMysqlDao();
				} else {
					dao = new UserInfoMsSqlDao();
				}
				dao.updateUserInfo(userInfo);
			} else {
				System.out.println("프로그램 종료");
				flag = false;
			}

		} // end of while
			// 스캐너 통해서 사용자 이름, 사용자 비번 입력받기
			// 흐름만들기
			// 1. 저장기능, 2.수정기능
			// dbName 변경해 가면서 코드 동작 확인

	} // end of main

} // end of class
