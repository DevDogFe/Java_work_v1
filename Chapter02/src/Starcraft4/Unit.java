package Starcraft4;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

//	public void attack(Zealot zealot) {
//		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
//		zealot.beAttacked(this.power);
//	}
//
//	public void attack(Zergling zergling) {
//		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
//		zergling.beAttacked(this.power);
//	}
//
//	public void attack(Marine marine) {
//		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
//		marine.beAttacked(this.power);
//	}
	
	public void showInfo() {
		System.out.println("======상태창======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
	}
	
	
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
		unit.beAttacked(this.power);
	}

	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			return; // 값을 반환할 때 사용 or 실행의 종료
		}
		System.out.println(this.name + "이 공격당합니다.");
		this.hp -= power;
	}
}
