package freeBoard;

public abstract class Player {

	Card[] cards;
	Calculator calculator;
	int sum;

	public Player() {

		cards = new Card[52];

	}

	public int hit(Card[] cards, int k) {

		for (int i = 0; i < this.cards.length; i++) {
			if (this.cards[i] == null) {
				this.cards[i] = cards[k];
				k++;
				return k;
			}
		}
		return 0;
	}

	public void showinfo() {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				cards[i].showInfo();
			} 
		}
		System.out.println("");
	}
	
	public int calculate() {
		int sum = new Calculator().calculate(cards);
		return sum;
	}

}
