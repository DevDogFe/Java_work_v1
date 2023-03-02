package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인쓰레드 => 화면에 그림 그리기 and 키보드 이벤트 리스너 받기
// 백그라운드에서 계속 player의 움직임 관찰하는 클래스
public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;

	private int JUMPCOUNT = 0;
	private int FIRST = 0; // 바닥 도착 여부
	private int BOTTOMCOLOR = -1;
	private int JUMP_COUNT = 0;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스 이미지 경로 및 파일명 확인");
		}
	}

	@Override
	public void run() {
		// 색상 확인
		// 왼쪽이나 오른쪽으로 갈 때는 좌표지점을 보정해야한다.
		while (enemy.getState() == 0) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 때도 기준 좌표 지점을 보정해야 한다.

			// 기준 왼쪽, // 기준 오른쪽
			Color leftColor = new Color(image.getRGB(enemy.getX() + 10, enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 60, enemy.getY() + 25));
			int bottomColorLeft = image.getRGB(enemy.getX() + 15, enemy.getY() + 55);
			int bottomColorRight = image.getRGB(enemy.getX() + 45, enemy.getY() + 55);
			System.out.println(bottomColorLeft);
			System.out.println(bottomColorRight);
			if (bottomColorLeft + bottomColorRight != -2) {
				enemy.setDown(true);
			} else {
				enemy.setDown(false);
			}

			// 외벽 충돌 확인
			// 꼭대기 도착

			// 오른쪽 구석

			// 왼쪽 구석

		} // end of while

	}
}
