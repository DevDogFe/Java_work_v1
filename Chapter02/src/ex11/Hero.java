package ex11;

public class Hero {

	// protected: 자식클래스에서 접근 가능한 레벨링
	// 같은 패키지 안에서도 접근 가능
	protected String name;
	protected int hp;

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
		System.out.println("Hero 클래스 생성합니다.");
		this.name = name;
		this.hp = hp;

	}

	protected void attack() {
		System.out.println(name + "이(가) 기본공격합니다.");
	}
}
