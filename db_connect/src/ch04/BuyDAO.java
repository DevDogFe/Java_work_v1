package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO{
	
	DBClient dbClient;
	
	public BuyDAO() {
		initData();
	}
	
	private void initData() {
		dbClient = new DBClient("shopdb");

	}

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
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
		
		int rowCount = 0;
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
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
		
		int rowCount = 0;
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
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
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
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
