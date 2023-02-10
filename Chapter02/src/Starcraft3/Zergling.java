package Starcraft3;

public class Zergling extends Unit {

	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	public void showInfo() {
		System.out.println("======상태창======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
	}
}
