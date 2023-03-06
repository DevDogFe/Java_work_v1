package ch05;

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
	BufferedReader keyboardReader = null;
	BufferedWriter writer = null;
	// 소켓 통신을 통해 들어온 데이터 입력 스트림
	BufferedReader socketReader = null;

	public ClientTest() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			// (대상:키보드) 입력 스트림
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			// (대상: 소켓) 입출력 스트림
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 서버측으로 온 데이터 입력 스트림 읽는 쓰레드 시작
			new Thread(new ReadThread()).start();
			
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = keyboardReader.readLine();
				writer.write(input);
				writer.newLine();
				writer.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboardReader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	} // end of initData

	class ReadThread implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					String serverMsg = socketReader.readLine();
					System.out.println("서버>>> " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// main
	public static void main(String[] args) {
		new ClientTest();
	} // end of main

} // end of class
