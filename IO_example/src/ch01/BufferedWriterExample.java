package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	// main
	public static void main(String[] args) {

		// 글자 만들어두고 파일에다가 출력하기
		// 출력 스트림 필요하다. 파일 - 문자
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output1.txt"));
			writer.write("hello world");
			writer.newLine(); // 한줄 띄우는 명령어
			writer.write("안녕하세요");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	} // end of main

} // end of class
