package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 실제 DB에 접근해서 기능을 처리
public class EmployeeDAO implements IEmployeeDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt; // statement보다 조금더 빠름
	private ResultSet rs;

	public EmployeeDAO() {

		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();

	} // end of constructor

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title " + " FROM employees AS e"
				+ " INNER JOIN titles AS t" + " ON e.emp_no = t.emp_no" + " WHERE t.title = ? ";
		// prepareStatement 시작번호는 1번부터 시작한다. '' 생략가능 그냥 ? 기반으로 사용
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			dbHelper.closeConnection();
		}

		return list;
	} // showTitleEmp

	@Override
	public int showSalaryCount(String firstName, String lastName) {

		String sql = "SELECT count(salary) AS 'count'\r\n" + "FROM employees AS e\r\n" + "INNER JOIN salaries AS s\r\n"
				+ "ON e.emp_no = s.emp_no\r\n" + "WHERE e.first_name = ? AND e.last_name = ?;";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int salaryCount = rs.getInt("count");
				return salaryCount;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			dbHelper.closeConnection();
		}

		return 0;
	}

} // end of class
