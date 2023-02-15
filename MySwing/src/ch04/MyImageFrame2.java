package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame2 extends JFrame {

	ImagePanel imagePanel;

	static class ImagePanel extends JPanel {

		private Image image;
		private Image image2;
		private Image image3;
		private Image image4;

		public ImagePanel() {
			image = new ImageIcon("images/image3.png").getImage();
			image2 = new ImageIcon("images/image4.png").getImage();
			image3 = new ImageIcon("images/image5.png").getImage();
			image4 = new ImageIcon("images/image6.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 100, 100, null);
			g.drawImage(image2, 200, 300, 80, 100, null);
			g.drawImage(image3, 300, 50, 200, 100, null);
			g.drawImage(image4, 150, 150, 150, 150, null);
		}

	}

	public MyImageFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {

		setTitle("static 내부클래스");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new MyImageFrame2();
	}

}
