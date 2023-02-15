package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RainbowColorFrame extends JFrame implements ActionListener {

	private JButton[] buttons;
	private JPanel panel;
	String[] colors = { "Red", "Orange", "Yellow", "Green", "Blue", "Cyan", "Magenta" };

	public RainbowColorFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		buttons = new JButton[7];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(colors[i]);
		}

	}

	private void setInitLayout() {
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(panel);
		for (int i = 0; i < buttons.length; i++) {
			panel.add(buttons[i]);
		}
		panel.setBackground(Color.gray);
		setVisible(true);
	}

	private void addEventListener() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton)e.getSource();
		if (buttons[0] == targetButton) {
			panel.setBackground(Color.red);
		} else if (buttons[1] == targetButton) {
			panel.setBackground(Color.orange);
		} else if (buttons[2] == targetButton) {
			panel.setBackground(Color.yellow);
		} else if (buttons[3] == targetButton) {
			panel.setBackground(Color.green);
		} else if (buttons[4] == targetButton) {
			panel.setBackground(Color.blue);
		} else if (buttons[5] == targetButton) {
			panel.setBackground(Color.cyan);
		} else if (buttons[6] == targetButton) {
			panel.setBackground(Color.magenta);
		}

	}

	public static void main(String[] args) {
		new RainbowColorFrame();
	}

}
