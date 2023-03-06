package soket_practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ServerMessengerFrame extends JFrame {

	private JPanel writePanel; // 메세지 적는 곳
	private JPanel screenPanel; // 메세지 뜨는 곳
	final int MSG_AMOUNT = 10;
	private JLabel[] yourMsg = new JLabel[MSG_AMOUNT]; // 상대 메세지
	private JLabel[] myMsg = new JLabel[MSG_AMOUNT]; // 상대 메세지
	private JTextField textField;
	private JButton button;

	private String clientMsg;

	private ServerSocket serverSocket;
	private Socket socket;

	private BufferedReader socketReader = null; // 소켓용 리더
	private BufferedWriter writer = null; // 소켓 송출

	public ServerMessengerFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Server");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField("", 20);
		button = new JButton("보내기");
		screenPanel = new JPanel();
		writePanel = new JPanel();
		screenPanel.setSize(400, 310);
		writePanel.setSize(400, 50);
		for (int i = 0; i < yourMsg.length; i++) {
			yourMsg[i] = new JLabel();
		}
		for (int i = 0; i < myMsg.length; i++) {
			myMsg[i] = new JLabel();
		}
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("--클라이언트 연결 완료--");

			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			new Thread(new ReadThreadS()).start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void setInitLayout() {
		setLayout(null);
		screenPanel.setLayout(null);
		writePanel.setLocation(0, 310);
		writePanel.setBackground(Color.gray);
		screenPanel.setLocation(0, 0);
		screenPanel.setBackground(Color.lightGray);
		add(screenPanel);
		add(writePanel);
		writePanel.add(textField);
		writePanel.add(button);
		for (int i = 0; i < yourMsg.length; i++) {
			screenPanel.add(yourMsg[i]);
			yourMsg[i].setSize(170, 15);
			yourMsg[i].setLocation(25, 290 - (i * 30));
			yourMsg[i].setText(null);

		}
		for (int i = 0; i < myMsg.length; i++) {
			screenPanel.add(myMsg[i]);
			myMsg[i].setSize(170, 15);
			myMsg[i].setLocation(225, 290 - (i * 30));
			myMsg[i].setText(null);

		}
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = textField.getText();
				try {
					writer.write(msg + "\n");
					writer.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				textField.setText(null);
				for (int i = 0; i < MSG_AMOUNT - 1; i++) {
					yourMsg[MSG_AMOUNT - i - 1].setText(yourMsg[MSG_AMOUNT - i - 2].getText());
				}

				for (int i = 0; i < MSG_AMOUNT - 1; i++) {
					myMsg[MSG_AMOUNT - i - 1].setText(myMsg[MSG_AMOUNT - i - 2].getText());
				}
				yourMsg[0].setText(null);
				myMsg[0].setText(msg);
				repaint();

			}
		});

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (textField.getText() != null) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						String msg = textField.getText();
						try {
							writer.write(msg + "\n");
							writer.flush();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						textField.setText(null);
						for (int i = 0; i < MSG_AMOUNT - 1; i++) {
							yourMsg[MSG_AMOUNT - i - 1].setText(yourMsg[MSG_AMOUNT - i - 2].getText());
						}

						for (int i = 0; i < MSG_AMOUNT - 1; i++) {
							myMsg[MSG_AMOUNT - i - 1].setText(myMsg[MSG_AMOUNT - i - 2].getText());
						}
						yourMsg[0].setText(null);
						myMsg[0].setText(msg);
						repaint();
					}
				}
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	public static void main(String[] args) {
		new ServerMessengerFrame();
	}

	class ReadThreadS implements Runnable {

		public ReadThreadS() {
		}

		@Override
		public void run() {
			while (socket.isConnected()) {
				try {
					clientMsg = socketReader.readLine();
				} catch (IOException e1) {
					yourMsg[0].setText("상대방이 채팅을 나갔습니다.");
				}
				for (int i = 0; i < MSG_AMOUNT - 1; i++) {
					yourMsg[MSG_AMOUNT - i - 1].setText(yourMsg[MSG_AMOUNT - i - 2].getText());
				}

				for (int i = 0; i < MSG_AMOUNT - 1; i++) {
					myMsg[MSG_AMOUNT - i - 1].setText(myMsg[MSG_AMOUNT - i - 2].getText());
				}
				yourMsg[0].setText(clientMsg);
				myMsg[0].setText(null);
				repaint();
			}
		}
	} // end of inner class

} // end of class
