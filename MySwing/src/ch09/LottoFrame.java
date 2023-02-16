package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 화면을 담당
public class LottoFrame extends JFrame {
	
	JButton button;
	LottoNumber lottoNumber;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("추첨 시작");
		lottoNumber = new LottoNumber();
		

	}
	
	private void setInitLayout() {

		add(button, BorderLayout.NORTH);
		setVisible(true);
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lottoNumber.lotto();
				repaint();
			}
		});

	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("굴림체", Font.BOLD, 20);
		g.setFont(f);
		
		if(lottoNumber.lottoNumbers[0] == 0) {
			g.drawString("버튼을 클릭해 주세요", 200, 200);
		} else {
			int x = 50;
			for (int i = 0; i < lottoNumber.lottoNumbers.length; i++) {
				g.drawString(lottoNumber.lottoNumbers[i] + "", x, 200);
				x += 100;
			}
		}
	}
	
	public static void main(String[] args) {
		new LottoFrame();
	}
	

}
