package ex_club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "test";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "1234";

	private static Connection connection;

	private static DBHelper dbHelper = new DBHelper();

	private DBHelper() {

	}

	public static DBHelper getInstance() {
		if (dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}

	public static Connection getConnection() {
		if (connection == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // 동적로딩(리플렉션)
				connection = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
				System.out.println("Connection Success");
			} catch (Exception e) {
				e.printStackTrace();
				try {
					connection.close();
				} catch (Exception e2) {
				}
			}
		}

		return connection;
	} // getConnection

	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
