package freeBoard;

public abstract class Player {

	Card[] cards;

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
		int sum = 0;
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				sum += cards[i].getValue();
			} else {
				break;
			}
		}
		
		if(sum < 22) {
		System.out.println("합계: " + sum);
		} else {
			for(int i = 0; i < cards.length; i++) {
				if (cards[i] != null) {
					if(cards[i].getValue() == 11) {
						cards[i].setValue(1);
						System.out.println("합계: " + (sum - 10));
					}else {
						System.out.println("합계: " + sum + "(버스트!)");
					}
				} 
			}
		}
		

	}

}
