package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	// 준비물
	// 자바코드서 mysql서버 접속을 하기위한 필요사항
	// 계정정보, 비밀번호
	// 접속 경로: URL(주소)
	// mysql 연결 주소
	// "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";
	private static final String URL = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	
	// DB 접근 기술
	static Connection connect; // DB connection 연결 객체
	static Statement stmt; // 문자열들을 sql 변경하거나 명령문 실행
	static ResultSet rs; 

	public static void main(String[] args) {
		
		// 드라이버 로드 -> 동적 로딩: 실행시점에 메모리에 객체 올림(컴파일 시점 선언x)
		try {
			// Driver load
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Driver 동작 필요
			connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// 연결객체에서 statement 뽑아낼 수 있다.
			stmt = connect.createStatement();
			
			String sql = "SELECT * FROM userTBL ";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String userName = rs.getString("userName");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				System.out.println(userName + ", " + birthYear + ", " + addr + ", " + mobile);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	} // end of main

}
