package ch04_singletone;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO{
	
	private DBClient dbClient;
	
	private int rowCount;
	
	public BuyDAO() {
		initData();
	}
	
	private void initData() {
		dbClient = DBClient.getInstance();
		
		rowCount = 0;
	}

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		conn = dbClient.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM buyTBL ");
			
			while(rs.next()) {
				list.add(new BuyDTO(rs.getString("userName"), rs.getString("prodName"), rs.getInt("price"), rs.getInt("amount")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	} // end of select

	@Override
	public int insert(BuyDTO dto) {
		
		Statement stmt = null;
		Connection conn = null;
		conn = dbClient.getConnection();
		String sqlFormat = "INSERT INTO buytbl(userName, prodName, price, amount) "
				+ "VALUES ('%s', '%s', '%d', '%d');";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getProdName(), dto.getPrice(), dto.getAmount());
		try {
			stmt = conn.createStatement();
			rowCount = stmt.executeUpdate(sql); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowCount;
	} // end of insert

	@Override
	public int update(BuyDTO dto, String targetProdName) {
		
		Statement stmt = null;
		Connection conn = null;
		conn = dbClient.getConnection();
		String sqlFormat = "UPDATE buytbl"
				+ "	SET userName = '%s', price = '%d', amount ='%d'"
				+ "    WHERE prodName = '%s'; ";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getPrice(), dto.getAmount(), targetProdName);
		try {
			stmt = conn.createStatement();
			rowCount = stmt.executeUpdate(sql); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowCount;
	} // end of update
	
	@Override
	public void delete(String prodName) {
		
		Statement stmt = null;
		Connection conn = dbClient.getConnection();
		String sqlFormat = "DELETE FROM buytbl WHERE prodName = '%s' ";
		String sql = String.format(sqlFormat, prodName);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
