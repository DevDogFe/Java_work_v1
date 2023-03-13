package ch02_ex01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {

	// main
	public static void main(String[] args) {

		ArrayList<BuyTable> list = new ArrayList<>();
		
		// 코드 실행
		DBClient client = new DBClient();
		client.setDB_NAME("shopdb");
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from buytbl; ");

			while (rs.next()) {
				list.add(new BuyTable(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (BuyTable buyTable : list) {
			System.out.println(buyTable);
		}

	} // end of main

} // end of class

class BuyTable {
	
	private String userName;
	private String prodName;
	private int price;
	private int amount;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public BuyTable(String userName, String prodName, int price, int amount) {
		super();
		this.userName = userName;
		this.prodName = prodName;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BuyTable [userName=" + userName + ", prodName=" + prodName + ", price=" + price + ", amount=" + amount
				+ "]";
	}
	
	
	
	
}