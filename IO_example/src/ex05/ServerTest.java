package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	private ServerSocket serverSocket;
	private Socket socket;

	private BufferedReader socketReader = null; // 소켓용 리더
	private BufferedReader keyReader = null; // 키보드 리더
	private BufferedWriter writer = null; // 소켓 송출

	public ServerTest() {
		initData();
	}

	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public BufferedReader getSocketReader() {
		return socketReader;
	}

	public void setSocketReader(BufferedReader socketReader) {
		this.socketReader = socketReader;
	}

	public BufferedReader getKeyReader() {
		return keyReader;
	}

	public void setKeyReader(BufferedReader keyReader) {
		this.keyReader = keyReader;
	}

	public BufferedWriter getWriter() {
		return writer;
	}

	public void setWriter(BufferedWriter writer) {
		this.writer = writer;
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("--클라이언트 연결 완료--");

			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			new Thread(new ReadThread(socketReader)).start();
			
			while(true) {
				String msg =  keyReader.readLine();
				writer.write("서버>>> " + msg + "\n");
				writer.flush();
				System.out.println("                              나>>> " + msg);
			}

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
		new ServerTest();
	} // end of main

} // end of class
