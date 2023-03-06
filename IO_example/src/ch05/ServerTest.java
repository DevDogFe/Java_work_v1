package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	ServerSocket serverSocket;
	Socket socket;
	
	BufferedReader reader = null; // 소켓을 담당하는 입력스트림
	BufferedWriter writer = null; // 서버측에서 키보드 데이터를 입력받기 위해 입력스트림이 필요하다.
	BufferedReader keyboardReader = null; // 키보드 입력 데이터를 담당

	public ServerTest() {
		initData();
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			// 입력스트림 (대상: 소켓)
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 입력스트림 (대상: System.in)
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			// 출력스트림 (대상: 소켓)
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// new Thread(new WriterThread()).start();
			WriterThread writerThread = new WriterThread();
			Thread thread = new Thread(writerThread);
			thread.start();
			
			while (true) {
				String msg = "클라이언트>>> " + reader.readLine() + "\n";
				System.out.println(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of initData

	// 내부 클래스 생성
	class WriterThread implements Runnable {

		// 작업자가 해야 할 일을 정의
		@Override
		public void run() {
			// 키보드에서 데이터를 입력받아 소켓 출력 스트림을 통해 데이터를 보내주어야한다.
			while(true) {
				try {
					String serverMsg = "서버: " + keyboardReader.readLine();
					// 출력 스트림 통해 데이터 보내기 <-- 소켓
					System.out.println("서버가 작성한 문구 확인: " + serverMsg);
					writer.write(serverMsg + "\n");
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	// main
	public static void main(String[] args) {
		new ServerTest();
	} // end of main

} // end of class
