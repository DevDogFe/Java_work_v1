package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	// main
	public static void main(String[] args) {

		// 문자 단위로 읽는 스트림 (2바이트 처리)
		FileReader fr = null;
		
		try {
			fr = new FileReader("output2.txt");
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
