package ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest4 {

	// main
	public static void main(String[] args) {

		// 기반 + 보조 스트림 (자료형 문자단위)

		FileReader fileReader = null;
		int count = 0;
		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
			// 한줄씩 읽기
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int i;

			// 파일에 출력하기
			FileWriter writer = new FileWriter("myText.txt");

			// 기반 스트림 사용 (자료대상 - 문자열)
			writer.write(bufferedReader.readLine()); // 한줄 한번에 담아 쓰기

			writer.flush(); // 데이터 정리 완료
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" 반복횟수: " + count);

	} // end of main

} // end of class
