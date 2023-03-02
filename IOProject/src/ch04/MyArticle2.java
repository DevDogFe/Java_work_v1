package ch04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle2 {

	// main
	public static void main(String[] args) {

		// 파일 입출력 활용해서 코드 작성
		// 입력 대상: article1.txt
		// 출력 대상: today_article.txt
		
		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article2.txt");
			
			String article = "";
			int i;
			fw.write("MVC 뉴스\n\n");
			while((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.write("\n\n작성자: 홍길동");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				// Writer를 작성할 때 스트림이 열려있으면 잠시 Buffer 공간에 담아두었다가
				// 스트림이 종료되거나 flush 메서드 만나면 실제로 file에 출력한다.
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // end of main

} // end of class
