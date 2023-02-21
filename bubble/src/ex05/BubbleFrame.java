package ex05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
		new Thread(new BackgroundPlayerService(player)).start();

	}

	private void initData() {
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setContentPane(backgroundMap);
		player = new Player();
	}

	private void setInitLayout() {
		add(player);
		setLayout(null); // = absolute 레이아웃
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if (!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}
					break;

				case KeyEvent.VK_RIGHT:
					if(!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}
					break;

				case KeyEvent.VK_UP:
					player.up();
					break;

				case KeyEvent.VK_DOWN:
					player.down();
					break;
					
				case KeyEvent.VK_SPACE:
					Bubble bubble = new Bubble(player);
					add(bubble);
					break;

				}
			}// end of pressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 버튼을 떼면 player 정지
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 버튼을 떼면 player 정지
					player.setRight(false);
					break;

				}
			} // end of released

		});
	}

	// ***** 자바 프로그램중 main함수를 가지는 클래스는
	// 프로그램에서 사용하는 모든 참조값을 접근할 수 있다. *****
	public static void main(String[] args) {
		new BubbleFrame();
	}

}
