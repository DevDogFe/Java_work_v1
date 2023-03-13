package com.dogfe.kimblog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";
	
	private static DBHelper instance = new DBHelper();
	
	// 접근 주체
	private static Connection conn;
	
	private DBHelper() {}
	
	public static Connection getConnection() {
		if(conn == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
				System.out.println(">> DB 연결 완료 <<");
			} catch (Exception e) {
				System.out.println(">> DBHelper 오류 <<");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
				conn = null; // 가비지 컬렉터 제거 대상
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static DBHelper getInstance() {
		if (instance == null) {
			instance = new DBHelper();
		}
		return instance;
	}
}
