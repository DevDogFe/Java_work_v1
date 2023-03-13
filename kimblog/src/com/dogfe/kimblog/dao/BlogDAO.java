package com.dogfe.kimblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dogfe.kimblog.dto.BlogDTO;
import com.dogfe.kimblog.utils.DBHelper;

public class BlogDAO implements IBlogDAO{
	
	private DBHelper dbHelper;

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BlogDAO() {
		initData();
	}
	
	private void initData() {
		dbHelper = DBHelper.getInstance();
	}

	@Override
	public int save(String title, String content, int userId) {
		int resultRow = 0;
		conn = dbHelper.getConnection();
		String query = " INSERT INTO board(title, content, userId) VALUES "
				+ " (?, ?, ?); ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, userId);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" >> BlogDAO save() error <<");
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
	public BlogDTO select(int id) {
		BlogDTO blogDTO = null;
		conn = dbHelper.getConnection();
		String sql = " SELECT * FROM board "
				+ " WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				blogDTO = new BlogDTO(id, rs.getString("title"), rs.getString("content"), rs.getInt("readCount"), rs.getInt("userId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blogDTO;
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void delete(int id) {
		conn = dbHelper.getConnection();
		String query = " DELETE FROM board "
				+ " WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
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
	}
	
}
