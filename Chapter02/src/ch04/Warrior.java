package ch04;

// 전사 클래스 설계
public class Warrior {

	// 상태
	String name;
	int level;
	int hp;
	int mp;
	int power;
	int armor;
	final double BASH = 1.5;

	public Warrior(String name) {
		this.name = name;
		this.level = 1;
		this.hp = 100;
		this.mp = 10;
		this.power = 20;
	}

	public void warriorInfo() {
		System.out.println("=========상태창 (" + this.name + ")=========");
		System.out.println("레벨: " + this.level);
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("공격력: " + this.power);
		System.out.println("=================================");
	}

	public void lvUp() {
		this.level++;
		this.hp += 20;
		this.mp += 5;
		this.power += 5;
		System.out.println("레벨이 올랐습니다.");
		this.warriorInfo();
	}

	public void attack(Wizard targetWizard) {
		System.out.println(name + "이(가) " + targetWizard + "에게 데미지를 " + this.power + "입혔습니다.");
		targetWizard.attacked(this.power);
	}

	public void attack(Warrior targetWarrior) {
		System.out.println(name + "이(가) " + targetWarrior + "에게 데미지를 " + this.power + "입혔습니다.");
		targetWarrior.attacked(this.power);
	}

	public void bash(Wizard targetWizard) {
		if (mp < 5) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println(name + "이(가) 적에게 배쉬를 사용합니다.");
			System.out.println(name + "이(가) " + targetWizard.name + "에게 데미지를 " + (this.power * BASH) + "입혔습니다.");
			this.mp -= 5;
			targetWizard.attacked((int)(this.power * BASH));
		}
		if (this.mp == 0) {
			System.out.println("MP가 0입니다.");
		}
	}

	public void bash(Warrior targetWarrior) {
		if (mp < 5) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println(name + "이 적에게 배쉬를 사용합니다.");
			System.out.println(name + "이 " + targetWarrior.name + "에게 데미지를 " + (this.power * BASH) + "입혔습니다.");
			this.mp -= 5;
			targetWarrior.attacked((int)(this.power * BASH));
		}
		if (this.mp == 0) {
			System.out.println("MP가 0입니다.");
		}

	}

	public void attacked(int damage) {
		System.out.println(name + "이 적에게 데미지를 " + damage + "입었습니다.");
		this.hp -= damage;
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			this.hp = 0;
			this.warriorInfo();
		}
		System.out.println("남은 HP: " + this.hp);
	}

	public void hpPlus() {
		this.hp += 30;
		System.out.println(this.name + "의 HP가 30 회복되었습니다. 남은 HP: " + this.hp);
	}

	public void mpPlus() {
		this.mp += 20;
		System.out.println(this.name + "의 MP가 20 회복되었습니다. 남은 HP: " + this.hp);
	}

}// end of class
