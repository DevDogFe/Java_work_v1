package ch01;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

	JButton[] buttons = new JButton[5];
	int[] numbers = new int[100];
	Random random = new Random();

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("좌표설정");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (random.nextInt(20)+1) * 30;
		}
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + (i + 1));
			buttons[i].setSize(20 * (i + 5), 30);
		}
	}

	private void setInitLayout() {
		setLayout(null);
		for (int i = 0; i < buttons.length; i++) {
			int r = random.nextInt(100);
			int s = random.nextInt(100);
			buttons[i].setLocation(numbers[r], numbers[s]);
			add(buttons[i]);
		}
		setVisible(true);
	}

	// 코드테스트
	public static void main(String[] args) {
		new NoLayoutEx2();
	} // end of main

}// end of class
