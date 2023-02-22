package freeBoard;

import java.util.Random;
import java.util.Scanner;

public class BlackJackMain {

	// main
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		DeckOfCards deckOfCards = new DeckOfCards(1);
		Dealer dealer = new Dealer();
		User user = new User();
		Card[] cards = new Card[52];
		boolean[] dealing = new boolean[52];
		final int HIT = 1;
		final int DOUBLE_DOWN = 2;
		final int STAY = 3;
		final int END = 0;
		int r;
		int w = 0;
		int k = 0;
		int userChoice;
		int dealerSum = 0;
		boolean flag = true;

		// shuffle 시작
		for (int i = 0; i < dealing.length; i++) {
			dealing[i] = false;
		}
		while (w < 52) {
			r = random.nextInt(52);
			if (dealing[r] == false) {
				dealing[r] = true;
				cards[w] = deckOfCards.cards[r];
				w++;
			}
		} // shuffle 끝

		while (flag) {
			System.out.println("게임을 시작합니다.");
			// 첫번째 턴
			k = dealer.hit(cards, k);
			k = dealer.hit(cards, k);
			k = user.hit(cards, k);
			k = user.hit(cards, k);
			System.out.println("++딜러카드++");
			dealer.cards[0].showInfo();
			System.out.println();
			user.showinfo();
			while (flag) {
				System.out.println("행동을 선택해주세요.");
				System.out.println("1.Hit 2.DoubleDown 3.Stay(Stand)");
				userChoice = scanner.nextInt();
				if(userChoice == HIT) {
					k = user.hit(cards, k);
					if(user.calculate() > 21) {
						System.out.println("버스트 되었습니다. (유저 점수: " + user.calculate() + ")");
						flag = false;
					}
					user.showinfo();
				} else if(userChoice == DOUBLE_DOWN) {
					k = user.hit(cards, k);
					flag = false;
				} else if(userChoice == STAY) {
					flag = false;
				} else {
					System.out.println("잘못입력하였습니다.");
				}
			}// end of inner while
			user.showinfo();
			System.out.println("유저 점수: " + user.calculate());
			if(user.calculate() > 21) {
				System.out.println("유저 점수가 21점을 초과하여 버스트되었습니다.");
			} else if(user.calculate() == 21) {
				System.out.println(">>BLACK JACK!! Congratulation!<<");
			}
			
			
			
			flag = true;
			flag = false;

		} // end of outer while

	}// end of main

	// 섞였나 확인
	static void checkDeal(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			cards[i].showInfo();
		}
	}

}// end of class
