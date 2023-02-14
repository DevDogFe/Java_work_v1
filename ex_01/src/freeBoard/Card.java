package freeBoard;

public class Card {

	String suit;
	String grade;
	int value;
	
	public Card(String suit, String grade, int value) {
		this.suit = suit;
		this.grade = grade;
		this.value = value;
	}
	
	public void showInfo() {
		System.out.println(suit + " " + grade);
	}

	
	
	
	
}
