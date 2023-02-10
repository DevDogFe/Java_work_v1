package ch10;

public class Hero {

	private String name;
	private int hp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;

	}

	public void attack() {

	}
} // end of Hero class

class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {

	}
}// end of Warrior

class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {

	}
}// end of Archer

class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {

	}
}
