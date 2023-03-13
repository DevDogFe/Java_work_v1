package ch04;

import java.util.ArrayList;

public class MainTest2 {

	// main
	public static void main(String[] args) {
		
		BuyDAO buyDAO = new BuyDAO();
		buyDAO.delete("일본도");
		
//		for (BuyDTO buyDTO : buyDAO.select()) {
//			System.out.println(buyDTO);
//		}
		
		
		
	} // end of main

} // end of class
