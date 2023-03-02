package ex11;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Movable {

	private int x;
	private int y;
	// 버블의 움직임 방향
	private boolean left;
	private boolean right;
	private boolean up;
	// 적군을 맞춘 상태: 0 기본 1 적을 가둔 물방울
	private int state;
	
	private ImageIcon bubble; // 기본
	private ImageIcon bubbled; // 적을 가둔 상태
	private ImageIcon bomb; // 터짐

	private BubbleFrame mContext;
	private Player player;
	private BackgroundBubbleService backgroundBubbleService;

	public Bubble(BubbleFrame mContext) {
		this.mContext = mContext;
		backgroundBubbleService = new BackgroundBubbleService(this);
		initData();
		setInitLayout();
		initThread();
	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
		

	}

	private void setInitLayout() {
		x = mContext.getPlayer().getX();
		y = mContext.getPlayer().getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if (mContext.getPlayer().getpWay() == PlayerWay.LEFT) {
					// 왼쪽 발사
					left();
				} else {
					// 오른쪽 발사
					right();
				}

			}
		}).start();
	}

	@Override
	public void left() {

		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			if(backgroundBubbleService.leftWall()) {
				break;
			}
			// 적 위치 감지
			
			// System.out.println("적군 위치: " + mContext.getEnemy().getX());
			// 절대값 계산
			// 물방울의 x좌표값 90 적 x좌표값 150
			if(Math.abs(x - mContext.getEnemy().getX()) < 10
					&& Math.abs(y - mContext.getEnemy().getY()) < 50) {
				if(mContext.getEnemy().getState() == 0) {
					crash();
				}
				
			}
			// Math.abs(x - mContext.getEnemy().getX()) < 10
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		up();

	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if(backgroundBubbleService.rightWall()) {
				break;
			}
			if(Math.abs(x - mContext.getEnemy().getX()) < 10
					&& Math.abs(y - mContext.getEnemy().getY()) < 50) {
				if(mContext.getEnemy().getState() == 0) {
					crash();
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		up();

	}

	@Override
	public void up() {
		up = true;
		while (true) {
			y--;
			setLocation(x, y);
			if(backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		clearBubble();
		
	}
	// 메서드 행위(동사)
	private void clearBubble() {
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			Thread.sleep(500);
			setIcon(null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void crash() {
		mContext.getEnemy().setState(1);
		state = 1;
		setIcon(bubbled);
		// heap 메모리에서는 아직 남아있다. (가비지 컬렉터가 알아서 제거해준다.)
		mContext.getEnemy().remove(mContext.getEnemy());
		mContext.getEnemy().setIcon(null);
		mContext.getEnemy().setLocation(0, 0);
		mContext.repaint();
	}

} // end of class
