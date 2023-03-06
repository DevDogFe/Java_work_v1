package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {
	
	// 필요한 것: 소켓 + 주소 + 포트번호
	Socket socket;
	final String IP = "localhost";
	// final String IP = "192.168.0.82";
	final int PORT = 10000;
	BufferedReader reader = null;
	BufferedWriter writer = null;
	
	public ClientTest() {
		initData();
	}
	
	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			// 클라이언트와 서버연결 완료 상태
			
			// 키보드에서 데이터 입력
			reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			
			// 소켓 통신 통해서 데이터 출력
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			writer.write(input);
			writer.newLine();
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} 

	}
	
	// main
	public static void main(String[] args) {
		new ClientTest();
	} // end of main

} // end of class
