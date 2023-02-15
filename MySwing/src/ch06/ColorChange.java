package ch06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener{

	private JPanel panel;
	private JButton button1;
	private JButton button2;
	
	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("click1");
		button2 = new JButton("click2");
	}
	
	private void setInitLayout() {
		add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		setVisible(true);
	}
	
	private void addEventListener() {
		// this --> ColorChange --> 다형성으로 인터페이스 적용된 ActionListener 타입으로 바라봄
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object
		// 다운캐스팅 버튼으로 코드 작성
		// System.out.println(e.getSource());
		JButton targetButton = (JButton)e.getSource();
//		targetButton.setText("눌러진 버튼입니다.");
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		} else {
//			panel.setBackground(Color.darkGray);
//		}
		// 문자열을 비교해서 색상을 변경시키는 코드 작성
		if (targetButton == this.button1) {
			panel.setBackground(Color.blue);
		} else {
			panel.setBackground(Color.gray);
		}
	}
	
	// 테스트 코드
	public static void main(String[] args) {
		new ColorChange();

	}// end of main

}// end of class
