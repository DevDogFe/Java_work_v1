package ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyEvent2 extends JFrame {

	private JTextArea area;

	public MyKeyEvent2() {
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
		// 익명 클래스
		// 익명 구현 클래스: 인터페이스 + 추상클래스를 구현클래스로 만들 수 있다.
		KeyListener keyListener;
		// 인터페이스를 구현클래스로 변형해서 사용할 수 있다.
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	
} // end of class
