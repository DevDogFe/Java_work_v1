package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	// main
	public static void main(String[] args) {

		// 키보드에서 값 입력 받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		try {
			String input = reader.readLine();
			System.out.println("input: " + input);
			
			while(input != null) {
				System.out.print("입력: ");
				input = reader.readLine();
				System.out.println("입력한 값: " + input);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	} // end of main

} // end of class
