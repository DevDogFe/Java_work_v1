package Starcraft2;

/**
 * 
 * @author 김지현
 *
 */
public class Marine {

	private String name;
	private int power;
	private int hp;

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
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

	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}

	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}
	
	public void inBunker() {
		System.out.println(this.name + "이 야비하게 벙커안에 들어갑니다.");
		this.hp += 100;
	}

	public void beAttacked(int power) {
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

	public void showInfo() {
		System.out.println("======상태창======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
	}
}
