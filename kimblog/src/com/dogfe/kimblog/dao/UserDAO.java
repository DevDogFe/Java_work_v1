package com.dogfe.kimblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dogfe.kimblog.dto.UserDTO;
import com.dogfe.kimblog.utils.DBHelper;

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
	
	@Override
	public int createUser(UserDTO dto) {
		conn = dbHelper.getConnection();
		int resultRow = 0;
		String sql = " INSERT INTO user(username, password, email, address, userRole, createDate) VALUES "
				+ " (?, ?, ?, ?, ?, now()); ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUsername());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddress());
			pstmt.setString(5, dto.getUserRole());
			resultRow = pstmt.executeUpdate();
			System.out.println("가입이 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return resultRow;
	}
	
	@Override
	public UserDTO checkUserByUsernameAndPassword(String username, String password) {
		conn = dbHelper.getConnection();
		UserDTO dto = null;
		String sql = " SELECT * FROM user "
				+ " WHERE username = ? AND password = ?;  ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto = new UserDTO(rs.getInt("id"), username, rs.getString("email"), 
						rs.getString("address"), rs.getString("userRole"), rs.getString("createDate"));
			}
			
		} catch (SQLException e) {
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
		
		return dto;
	}
}
