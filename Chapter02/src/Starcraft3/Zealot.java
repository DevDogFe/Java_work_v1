package Starcraft3;

public class Zealot extends Unit {

	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	// getter 메서드 만들기

	public void showInfo() {
		System.out.println("======상태창======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
	}

	// 질럿이 저글링을 공격합니다.
	// 질럿이 마린을 공격합니다.
	// 자기 자신이 공격을 당합니다.
}
