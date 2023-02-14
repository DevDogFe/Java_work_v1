package Starcraft4;

public class Zealot extends Unit implements Protoss{

	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	// getter 메서드 만들기

	
	@Override
	public void shieldFill() {
		System.out.println("질럿이 실드를 채웁니다.");
	}

	// 질럿이 저글링을 공격합니다.
	// 질럿이 마린을 공격합니다.
	// 자기 자신이 공격을 당합니다.
}
