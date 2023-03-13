package ch02_ex02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest {

	// main
	public static void main(String[] args) {

		DBClient client = new DBClient();
		Connection conn = client.getConnection();

		ArrayList<Employee> employees = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "select * from employees where emp_no < 10011 and birth_date < 19600101; ";
			ResultSet rs = stmt.executeQuery(queryStr);

			while(rs.next()) {
				int id = rs.getInt("emp_no");
				String birthDate = rs.getString("birth_date");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String gender = rs.getString("gender");
				String hireDate = rs.getString("hire_date");
//				System.out.print("id: " + id + "\t");
//				System.out.print("name: " + birthDate + "\t");
//				System.out.print("city: " + city + "\t");
//				System.out.println("");
				employees.add(new Employee(id, birthDate, firstName, lastName, gender, hireDate));
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
		for (Employee employee : employees) {
			System.out.print("id: " + employee.getId() + ", ");
			System.out.print("birth: " + employee.getBirthDate() + ", ");
			System.out.print("name: " + employee.getFirstName() + " ");
			System.out.print(employee.getLastName() + ", ");
			System.out.print("hire date: " + employee.getHireDate() + ", ");
			System.out.print("gender: " + employee.getGender());
			System.out.println("");
		}

	} // end of main

} // end of class
