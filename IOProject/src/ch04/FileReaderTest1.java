package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	// main
	public static void main(String[] args) {

		// 문자 단위로 읽는 스트림 (2바이트 이상 처리)
		FileReader fr = null;
		
		try {
			fr = new FileReader("output2.txt");
			int temp = fr.read();
			System.out.println("temp: " + temp);
			System.out.println("temp: " + (char)temp); // 2바이트씩 읽으므로 한글이 깨지지 않는다.
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
