package ch01;

import java.awt.FlowLayout;



import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	private JButton[] buttons = new JButton[8];
	
	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + i);
		}
		flowLayout = new FlowLayout(FlowLayout.CENTER, 20, 20);
	}

	public void setInitLayout() {
		// 배치관리자 설정하기
		// FlowLayout
		setLayout(flowLayout);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}
	
	//코드 테스트
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}

}
