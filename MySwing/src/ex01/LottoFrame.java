package ex01;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class LottoFrame extends JFrame{
	
	JButton button;
	LottoRandomNumber lottoRandomNumber;
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Game Start");
		lottoRandomNumber = new LottoRandomNumber();
	}
	
	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림 그릴 때 두가지 구분. 처음, 버튼
		if(isStart == false) {
			g.drawString("게임을 실행해 주세요", 150, 150);
			return;
		}
		
		int[] getNumbers = lottoRandomNumber.createNumber();
		int x = 50;
		for(int i = 0; i < getNumbers.length; i++) {
			g.drawString(getNumbers[i] + "", x, 150);
			x += 100;
		}
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				repaint();
			}
		});
	}
	
	

}
