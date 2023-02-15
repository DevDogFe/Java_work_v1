package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListener1 extends JFrame{
	
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	
	public MouseEventListener1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelText = new JLabel("Hello World");
		labelText.setSize(100, 100);
	}
	
	private void setInitLayout() {
		setLayout(null);
		labelTextX = 300;
		labelTextY = 350;
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				labelText.setLocation(e.getX(), e.getY());
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});

	}

}
