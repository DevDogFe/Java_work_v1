package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {

	// main
	public static void main(String[] args) {

		FileInputStream fis = null;

//		try {
//			fis = new FileInputStream("temp");
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("temp 라는 파일이 없습니다.");
//		}

		// try-catch-finally

		try {
			fis = new FileInputStream("test1.txt");
			return;
		} catch (FileNotFoundException e) {
			System.out.println("파일명 확인 요망");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 반드시 수행되는 코드
			// 심지어 return 키워드를 만나도 수행
			System.out.println("finally 수행");
		}
		
		System.out.println("비정상 종료되지 않음");

	}// end of main

}// end of class
