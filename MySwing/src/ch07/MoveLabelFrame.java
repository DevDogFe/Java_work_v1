package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame extends JFrame{
	
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	
	public MoveLabelFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelText = new JLabel("Hello World");
		labelText.setSize(100, 100);
	}
	
	private void setInitLayout() {
		setLayout(null);
		labelTextX = 300;
		labelTextY = 350;
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);
	}
	
	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// 이벤트가 일어난 시점의 xy좌표 확인
					
					int x = labelTextX += 50;
					int y = labelTextY;
					// 화면 밖으로 나가지 않게 가두기
					if (x > 700) {
						x = 700;
						labelTextX = 700;
					}
					labelText.setLocation(x, y);
					
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					int x = labelTextX -= 50;
					int y = labelTextY;
					if (x < 0) {
						x = 0;
						labelTextX = 0;
					}
					labelText.setLocation(x, y);
				} else if(e.getKeyCode() == KeyEvent.VK_UP) {
					int x = labelTextX;
					int y = labelTextY -= 50;
					if (y < 0) {
						y = 0;
						labelTextY = 0;
					}
					labelText.setLocation(x, y);
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					int x = labelTextX;
					int y = labelTextY += 50;
					if (y > 700) {
						y = 700;
						labelTextY = 700;
					}
					labelText.setLocation(x, y);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});

	}

}
