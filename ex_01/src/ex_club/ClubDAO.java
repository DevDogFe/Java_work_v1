package ex_club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClubDAO implements IClubDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;

	public ClubDAO() {
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
	}

	@Override
	public void create(ClubDTO dto) {
		String sqlFormat = " INSERT INTO club(club_name, club_type, club_room) VALUES " + " ('레알마드리드', '축구', 'A103') ";
		String sql = String.format(sqlFormat, dto.getClubName(), dto.getClubType(), dto.getClubRoom());
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
	public int countMember(int clubId) {
		int memberCount;
		String sqlFormat = " SELECT count(student_id) AS count " + " FROM club_member_list AS l "
				+ " LEFT JOIN club AS c " + " ON l.club_id = c.club_id " + " GROUP BY l.club_id "
				+ " HAVING l.club_id = ? ";
		String sql = String.format(sqlFormat, clubId);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, clubId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				memberCount = rs.getInt("count");
				return memberCount;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			dbHelper.closeConnection();
		}
		return 0;
	}

	@Override
	public int countMember(String clubName) {
		int memberCount;
		String sqlFormat = " SELECT c.club_name, count(student_id) AS count " + " FROM club_member_list AS l "
				+ " LEFT JOIN club AS c " + " ON l.club_id = c.club_id " + " GROUP BY l.club_id "
				+ " HAVING c.club_name = ? ";
		String sql = String.format(sqlFormat, clubName);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, clubName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				memberCount = rs.getInt("count");
				return memberCount;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			dbHelper.closeConnection();
		}
		return 0;
	}

	@Override
	public ArrayList<StudentDTO> showMemberList(int clubId) {
		ArrayList<StudentDTO> list = new ArrayList<>();
		String sqlFormat = " SELECT c.club_id, c.club_name, s.student_id, s.student_name, s.major " + "FROM club AS c "
				+ "LEFT JOIN club_member_list AS l " + "ON c.club_id = l.club_id " + "LEFT JOIN student AS s "
				+ "ON l.student_id = s.student_id " + "WHERE c.club_id = ? " + "ORDER BY s.student_id; ";
		String sql = String.format(sqlFormat, clubId);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, clubId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new StudentDTO(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("major")));
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
	}

	@Override
	public ArrayList<StudentDTO> showMemberList(String clubName) {
		ArrayList<StudentDTO> list = new ArrayList<>();
		String sqlFormat = " SELECT c.club_id, c.club_name, s.student_id, s.student_name, s.major " + "FROM club AS c "
				+ "LEFT JOIN club_member_list AS l " + "ON c.club_id = l.club_id " + "LEFT JOIN student AS s "
				+ "ON l.student_id = s.student_id " + "WHERE c.club_name = ? " + "ORDER BY s.student_id; ";
		String sql = String.format(sqlFormat, clubName);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, clubName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new StudentDTO(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("major")));
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
	}

}
