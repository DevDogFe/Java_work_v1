package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	// main
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");
			byte[] bs = new byte[10];
			fis.read(bs);
			for (byte b : bs) {
				System.out.print((char) b);
			}
			System.out.println("\n>>기사 종료<<");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
		} catch (IOException e) {
			System.out.println("입력 스트림 동작시 오류 발생");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class
