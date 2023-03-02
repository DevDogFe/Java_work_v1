package ch01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 소켓 통신을 구현
// 1. 서버측, 클라이언트 측은 통신을 통해 데이터를 주고 받게된다.
// 서버측 만들 때 서버 소켓을 준비해야 한다.
// 소켓은 양 끝단에 포트번호를 달아야 한다.
// 포트번호 사용 가능 범위: 0 ~ 65335 
// 그 중에 0 ~ 1023번 포트번호는 잘 알려진 포트번호라 가능한 사용하지 않는게 좋다.
public class ServerFile {
	// 클라이언트 연결만 받는 소켓
	ServerSocket serverSocket;
	// 실제 통신을 하는 소켓
	Socket socket;
	
	public ServerFile() {
		System.out.println(">> 1. 서버 소켓 시작 <<");

		try {
			// 서버 소켓을 포트번호와 함께 생성
			serverSocket = new ServerSocket(11000);
			// 누군가 접속하기 위해서 대기
			socket = serverSocket.accept(); // 클라이언트 접속 대기중
			// 클라이언트가 연결되면 통신을 담당하는 소켓을 생성(랜덤포트번호를 생성)
			System.out.println("2. 클라이언트 연결 완료");
			System.out.println("---------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("코드 확인");
	} // end of constructor

	// main
	public static void main(String[] args) {
		new ServerFile();
	}// end of main
	
}
