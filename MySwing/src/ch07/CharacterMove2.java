package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharacterMove2 extends JFrame implements Moveable {

	private JLabel label;
	private JLabel background;
	private int labelX;
	private int labelY;
	private int bgX;
	private int bgY;

	public CharacterMove2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/image6.png");
		label = new JLabel(icon);
		label.setSize(150, 250);
		background = new JLabel(new ImageIcon("images/background02.png"));
		background.setSize(1600, 800);
	}

	private void setInitLayout() {
		setLayout(null);
		add(label);
		add(background);
		labelX = 100;
		labelY = 400;
		label.setLocation(labelX, labelY);
		bgX = -300;
		bgY = 0;
		background.setLocation(bgX, bgY);
		setVisible(true);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}

			}
		});

	}

	@Override
	public void left() {
		labelX -= 10;
		if (labelX < 0) {
			labelX = 0;
			bgX += 10;
			if (bgX > 0) {
				bgX = 0;
			}
		}
		label.setLocation(labelX, labelY);
		background.setLocation(bgX, bgY);
	}

	@Override
	public void right() {
		labelX += 10;
		if (labelX > 800) {
			labelX = 800;
			bgX -= 10;
			if (bgX < -600) {
				bgX = -600;
			}
		}
		label.setLocation(labelX, labelY);
		background.setLocation(bgX, bgY);

	}

	@Override
	public void up() {
		labelY -= 10;
		if (labelY < 250) {
			labelY = 250;
			labelY = 250;
		}
		label.setLocation(labelX, labelY);
	}

	@Override
	public void down() {
		labelY += 10;
		if (labelY > 400) {
			labelY = 400;
			labelY = 400;

		}
		label.setLocation(labelX, labelY);
	}
	
	
	public static void main(String[] args) {
		new CharacterMove2();
	}

}
