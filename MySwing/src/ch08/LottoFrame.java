package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {

	int[] lotto = new int[6];
	JButton button;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(630, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		button = new JButton("추첨 시작");
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임시작");
		lotto = getLottoNumber();
		
		// 여기에 코드 입력
		// 그림을 다시 그리다
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// g.setColor(Color.black);
		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);
		if (lotto[0] == 0) {
			g.drawString("추첨 버튼을 클릭하세요", 180, 200);
			// 게임 초기 상태
			return;
		}
		// 코드가 여기 내려오면 버튼을 누른 상태라는 의미
		// 그러면 메서드와 멤버 변수를 활용해서 그림을 그릴 수 있다.
		// 추천하지 않는 코드
		for(int i = 0, x = 50; i < lotto.length; i++, x += 100) {
			// g.drawString(lotto[i] + "", 50 + (i * 100) , 200);
			g.drawString(lotto[i] + "", x , 200);
		}
	}

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			// System.out.println(j);
			// 중복값 확인을 위해 다시 반복문 생성
			for (int e = 0; e < i; e++) {
				// 조건
				if (lotto[i] == lotto[e]) {
					// 중복 발생
					i = i - 1;
					break;
				}
			}
		} // end of for
		Arrays.sort(lotto); // 배열 오름차순 정렬
		return lotto;
	}

	// 코드 테스트
	public static void main(String[] args) {
		LottoFrame a = new LottoFrame();

	}

}
