package ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyEvent1 extends JFrame implements KeyListener {

	private JTextArea area;

	public MyKeyEvent1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절불가설정
		area = new JTextArea();
	}

	private void setInitLayout() {

		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped: " + e.toString());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("keyPressed: " + e.toString());
		// 제어문을 활용해서 방향키 위가 눌러졌으면 콘솔에 up이라는 문자열을 출력
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//			System.out.println("LEFT");
			area.append("LEFT\n");
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
//			System.out.println("UP");
			area.append("UP\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//			System.out.println("RIGHT");
			area.append("RIGHT\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//			System.out.println("DOWN");
			area.append("DOWN\n");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased: " + e.toString());

	}

} // end of class
