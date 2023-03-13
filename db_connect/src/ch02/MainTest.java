package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	// main
	public static void main(String[] args) {
		
		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "SELECT * FROM school; ";
			ResultSet rs = stmt.executeQuery(queryStr);
			
			
			while(rs.next()) {
				int schoolId = rs.getInt("school_id");
				String schoolName = rs.getString("school_name");
				String city = rs.getString("city");
				System.out.print("id: " + schoolId + "\t");
				System.out.print("name: " + schoolName + "\t");
				System.out.print("city: " + city + "\t");
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}

	} // end of main

} // end of class
