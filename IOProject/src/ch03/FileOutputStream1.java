package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	// main
	public static void main(String[] args) {

		// 현재 output.txt 파일 없음
		FileOutputStream fos = null;
		try {
			// FileOutputStream은 파일이 없다면 파일을 먼저 생성해 준다.
			fos = new FileOutputStream("output.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main

}
