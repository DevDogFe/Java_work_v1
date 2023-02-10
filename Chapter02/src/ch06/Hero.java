package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get(x), set(x) --> is라고 쓰는게 일반적이다.

	public Hero(String name) {
		this.name = name;
		this.hp = 50;
		this.power = 10;
		this.defense = 0.5;
		this.die = false;
	}

	// getter 메서드 직접 만들어보기 5
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getdie() {
		return this.die;
	}

	// setter 메서드 직접 만들어보기 5
	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		if (hp <= 0) {
			System.out.println("HP는 0이하로 설정할 수 없습니다.");
			return;
		}
		this.hp = hp;
	}

	public void setPower(int power) {
		if (power < 0) {
			System.out.println("Power는 0미만으로 설정할 수 없습니다.");
			return;
		}
		this.power = power;
	}

	public void setDefense(int defense) {
		this.hp = defense;
	}

	public void setdie(boolean die) {
		this.die = die;
	}

	// 방어적 코드도 추가해 보기

}
