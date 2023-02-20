package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Movable{
	
	private int x, y;
	private ImageIcon playerR, playerL;
	
	public Player() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
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
		setIcon(playerL);
		x -= 10;
		setLocation(x, y);
		
	}

	@Override
	public void right() {
		setIcon(playerR);
		x += 10;
		setLocation(x, y);
	}

	@Override
	public void up() {
	}

	@Override
	public void down() {
	}
	
	

}
