package freeBoard;

public class Calculator {

	private Card[] cards = new Card[52];
	private boolean isBust = false;

	public int calculate(Card[] cards) {

		int sum = 0;
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				sum += cards[i].getValue();
			} else {
				break;
			}
		} // 벨류 합용 for
		if (sum > 21) {
			for (int i = 0; i < cards.length; i++) {
				if (cards[i] != null) {
					if (cards[i].getValue() == 11) {
						cards[i].setValue(1);
						sum -= 10;
						break;
					} 
				}
			}
		} 
		return sum;
	} // calculate() 끝

}
