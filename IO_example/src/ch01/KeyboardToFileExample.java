package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFileExample {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));) {
			// 중괄호 안에 수행시킬 코드
			System.out.println("키보드로 입력받아 데이터를 파일에 작성");

			String input = reader.readLine();
			// 사용자 입력값이 quit가 아니라면 true(계속 진행)
			while (!input.equals("quit")) {
				//파일에 글 작성
				writer.write(input);
				writer.newLine();
				input = reader.readLine();
			}
			System.out.println("출력이 완료되었습니다.");
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
