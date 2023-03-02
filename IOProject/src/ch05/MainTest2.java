package ch05;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	// main
	public static void main(String[] args) {

		long millisecond = 0;

		// 1
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");

			int i;
			millisecond = System.currentTimeMillis();
			while ((i = fis.read()) != -1) {
				// 읽고 있는 중 --> i
				fos.write(i); // 쓰는 중
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("파일 복사 소요시간: " + millisecond); // 1557

	} // end of main

} // end of class
