package ex_club;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	JPanel panel;
	JButton button1, button2, button3, button4;
	
	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("DB기능 선택창");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("클럽 멤버 수 확인");
		button2 = new JButton("클럽 멤버 조회");
		button3 = new JButton("학생 모두 조회");
		button4 = new JButton("학생 데이터 입력");
	}
	
	private void setInitLayout() {
		
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.setBackground(Color.darkGray);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void addEventListener() {
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MemberCountFrame();
				dispose();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ShowMemberFrame();
				dispose();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ShowStudentFrame();
				dispose();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CreateStudentFrame();
				dispose();
				
			}
		});

	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
