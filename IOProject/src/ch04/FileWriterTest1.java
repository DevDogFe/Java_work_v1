package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	// main
	public static void main(String[] args) {

		FileWriter fw = null;
		char[] buf = { '반', '갑', '습', '니', '다' };
		try {
			fw = new FileWriter("writer1.txt");
			// fw.write('H'); // 문자 하나만 출력 --> 대상 File
			// fw.write(buf); // 문자 배열로 파일에다가 출력
			// (대상, 인덱스, 길이)
			fw.write(buf, 1, 3); // 배열 buf의 인덱스 1번부터 3개
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class
