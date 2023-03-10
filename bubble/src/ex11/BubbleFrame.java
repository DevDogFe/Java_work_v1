package ex11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// ** 메인을 가지는 클래스는 프로그램에 사용하는 참조 변수를 다 알 수 있다.
public class BubbleFrame extends JFrame {

	// 주소값을 mContext에 담는다.
	private BubbleFrame mContext = this;
	
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
		new Thread(new BackgroundPlayerService(player)).start();
		new Thread(new BackgroundEnemyService(enemy)).start();

	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}

	private void initData() {
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setContentPane(backgroundMap);
		// 부모의 주소값을 자식 객체에게 던져준다.
		player = new Player(mContext);
		enemy = new Enemy();
	}

	private void setInitLayout() {
		add(player);
		add(enemy);
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
					if (!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}
					break;

				case KeyEvent.VK_UP:
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;

				case KeyEvent.VK_DOWN:
					break;

				case KeyEvent.VK_SPACE:
					player.attack();
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
