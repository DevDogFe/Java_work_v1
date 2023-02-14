package ch01;

import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	private JButton button1;
	private JButton button2;
	private FlowLayout flowLayout;
	

	public FlowLayoutEx2() {
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
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}

	public void setInitLayout() {
		// 배치관리자 설정하기
		// FlowLayout
		setLayout(flowLayout);
		add(button1);
		add(button2);
	}
	
	//코드 테스트
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}

}
