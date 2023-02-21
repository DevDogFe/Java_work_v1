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
		return 0;
	} // calculate() 끝
	
}
