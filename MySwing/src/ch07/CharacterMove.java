package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharacterMove extends JFrame implements Moveable{
	
	
	private JLabel label;
	private JLabel background;
	private int labelX;
	private int labelY;
	private int bgX;
	private int bgY;
	
	public CharacterMove() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/image6.png");
		label = new JLabel(icon);
		label.setSize(150, 250);
		background = new JLabel(new ImageIcon("images/background01.png"));
		background.setSize(1000, 800);
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(label);
		add(background);
		labelX = 100;
		labelY = 400;
		label.setLocation(labelX, labelY);
		bgX = 0;
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
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if(e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
				
			}
		});
		
	}

	@Override
	public void left() {
		int x = labelX -= 10;
		int y = labelY;
		if (x < 0) {
			x = 0;
			labelX = 0;
		}
		label.setLocation(x, y);
	}

	@Override
	public void right() {
		int x = labelX += 10;
		int y = labelY;
		if (x > 800) {
			x = 800;
			labelX = 800;
		}
		label.setLocation(x, y);
		
	}

	@Override
	public void up() {
		int x = labelX;
		int y = labelY -= 10;
		if (y < 0) {
			y = 0;
			labelY = 0;
		}
		label.setLocation(x, y);		
	}

	@Override
	public void down() {
		int x = labelX;
		int y = labelY += 10;
		if (y > 450) {
			y = 450;
			labelY = 450;
		}
		label.setLocation(x, y);		
	}
	
	public static void main(String[] args) {
		new CharacterMove();
	}

}
