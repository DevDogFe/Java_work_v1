package freeBoard;

import java.util.Random;
import java.util.Scanner;

public class BlackJackMain {

	// main
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		DeckOfCards deckOfCards = new DeckOfCards(1);
		Card[] cards = new Card[52];
		boolean[] dealing = new boolean[52];
		int r;
		int w = 0;
		boolean flag = true;

		for (int i = 0; i < dealing.length; i++) {
			dealing[i] = false;
		}

		while (w < 52) {
			r = random.nextInt(52);
			if (dealing[r] == false) {
				dealing[r] = true;
				cards[w] = deckOfCards.cards[r];
				w++;
				;
			}
		} // shuffle

		for (int i = 0; i < cards.length; i++) {
			cards[i].showInfo();
		}

	}// end of main
	
	

}// end of class
