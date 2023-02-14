package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("MyFrame01"); // 제목
		// width, height
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		// GUI 관련 프로그램 학습시에 배치관리자 먼저 명확히 이해
		// 레이아웃
	}
}
