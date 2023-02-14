package ch01;

import java.awt.FlowLayout;




import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx03 extends JFrame {

	private JButton[] buttons = new JButton[8];
	
	private FlowLayout flowLayout;
	

	public FlowLayoutEx03() {
		initData();
		setInitLayout();
	}

	public void initData() {
	
		setTitle("FlowLayout3");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + i);
		}
	}
	
	public void setInitLayout() {
		setLayout(flowLayout);
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}
	
	//코드 테스트
	public static void main(String[] args) {
		new FlowLayoutEx03();
	}

}
