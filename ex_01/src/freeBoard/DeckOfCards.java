package freeBoard;

public class DeckOfCards {

	int id;
	Card[] cards;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public DeckOfCards(int id) {
		this.id = id;
		this.cards = new Card[52];
		String[] suits = { "♠", "◇", "♡", "♣" };
		String[] grade = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int k = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < grade.length; j++) {
				this.cards[k] = new Card(suits[i], grade[j], j + 1);
				if (j == 0) {
					this.cards[k].setValue(11);
				} else if (j > 9) {
					this.cards[k].setValue(10);
				}
				k++;
			}
		}
	}

}
