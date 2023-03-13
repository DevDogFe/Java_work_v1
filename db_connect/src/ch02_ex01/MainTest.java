package ch02_ex01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainTest {

	// main
	public static void main(String[] args) {

		DBClient client = new DBClient();
		Connection conn = client.getConnection();

		ArrayList<School> schools = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "SELECT * FROM school; ";
			ResultSet rs = stmt.executeQuery(queryStr);

			while (rs.next()) {
				schools.add(new School(rs.getInt("school_id"), rs.getString("school_name"), rs.getString("city")));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < schools.size(); i++) {
			System.out.println(schools.get(i));
			System.out.println(schools.get(i).getName());
		}
		for (School school : schools) {
			System.out.println(school);
		}

	} // end of main

} // end of class
