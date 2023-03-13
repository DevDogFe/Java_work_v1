package ch04_singletone;

import java.util.ArrayList;

public class MainTest2 {

	// main
	public static void main(String[] args) {
		
		BuyDAO buyDAO = new BuyDAO();
//		int i = buyDAO.insert(new BuyDTO("이승기", "마우스", 30, 1));
//		System.out.println(i);
		for (BuyDTO buyDTO : buyDAO.select()) {
			System.out.println(buyDTO);
		}
		
		
		
	} // end of main

} // end of class
