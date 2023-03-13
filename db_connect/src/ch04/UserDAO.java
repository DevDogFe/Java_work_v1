package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO implements IUserDAO {

	private DBClient dbClient;

	public UserDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient("shopdb");

	}

	@Override
	public ArrayList<UserDTO> select() {
		ArrayList<UserDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM userTBL ");
			while (rs.next()) {
				list.add(new UserDTO(rs.getString("userName"), rs.getString("birthYear"), rs.getString("addr"),
						rs.getString("mobile")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	} // end of select()

	@Override
	public int insert(UserDTO dto) {

		String sqlFormat = "INSERT INTO usertbl(userName, birthYear, addr, mobile) "
				+ "VALUES ('%s', '%s', '%s', '%s')";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getBirthYear(), dto.getAddr(), dto.getMobile());
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		int resultRowCount = 0;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("잘 확인해주세요");
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRowCount;

	} // end of insert

	@Override
	public int update(UserDTO dto, String targetUserName) {

		String sqlFormat = "UPDATE usertbl " + "	SET birthYear = '%s', addr = '%s', mobile ='%s' "
				+ " WHERE userName = '%s';";
		String sql = String.format(sqlFormat, dto.getBirthYear(), dto.getAddr(), dto.getMobile(), targetUserName);
		int resultRow = 0;
		try (Connection conn = dbClient.getConnection(); Statement stmt = conn.createStatement();) {
			resultRow = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultRow;
	} // end of update

	@Override
	public boolean delete(String userName) {
		boolean isOk = true;
		String sqlFormat = "DELETE FROM usertbl WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, userName);

		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// 실행 흐름이 여기로 빠졌을 경우
			// 구매 테이블에 데이터가 남아있어서 유저 테이블 삭제 불가능함.
			isOk = false;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isOk;

	} // end of delete

}
