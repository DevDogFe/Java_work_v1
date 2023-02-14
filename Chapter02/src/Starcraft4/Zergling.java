package Starcraft4;

public class Zergling extends Unit implements Zerg{

	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	@Override
	public void burrow() {
		System.out.println("저글링이 땅속으로 몸을 숨깁니다.");
	}
}
