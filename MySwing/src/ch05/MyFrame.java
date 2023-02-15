package ch05;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	// 그림 위에 그림 올리기
	// JLabel 활용하여 이미지 겹치기
	private JLabel backgroundMap;
	private JLabel player;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 겹치기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Icon icon = new ImageIcon("images/background2.png");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(500, 500);
		player = new JLabel(new ImageIcon("images/image3.png"));
		player.setSize(300, 400);
	}

	private void setInitLayout() {
		backgroundMap.setLocation(0, 0);
		player.setLocation(100, 50);
		add(player); // 먼저 add한 요소가 위로옴
		add(backgroundMap);
		setLayout(null);
		setVisible(true);
	}

}
