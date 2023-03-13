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


public class ShowMemberFrame extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	JLabel[] labels = new JLabel[20];
	
	JTextField textField;
	JButton button1;
	JButton button2;

	public ShowMemberFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField("100", 20);
		button1 = new JButton("멤버 리스트 확인");
		button2 = new JButton("돌아가기");
		panel1 = new JPanel();
		panel1.setSize(500, 40);
		panel2 = new JPanel();
		panel2.setSize(500, 460);
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
	}
	private void setInitLayout() {
		setLayout(null);
		add(panel1);
		panel1.setLocation(0, 0);
		panel1.setBackground(Color.gray);
		add(panel2);
		panel2.setLocation(0, 40);
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		panel1.add(textField);
		panel1.add(button1);
		panel1.add(button2);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void addEventListener() {
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String clubName = textField.getText();
				ArrayList<StudentDTO> list = new ClubDAO().showMemberList(clubName);
				for (int i = 0; i < labels.length; i++) {
					panel2.add(labels[i]);
					labels[i].setText(null);
					labels[i].setSize(400, 20);
					labels[i].setLocation(50, 10 + i * 20);
				}
				for (int i = 0; i < list.size(); i++) {
					if(i > 20) {
						break;
					}
					panel2.add(labels[i]);
					labels[i].setText(list.get(i).getStudentId() +". "+ list.get(i).getStudentName() + " " + list.get(i).getMajor());
					labels[i].setSize(400, 20);
					labels[i].setLocation(50, 10 + i * 20);
				}
				
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
		new ShowMemberFrame();
	}
}
