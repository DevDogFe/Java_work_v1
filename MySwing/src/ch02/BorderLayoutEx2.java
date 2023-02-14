package ch02;

import java.awt.BorderLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame {
	// 컴포넌트들을 동 서 남 북 센터 배치
	// 변수 선언과 동시에 초기화 지원
	String[] direction = {BorderLayout.EAST, BorderLayout.WEST, 
			BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER};
	JButton[] buttons = new JButton[5];

	public BorderLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}

	private void setInitLayout() {
		setLayout(new BorderLayout()); // 기본레이아웃
		// borderLayout은 매개변수값 하나를 더 추가시킬 수 있다. (방향 지정)
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);
		}
		setVisible(true);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new BorderLayoutEx2();
	}

}// end of class
