package ch05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	// main
	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output3.txt");
			// 보조스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			bos.write(97);
			bos.write(98);
			bos.write(99);
			bos.flush(); // 물을 내리다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
