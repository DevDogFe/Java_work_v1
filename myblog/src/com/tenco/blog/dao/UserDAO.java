package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.utils.DBHelper;

// User와 관련된 DB 서버 연결 로직 처리
public class UserDAO implements IUserDAO{
	
	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		initData();
	}
	
	private void initData() {
		dbHelper = DBHelper.getInstance();

	}
	
	// 사용자 정보를 저장시키는 기능
	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user(username, password, email, address, userRole, createDate) VALUES "
				+ " (?, ?, ?, ?, ?, now()) ";
		int resultRow = 0;
		conn = dbHelper.getConnection();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> saveUser 오류 <<");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return resultRow;
	}
	
	// 사용자 정보를 id와 pw 확인해서 찾는 기능 
	@Override
	public UserDTO selectUserByUserNameAndPassword(String username, String password) {
		UserDTO resultUser = null;
		String query = " SELECT * FROM user "
				+ " WHERE username = ? AND password = ? ";
		conn = dbHelper.getConnection();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				resultUser = dto;
			}
			
		} catch (Exception e) {
			System.out.println(" >> userDAO 회원찾기시 에러 발생 <<");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return resultUser;
	}
}
