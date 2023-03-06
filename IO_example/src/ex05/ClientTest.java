package ex05;

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
	final int PORT = 10000;
	
	BufferedReader socketReader = null;
	BufferedReader keyReader = null;
	BufferedWriter writer = null;
	
	public ClientTest() {
		initData();
	}
	
	private void initData() {
		try {
			socket = new Socket(IP, PORT);
			System.out.println("++서버 연결 완료++");
			
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			new Thread(new ReadThread(socketReader)).start();
			
			while(true) {
				String msg = keyReader.readLine();
				writer.write("클라이언트>>>" + msg + "\n");
				writer.flush();
				System.out.println("                              나>>>" + msg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socketReader.close();
				keyReader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	} // end of initData

	// main
	public static void main(String[] args) {
		new ClientTest();
	} // end of main
	
} // end of class
