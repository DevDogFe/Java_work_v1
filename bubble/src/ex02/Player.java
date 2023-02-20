package ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Movable {

	private int x, y;
	private ImageIcon playerR, playerL;
	// 플레이어 현재 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	// 플레이어 상태
	private final int SPEED = 4;
	private final int JUMP_SPEED = 2;
	
	// setter 메서드 left right

	public Player() {
		initData();
		setInitLayout();
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		// 좌표기반, 라벨 크기 지정
		setSize(50, 50);
		setLocation(x, y);
		// JLabel의 아이콘을 세팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;
		right = false;
		setIcon(playerL);
		// 한번 키보다 왼쪽 방향 키를 누르면 쓰레드 생성
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(left) {
					setIcon(playerL);
					x = x < 59 ? x : x - SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}// end of while
				
			}
		}).start();

	}

	@Override
	public void right() {
		right = true;
		left = false;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x > 885 ? x : x + SPEED; 
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();;
	}

	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 130 / JUMP_SPEED; i++) {
					y -= JUMP_SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				up = false;
				down();
				
				
			}
		}).start();
	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i < 130 / JUMP_SPEED; i++) {
					y += JUMP_SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				down = false;
				
			}
		}).start();
	}

}
