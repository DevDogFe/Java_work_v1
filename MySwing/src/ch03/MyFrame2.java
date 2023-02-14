package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{

	//내부 클래스 활용해서
	//Jpanel을 상송받고 paint 메서드로 집그림 그리기
	
	DrawPanel drawPanel;
	
	class DrawPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(400, 200, 500, 300); // 집
			g.drawLine(300, 200, 1000, 200); //지붕
			g.drawLine(300, 200, 450, 50);
			g.drawLine(1000, 200, 850, 50);
			g.drawLine(450, 50, 850, 50);
			g.drawRect(500, 300, 100, 200); // 문
			g.drawRect(510, 310, 80, 80); 
			g.drawRect(510, 410, 80, 80);
			g.drawOval(505, 395, 10, 10);
			g.drawRect(700, 250, 150, 100); // 창문
			g.drawRect(690, 240, 170, 120); 
			g.drawLine(770, 250, 770, 350);
			g.drawLine(780, 250, 780, 350);
			g.drawLine(500, 500, 350, 800); // 길
			g.drawLine(600, 500, 500, 800); 
			g.drawOval(250, 25, 30, 30); // 해
			g.drawOval(700, 600, 600, 400); // 못
			g.drawLine(0, 300, 400, 300); // 지평선
			g.drawLine(900, 300, 1100, 300);
			g.drawLine(0, 200, 200, 65); // 뒷산
			g.drawLine(200, 65, 350, 150);
			g.drawString("☆", 100, 15); // 별
			g.drawString("☆", 50, 45);
			g.drawString("☆", 300, 50);
			g.drawString("☆", 500, 35);
			g.drawString("☆", 800, 45);
			g.drawString("☆", 950, 35);
			g.drawString("☆", 1000, 95);
			g.drawString("☆", 1050, 55);
			g.drawOval(200, 500, 50, 50); // 사람
			g.drawLine(225, 550, 225, 650);
			g.drawLine(225, 570, 200, 650);
			g.drawLine(225, 570, 250, 650);
			g.drawLine(225, 650, 200, 750);
			g.drawLine(225, 650, 250, 750);
			g.drawLine(190, 750, 200, 750);
			g.drawLine(260, 750, 250, 750);
			
		}
	}
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("MyFrame2");
		setSize(1100, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
	}
	
	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}
	
}// end of outer class
