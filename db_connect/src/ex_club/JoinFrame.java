package ex_club;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JoinFrame extends JFrame{
	
	JPanel panel1, panel2;
	JLabel studentLabel, clubLabel;
	JTextField studentField, majorField;
	
	JButton button1;
	JButton button2;

	public JoinFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("클럽 가입하기");
		button2 = new JButton("돌아가기");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setSize(500, 125);
		panel2.setSize(500, 45);
		studentLabel = new JLabel();
		clubLabel = new JLabel();
		studentField = new JTextField(20);
		majorField = new JTextField(30);
	}
	private void setInitLayout() {
		setLayout(null);
		add(panel1);
		add(panel2);
		panel1.setLocation(0, 0);
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		panel1.add(studentLabel);
		panel1.add(clubLabel);
		panel1.add(studentField);
		panel1.add(majorField);
		studentLabel.setSize(50, 20);
		studentLabel.setLocation(30, 30);
		studentLabel.setText("이름");
		clubLabel.setSize(50, 20);
		clubLabel.setLocation(30, 80);
		clubLabel.setText("전공");
		studentField.setSize(150, 21);
		studentField.setLocation(80, 30);
		majorField.setSize(200, 21);
		majorField.setLocation(80, 80);
		panel2.setLocation(0, 125);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.add(button1);
		panel2.add(button2);
		button1.setLocation(EXIT_ON_CLOSE, ABORT);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void addEventListener() {
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = studentField.getText();
				String major = majorField.getText();
				new StudentDAO().create(new StudentDTO(0, name, major));
				
				
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
		new JoinFrame();
	}
}
