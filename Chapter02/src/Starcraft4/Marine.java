package Starcraft4;

public class Marine extends Unit implements TerranBionic{

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	
	@Override
	public void healed() {
		System.out.println("마린이 메딕에게 체력을 회복받습니다.");
	}
	
	@Override
	public void inBunker() {
		System.out.println("마린이 벙커안으로 들어갑니다.");
	}
}
