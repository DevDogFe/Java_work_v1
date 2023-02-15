package ch08;

import java.util.Scanner;

public class ExceptionHandling {

	// main
	public static void main(String[] args) {
		
		// try-catch-finally
		// finally 언제 사용할까?
		Scanner scanner = new Scanner(System.in);
		
		try {
			int result = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close(); // 자원 해제 용도로 사용
		}
		

	} // end of main

} // end of class
