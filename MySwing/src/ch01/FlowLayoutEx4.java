package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// Frame 기능 사용하려면 어떤클래스 상속?
public class FlowLayoutEx4 extends JFrame {

	private JButton[] buttons = new JButton[5];

	// 생성자는 메모리에 올라갈 때 처음 실행되는 코드
	// 구현부 안에서 순서도 중요
	public FlowLayoutEx4() {
		init();
		setInintLayout();
	}

	private void init() {
		setTitle("배열활용");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
	}

	private void setInintLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for (int i = 0; i < buttons.length; i++) {
			//방어적 코드 작성 염두
			add(buttons[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx4();
	}

} // end of class
