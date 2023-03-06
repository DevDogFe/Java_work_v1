package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	ServerSocket serverSocket;
	Socket socket;
	
	public ServerTest() {
		initData();
	}
	
	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String msg = "클라이언트에서 온 메세지: " + reader.readLine() + "\n";
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// main
	public static void main(String[] args) {
		new ServerTest();
	} // end of main
	
} // end of class
