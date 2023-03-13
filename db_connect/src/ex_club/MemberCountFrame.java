package ex_club;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MemberCountFrame extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	JLabel label;
	JTextField textField;
	JButton button1;
	JButton button2;

	public MemberCountFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField("100", 20);
		button1 = new JButton("멤버 수 확인");
		button2 = new JButton("돌아가기");
		panel1 = new JPanel();
		panel1.setSize(500, 40);
		panel2 = new JPanel();
		panel2.setSize(500, 110);
		label = new JLabel();
	}
	private void setInitLayout() {
		setLayout(null);
		add(panel1);
		panel1.setLocation(0, 0);
		panel1.setBackground(Color.gray);
		add(panel2);
		panel2.setLocation(0, 40);
		panel2.setBackground(Color.lightGray);
		panel1.add(textField);
		panel1.add(button1);
		panel1.add(button2);
		panel2.add(label);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void addEventListener() {
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String clubName = textField.getText();
				int memberCount = new ClubDAO().countMember(clubName);
				label.setText(clubName + "에 가입된 멤버 수는 " + memberCount +"명 입니다.");
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				dispose();
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
	}
	
	public static void main(String[] args) {
		new MemberCountFrame();
	}
}
