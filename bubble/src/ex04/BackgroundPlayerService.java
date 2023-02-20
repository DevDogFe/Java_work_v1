package ex04;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인쓰레드 => 화면에 그림 그리기 and 키보드 이벤트 리스너 받기
// 백그라운드에서 계속 player의 움직임 관찰하는 클래스
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
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
		while (true) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 때도 기준 좌표 지점을 보정해야 한다.

			// 기준 왼쪽, // 기준 오른쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 5,
			// player.getY() + 60));
			int bottomColorLeft = image.getRGB(player.getX() + 10, player.getY() + 55);
			int bottomColorRight = image.getRGB(player.getX() + 45, player.getY() + 55);
			// 하얀색이 아니면 바닥이다

			if (bottomColorLeft + bottomColorRight != -2) {
				System.out.println("여기는 바닥");
				player.setDown(false);
			} else {
				if (player.isUp() == false && player.isDown() == false) {
					player.down();
				}
			}

			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				player.setRightWallCrash(true);
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // end of while

	}
}
