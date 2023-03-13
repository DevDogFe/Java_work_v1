package ex_club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO implements IStudentDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public StudentDAO() {
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<StudentDTO> showList() {
		ArrayList<StudentDTO> list = new ArrayList<>();
		String sql = " SELECT * FROM student ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new StudentDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dbHelper.closeConnection();
		}

		return list;
	}

	@Override
	public void create(StudentDTO dto) {
		String sqlFormat = " INSERT INTO student(student_name, major) VALUES " + " ('%s', '%s') ";
		String sql = String.format(sqlFormat, dto.getStudentName(), dto.getMajor());
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			dbHelper.closeConnection();
		}
	}

	@Override
	public void join(int studentId, int clubId) {
		String sqlFormat = " INSERT INTO club_member_list VALUES " + " ('%d', '%d', curdate()) ";
		String sql = String.format(sqlFormat, clubId, studentId);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void join(int studentId, int clubId, String joinDate) {
		String sqlFormat = " INSERT INTO club_member_list VALUES " + " ('%d', '%d', '%s') ";
		String sql = String.format(sqlFormat, clubId, studentId, joinDate);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
