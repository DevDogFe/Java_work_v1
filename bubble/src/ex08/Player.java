package ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Movable {
	
	BubbleFrame mContext;

	private int x, y;
	private ImageIcon playerR, playerL;
	//플레이어의 방향상태(enum타입 사용: 데이터의 범주화)
	private PlayerWay pWay;
	// 플레이어 현재 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	// 플레이어 상태
	private final int SPEED = 4;
	private final int JUMP_SPEED = 2;

	// setter 메서드 left right

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}
	
	public PlayerWay getpWay() {
		return pWay;
	}

	public void setpWay(PlayerWay pWay) {
		this.pWay = pWay;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	
	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	
	
	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		pWay = PlayerWay.RIGHT;
	}

	private void setInitLayout() {
		x = 500;
		y = 535;
		// 좌표기반, 라벨 크기 지정
		setSize(50, 50);
		setLocation(x, y);
		// JLabel의 아이콘을 세팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		pWay = PlayerWay.LEFT;
		left = true;
		right = false;
		setIcon(playerL);
		// 한번 키보다 왼쪽 방향 키를 누르면 쓰레드 생성
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} // end of while

			}
		}).start();

	}

	@Override
	public void right() {
		pWay = PlayerWay.RIGHT;
		right = true;
		left = false;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();
		;
	}

	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMP_SPEED; i++) {
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
				
				while(down) {
					

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
	
	public void attack() {
		Bubble bubble = new Bubble(this);
		// 부모의 .add();
		mContext.add(bubble);
	}

} // end of class
