package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	// 클라이언트로 연결 받는 소켓
	ServerSocket serverSocket;
	// 실제 통신을 담당할 소켓
	Socket socket;
	
	public ServerTest() {
		initData();
	}
	
	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			// 입력 스트림 연결 (대상: 소켓)
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(reader.readLine() + "\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// main
	public static void main(String[] args) {
		new ServerTest();
	} // end of main
	
} // end of class
