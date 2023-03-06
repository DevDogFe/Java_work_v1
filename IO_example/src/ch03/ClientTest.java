package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {
	
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
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.println("키보드 입력 대기");
				String input = reader.readLine();
				writer.write(input);
				writer.newLine();
				writer.flush();
			}
			
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
