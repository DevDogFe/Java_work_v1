package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame{

	// 1. 구현처리
	// 2. 익명클래스
	
	private JTextArea area;
	private KeyListener keyListener = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	};
	
	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();

	}
	
	private void setInitLayout() {
		
		add(area);
		setVisible(true);

	}
	
	private void addEventListener() {
		area.addKeyListener(keyListener);
	}
	
}
