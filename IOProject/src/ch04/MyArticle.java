package ch04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle {

	// main
	public static void main(String[] args) {

		// 파일 입출력 활용해서 코드 작성
		// 입력 대상: article1.txt
		// 출력 대상: today_article.txt
		
		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
			
			String article = "";
			int i;
			
			while((i = fr.read()) != -1) {
				article += (char)i;
			}
			fw.write("기사제목: 도박사이트 운영조직 적발 \n\n" + article + " \n\n작성자: 홍길동");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} // end of main

} // end of class
