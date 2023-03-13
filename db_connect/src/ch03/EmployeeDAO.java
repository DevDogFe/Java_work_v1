package ch03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO implements IEmployeeDAO{

	private DBClient dbClient;
	private Connection conn;
	private static final String TABLE_NAME = "employees";
	
	public EmployeeDAO() {
		dbClient = new DBClient();
		dbClient.setDB_NAME("employees");
	}
	
	@Override
	public void insert(EmployeeDTO dto) {
		
	}

	@Override
	public ArrayList<EmployeeDTO> select(int empNo) {
		
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		String sqlFormat = "SELECT * FROM %s " + "WHERE emp_no = %d ";
		String sql = String.format(sqlFormat, TABLE_NAME, empNo);
		System.out.println(sql);
		conn = dbClient.getConnection();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int mEmpNo = rs.getInt("emp_no");
				String birthDate = rs.getString("birth_date");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String gender = rs.getString("gender");
				String hireDate = rs.getString("hire_date");
				EmployeeDTO dto = new EmployeeDTO(mEmpNo, birthDate, firstName, lastName, gender, hireDate);
				list.add(dto);
			}
//			
//			for (EmployeeDTO employeeDTO : list) {
//				System.out.println(employeeDTO);
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void select(String lastName) {
		
	}

	@Override
	public void update(String gender) {
		
	}

	@Override
	public void delete(int empNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String lastName) {
		// TODO Auto-generated method stub
		
	}
	
}
