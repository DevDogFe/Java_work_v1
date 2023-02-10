package ch04;

import java.util.Scanner;

public class GameTest {

	// 메인 함수
	public static void main(String[] args) {

		Warrior war1 = new Warrior("가렌");
		Wizard wiz1 = new Wizard("럭스");
		Scanner sc = new Scanner(System.in);

		System.out.println("전투를 시작합니다!" + war1.name + " vs " + wiz1.name);
		war1.warriorInfo();
		wiz1.wizInfo();

		while (war1.hp > 0 && wiz1.hp > 0) {
			System.out.println(war1.name + "의 턴. 행동을 선택해주세요.");
			System.out.println("1-레벨업 2-일반공격 3-배쉬 4-HP회복 5-MP회복");
			int behavior = sc.nextInt();
			if (behavior == 1) {
				war1.lvUp();
			} else if (behavior == 2) {
				war1.attack(wiz1);
			} else if (behavior == 3) {
				war1.bash(wiz1);
			} else if (behavior == 4) {
				war1.hpPlus();
			} else if (behavior == 5) {
				war1.mpPlus();
			} else {
				System.out.println("값을 잘못입력하여 턴이 넘어갑니다.");
			}
			System.out.println(wiz1.name + "의 턴. 행동을 선택해주세요.");
			System.out.println("1-레벨업 2-파이어볼 3-워터볼 4-HP회복 5-MP회복");
			behavior = sc.nextInt();
			if (wiz1.hp > 0) {
				if (behavior == 1) {
					wiz1.lvUp();
				} else if (behavior == 2) {
					wiz1.fireBall(war1);
				} else if (behavior == 3) {
					wiz1.waterBall(war1);
				} else if (behavior == 4) {
					wiz1.hpPlus();
				} else if (behavior == 5) {
					wiz1.mpPlus();
				} else {
					System.out.println("값을 잘못입력하여 턴이 넘어갑니다.");
				}
			}
		}

	} // end of main

} // end of class
