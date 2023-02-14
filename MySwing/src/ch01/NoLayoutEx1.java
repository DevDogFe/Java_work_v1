package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx1 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;

	public NoLayoutEx1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("좌표기반 연습");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button1.setSize(100, 100);
		button2 = new JButton("button2");
		button2.setSize(150, 50);
		button3 = new JButton("button3");
		button3.setSize(200, 30);
	}

	private void setInitLayout() {
		setLayout(null); // 좌표기반으로 컴포넌트들을 배치
		// 좌표 기반을 셋팅하면 각 컴포넌트에 크기를 지정해 줘야 한다. 기본값은 0
		button1.setLocation(100, 100);
		button2.setLocation(200, 150);
		button3.setLocation(450, 200);
		add(button1);
		add(button2);
		add(button3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoLayoutEx1();
	}
}
