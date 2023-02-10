package ch04;

// 마법사 클래스 설계
public class Wizard {

	String name;
	int level;
	int hp;
	int mp;
	int firePower;
	int waterPower;
	int armor;

	public Wizard(String name) {
		this.name = name;
		this.level = 1;
		this.hp = 80;
		this.mp = 100;
		this.firePower = 30;
		this.waterPower = 20;
	}

	public void wizInfo() {
		System.out.println("=========상태창 (" + this.name + ")=========");
		System.out.println("레벨: " + this.level);
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("불속성 공격력: " + this.firePower);
		System.out.println("물속성 공격력: " + this.waterPower);
		System.out.println("=================================");
	}

	public void lvUp() {
		this.level++;
		this.hp += 20;
		this.mp += 10;
		this.firePower += 6;
		this.waterPower += 4;
		
		System.out.println("레벨이 올랐습니다.");
		this.wizInfo();
	}

	public void fireBall(Warrior targetWarrior) {
		if (mp < 15) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println(this.name + "이(가) 적에게 파이어볼을 사용합니다.");
			System.out.println(this.name + "이(가)" + targetWarrior + "에게 데미지를 " + this.firePower + "입혔습니다.");
			this.mp -= 15;
			targetWarrior.attacked(this.firePower);
		}
		if (this.mp == 0) {
			System.out.println("MP가 0입니다.");
		}

	}
	
	public void fireBall(Wizard targetWizard) {
		if (mp < 15) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println(this.name + "이(가) 적에게 파이어볼을 사용합니다.");
			System.out.println(this.name + "이(가)" + targetWizard + "에게 데미지를 " + this.firePower + "입혔습니다.");
			this.mp -= 15;
			targetWizard.attacked(this.firePower);
		}
		if (this.mp == 0) {
			System.out.println("MP가 0입니다.");
		}
		
	}

	public void waterBall(Warrior targetWarrior) {
		if (mp < 10) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println(this.name + "이(가) 적에게 워터볼을 사용합니다.");
			System.out.println(this.name + "이(가)" + targetWarrior + "에게 데미지를 " + this.waterPower + "입혔습니다.");
			this.mp -= 10;
			targetWarrior.attacked(this.waterPower);
		}
		if (this.mp == 0) {
			System.out.println("MP가 0입니다.");
		}

	}

	public void waterBall(Wizard targetWizard) {
		if (mp < 10) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println(this.name + "이(가) 적에게 워터볼을 사용합니다.");
			System.out.println(this.name + "이(가)" + targetWizard + "에게 데미지를 " + this.waterPower + "입혔습니다.");
			this.mp -= 10;
			targetWizard.attacked(this.waterPower);
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
			this.wizInfo();
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
} // end of class
