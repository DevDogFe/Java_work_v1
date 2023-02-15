package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame{
	
	// JPanel에 이미지 넣기
	// 내부클래스 이용
	ImagePanel imagePanel; // 내부클래스를 멤버변수로 선언
	
	class ImagePanel extends JPanel{
		private Image image;
		
		public ImagePanel() {
			image = new ImageIcon("images/image1.png").getImage();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상, x, y, 
			g.drawImage(image, 0, 0, 400, 400, null);
		}
		
	} // end of inner class
	
	public MyImageFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {

		setTitle("이미지연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}
	
	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

} // end of outer class
