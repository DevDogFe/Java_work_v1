package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 배치관리자 - FlowLayout
// component들을 수평/수직으로 배치해
public class FlowLayoutEx extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	

	public FlowLayoutEx() {
		// 초기화값 세팅(메서드 통해 역할 분담)
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
	}

	public void setInitLayout() {
		// 배치관리자 설정하기
		// FlowLayout
		setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 25));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
	}
	
	//코드 테스트
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
