package Starcraft2;

public class Zealot {

	private String name;
	private int power;
	private int hp;
	private int shield;

	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
		this.shield = 80;

	}

	// getter 메서드 만들기

	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}

	public int getShield() {
		return this.shield;
	}

	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);
	}

	public void chargeShield() {
		System.out.println(this.name + "이 실드 배터리로 실드를 충전합니다.");
	}

	public void beAttacked(int power) {
		if (shield > 0) {
			System.out.println(this.name + "이 공격당합니다.");
			this.shield -= power;
		} else {
			if (this.hp <= 0) {
				System.out.println("이미 사망한 적은 공격할 수 없습니다.");
				return;
			}
			System.out.println(this.name + "이 공격당합니다.");
			this.hp -= power;
			if (this.hp <= 0) {
				System.out.println(this.name + "이 사망하였습니다.");
				this.hp = 0;
				this.showInfo();
			}
		}
	}

	public void showInfo() {
		System.out.println("======상태창======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
		System.out.println("실드량: " + this.shield);
	}

	// 질럿이 저글링을 공격합니다.
	// 질럿이 마린을 공격합니다.
	// 자기 자신이 공격을 당합니다.
}
