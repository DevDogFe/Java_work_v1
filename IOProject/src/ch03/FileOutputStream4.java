package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {

	// main
	public static void main(String[] args) {

		FileOutputStream fos = null;
		try {
			byte[] bs = new byte[26];
			byte myData = 65;
			fos = new FileOutputStream("output2.txt", true); // false: 덮어쓰기, true: 기존 내용에 이어쓰기
			for (int i = 0; i < bs.length; i++) {
				// fos.write(myData);
				bs[i] = myData;
				myData++;
			}
			fos.write(bs);
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
