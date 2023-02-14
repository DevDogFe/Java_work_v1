package freeBoard;

public class Card {

	String suit;
	String grade;
	int value;

	public Card(String suit, String grade) {
		this.suit = suit;
		this.grade = grade;
	}

	public Card(String suit, String grade, int value) {
		this.suit = suit;
		this.grade = grade;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void showInfo() {
		System.out.print(suit + " " + grade + "  ");
	}

}
