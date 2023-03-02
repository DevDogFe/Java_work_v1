package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	// main
	public static void main(String[] args) {

		FileOutputStream fos = null;
		// output3.txt -> hello world 찍기
		try {
			// byte[] bs = { 104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100 };
			byte[] bs = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
			fos = new FileOutputStream("output3.txt");
			for (int i = 0; i < bs.length; i++) {
				fos.write(bs[i]);
			}
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
