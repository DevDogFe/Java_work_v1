package ex05;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel{

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
	
	private Player player;
	
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
	}
	
	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);

	}
	
	private void setInitLayout() {
		

	}
	
}
