package ex11;

import java.util.Random;
import java.util.Scanner;

public class GachaMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		final int COIN = 1;
		final int GAME = 2;
		final int SEE_GOODS = 3;
		final int END = 0;
		int count = 0;
		Goods[] goods = new Goods[11];
		GachaMachine gachaMachine = new GachaMachine("꿈과희망의 가챠머신");
		Goods goods0 = new Doll("바비인형", 30_000, "여자");
		Goods goods1 = new Doll("바비인형", 25_000, "남자");
		Goods goods2 = new Doll("콩순이 인형", 50_000, "여자");
		Goods goods3 = new MiniCar("아반떼", 10_000, "빨간색");
		Goods goods4 = new MiniCar("아반떼N", 15_000, "노란색");
		Goods goods5 = new MiniCar("코나", 12_000, "흰색");
		Goods goods6 = new MiniCar("모닝", 5_000, "베이지색");
		Goods goods7 = new MiniCar("제네시스", 20_000, "검정색");
		Goods goods8 = new Robot("그랑죠", 60_000, false);
		Goods goods9 = new Robot("썬가드", 80_000, true);
		Goods goods10 = new Goods("현금", 500_000);
		goods[0] = goods0;
		goods[1] = goods1;
		goods[2] = goods2;
		goods[3] = goods3;
		goods[4] = goods4;
		goods[5] = goods5;
		goods[6] = goods6;
		goods[7] = goods7;
		goods[8] = goods8;
		goods[9] = goods9;
		goods[10] = goods10;

		// ㅋ

		while (flag) {
			System.out.println("플레이를 선택해주세요.");
			System.out.println("1.코인 충전 2.가위바위보로 상품추첨 3. 상품조회 0.종료");
			int userChoice = sc.nextInt();
			if (userChoice == COIN) {
				coin(count, userChoice, sc);
			} else if (userChoice == GAME) {
				count--;
				System.out.println("1)가위 2)바위 3)보 중 하나를 선택해 입력해주세요.");
				userChoice = sc.nextInt();
				int comChoice = gachaMachine.rNumber();
				if (comChoice == 1) {
					System.out.println("컴퓨터읜 선택: 보");
				} else if (comChoice == 2) {
					System.out.println("컴퓨터의 선택: 가위");
				} else if (comChoice == 3) {
					System.out.println("컴퓨터의 선택: 바위");
				}
				if (userChoice == comChoice) {
					System.out.println("이겼습니다. 상품을 추첨합니다.");
				} else {
					System.out.println("아쉽군요. 다시 한번 도전해 보세요.");
					continue;
				}
				int luckyNum = gachaMachine.goodsNumber();
				if (luckyNum < 50) {
					System.out.println("축하합니다. 미니카가 당첨되었습니다.");
					System.out.println("당첨상품 정보**");
					goods[rNumber(4) + 3].showInfo();

				} else if (luckyNum < 75) {
					System.out.println("축하합니다. 인형이 당첨되었습니다.");
					System.out.println("당첨상품 정보**");
					goods[rNumber(2)].showInfo();
				} else if (luckyNum < 95) {
					System.out.println("축하합니다. 로봇이 당첨되었습니다.");
					System.out.println("당첨상품 정보**");
					goods[rNumber(1) + 8].showInfo();
				} else {
					System.out.println("축하합니다. 현금 50만원에 당첨되었습니다.");
					goods[10].showInfo();
				}
			} else if(userChoice == SEE_GOODS) {
				seeGoods(goods);
			} else if(userChoice == END) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		} // end of while

	}// end of main

	static int rNumber(int num) {
		Random ran = new Random();
		return ran.nextInt(num);
	}
	
	static void coin(int count, int userChoice, Scanner sc) {
		
		System.out.println("현재 잔여 코인: " + count + "개");
		System.out.println("코인을 얼마나 충전하시겠습니까?");
		userChoice = sc.nextInt();
		if (userChoice > 0) {
			System.out.println("코인이 " + userChoice + "개 충전되었습니다.");
			count += userChoice;
			System.out.println("남은 코인: " + count + "개");
		} else {
			System.out.println("수치를 잘못입력하였습니다.");
		}
	}
	
	static void game(int userChoice, Scanner sc, GachaMachine gachaMachine, Goods[] goods) {

		System.out.println("1)가위 2)바위 3)보 중 하나를 선택해 입력해주세요.");
		userChoice = sc.nextInt();
		int comChoice = gachaMachine.rNumber();
		if (comChoice == 1) {
			System.out.println("컴퓨터읜 선택: 보");
		} else if (comChoice == 2) {
			System.out.println("컴퓨터의 선택: 가위");
		} else if (comChoice == 3) {
			System.out.println("컴퓨터의 선택: 바위");
		}
		if (userChoice == comChoice) {
			System.out.println("이겼습니다. 상품을 추첨합니다.");
		} else {
			System.out.println("아쉽군요. 다시 한번 도전해 보세요.");
//			continue;
		}
		int luckyNum = gachaMachine.goodsNumber();
		if (luckyNum < 50) {
			System.out.println("축하합니다. 미니카가 당첨되었습니다.");
			System.out.println("당첨상품 정보**");
			goods[rNumber(4) + 3].showInfo();

		} else if (luckyNum < 75) {
			System.out.println("축하합니다. 인형이 당첨되었습니다.");
			System.out.println("당첨상품 정보**");
			goods[rNumber(2)].showInfo();
		} else if (luckyNum < 95) {
			System.out.println("축하합니다. 로봇이 당첨되었습니다.");
			System.out.println("당첨상품 정보**");
			goods[rNumber(1) + 8].showInfo();
		} else {
			System.out.println("축하합니다. 현금 50만원에 당첨되었습니다.");
			goods[10].showInfo();
		}
	
	}
	
	static void seeGoods (Goods[] goods) {
		for (int i = 0; i < goods.length; i++) {
			if(goods[i] != null) {
				goods[i].showInfo();
			}
		}
	}

}// end of class
