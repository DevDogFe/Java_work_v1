package freeBoard;

public class DeckOfCards {
	
	int id;
	Card[] cards;
	
	public DeckOfCards(int id) {
		this.id = id;
		cards = new Card[52];
		cards[0] = new Card("♠", "A", 11);
		cards[1] = new Card("♠", "2", 2);
		cards[2] = new Card("♠", "3", 3);
		cards[3] = new Card("♠", "4", 4);
		cards[4] = new Card("♠", "5", 5);
		cards[5] = new Card("♠", "6", 6);
		cards[6] = new Card("♠", "7", 7);
		cards[7] = new Card("♠", "8", 8);
		cards[8] = new Card("♠", "9", 9);
		cards[9] = new Card("♠", "10", 10);
		cards[10] = new Card("♠", "J", 10);
		cards[11] = new Card("♠", "Q", 10);
		cards[12] = new Card("♠", "K", 10);
		cards[13] = new Card("◇", "A", 11);
		cards[14] = new Card("◇", "2", 2);
		cards[15] = new Card("◇", "3", 3);
		cards[16] = new Card("◇", "4", 4);
		cards[17] = new Card("◇", "5", 5);
		cards[18] = new Card("◇", "6", 6);
		cards[19] = new Card("◇", "7", 7);
		cards[20] = new Card("◇", "8", 8);
		cards[21] = new Card("◇", "9", 9);
		cards[22] = new Card("◇", "10", 10);
		cards[23] = new Card("◇", "J", 10);
		cards[24] = new Card("◇", "Q", 10);
		cards[25] = new Card("◇", "K", 10);
		cards[26] = new Card("♡", "A", 11);
		cards[27] = new Card("♡", "2", 2);
		cards[28] = new Card("♡", "3", 3);
		cards[29] = new Card("♡", "4", 4);
		cards[30] = new Card("♡", "5", 5);
		cards[31] = new Card("♡", "6", 6);
		cards[32] = new Card("♡", "7", 7);
		cards[33] = new Card("♡", "8", 8);
		cards[34] = new Card("♡", "9", 9);
		cards[35] = new Card("♡", "10", 10);
		cards[36] = new Card("♡", "J", 10);
		cards[37] = new Card("♡", "Q", 10);
		cards[38] = new Card("♡", "K", 10);
		cards[39] = new Card("♣", "A", 11);
		cards[40] = new Card("♣", "2", 2);
		cards[41] = new Card("♣", "3", 3);
		cards[42] = new Card("♣", "4", 4);
		cards[43] = new Card("♣", "5", 5);
		cards[44] = new Card("♣", "6", 6);
		cards[45] = new Card("♣", "7", 7);
		cards[46] = new Card("♣", "8", 8);
		cards[47] = new Card("♣", "9", 9);
		cards[48] = new Card("♣", "10", 10);
		cards[49] = new Card("♣", "J", 10);
		cards[50] = new Card("♣", "Q", 10);
		cards[51] = new Card("♣", "K", 10);
	}

	

}
