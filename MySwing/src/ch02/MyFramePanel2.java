package ch02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel2 extends JFrame {

	private JButton[] buttons = new JButton[6];

	// 패널 : 컴포넌트들을 그룹화, 각각의 배치관리자를 지정할 수 있다.
	private JPanel panel1;
	private JPanel panel2;

	public MyFramePanel2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("패널추가 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);

		// 버튼 초기화
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));

		}
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		// 루트 패널 기본 레이아웃 BorderLayout이다.
		// 하지만 추가적으로 만들어 사용하는 Panel은 기본 레이아웃이 FlowLayout이다.
		for (int i = 0; i < 3; i++) {
			panel1.add(buttons[i]);
		}
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < 3; i++) {
			panel2.add(buttons[i + 3]);
		}
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFramePanel2();
	}

}
