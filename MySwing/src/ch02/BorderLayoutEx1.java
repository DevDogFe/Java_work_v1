package ch02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame {
	// 컴포넌트들을 동 서 남 북 센터 배치

	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");

	public BorderLayoutEx1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		 setLayout(new BorderLayout()); // 기본레이아웃
		// borderLayout은 매개변수값 하나를 더 추가시킬 수 있다. (방향 지정)
		add(button1, BorderLayout.EAST);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		setVisible(true);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new BorderLayoutEx1();
	}
	
}// end of class
