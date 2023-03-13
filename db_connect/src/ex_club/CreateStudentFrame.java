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


public class CreateStudentFrame extends JFrame{
	
	JPanel panel1, panel2;
	JLabel nameLabel, majorLabel;
	JTextField nameField, majorField;
	
	JButton button1;
	JButton button2;

	public CreateStudentFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("학생 정보 입력하기");
		button2 = new JButton("돌아가기");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setSize(500, 125);
		panel2.setSize(500, 45);
		nameLabel = new JLabel();
		majorLabel = new JLabel();
		nameField = new JTextField(20);
		majorField = new JTextField(30);
	}
	private void setInitLayout() {
		setLayout(null);
		add(panel1);
		add(panel2);
		panel1.setLocation(0, 0);
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		panel1.add(nameLabel);
		panel1.add(majorLabel);
		panel1.add(nameField);
		panel1.add(majorField);
		nameLabel.setSize(50, 20);
		nameLabel.setLocation(30, 30);
		nameLabel.setText("이름");
		majorLabel.setSize(50, 20);
		majorLabel.setLocation(30, 80);
		majorLabel.setText("전공");
		nameField.setSize(150, 21);
		nameField.setLocation(80, 30);
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
				String name = nameField.getText();
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
		new CreateStudentFrame();
	}
}
