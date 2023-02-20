package ex02;

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
					player.left();
					break;

				case KeyEvent.VK_RIGHT:
					player.right();
					break;

				case KeyEvent.VK_UP:
					player.up();
					break;

				case KeyEvent.VK_DOWN:
					player.down();
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
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
