package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {

	// 배경이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스 (적) 이미지1
	BufferedImage grayImage1;
	// jpanel 상속 --> innerClass
	CustomPanel customPanel;
	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread = new Thread(customPanel);
//		thread.start();
		new Thread(customPanel).start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개, CustomPanel
		try {
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray_image1.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}
		// CustomPanel 메모리에 올라가는 순간 paintComponent() 메서드 호출
		customPanel = new CustomPanel();

	}

	private void setInitLayout() {
		// 레이아웃은 기본 레이아웃으로 설정
		// add 호출시 paintComponent() 메서드 실행
		add(customPanel);
		setVisible(true);

	}

	private void addEventListener() {
		// 이벤트 리스너 등록 처리
		this.addKeyListener(this);
	}

	class CustomPanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			while (true) {
				if (isRight) {
					grayX += 1;
				} else {
					grayX -= 1;
				}

				// 방향 체크
				if (grayX == 500) {
					isRight = false;
				} else if (grayX == -20) {
					isRight = true;
				}

				try {
					Thread.sleep(4);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (Math.abs((pinkX + 50) - (grayX + 50)) < 50 && Math.abs((pinkY + 50) - (grayY + 50)) < 50) {
					pinkImage1 = null;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
						pinkX = 200;
						pinkY = 200;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				repaint();

			}

		}

	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			// 왼
			pinkX = (pinkX < 0) ? pinkX = -20 : pinkX - 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// 오른
			pinkX = (pinkX > 500) ? pinkX = 505 : pinkX + 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			// 위
			pinkY = (pinkY < 0) ? pinkY = -10 : pinkY - 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			pinkY = (pinkY > 470) ? pinkY = 475 : pinkY + 10;
			// 아래
		}
		// 그림 다시 그려주기 실행

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

} // end of outer class
