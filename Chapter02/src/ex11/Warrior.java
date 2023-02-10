package ex11;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		// 부모 클래스에 사용자 정의 생성자가 있다면
		// 부모 생성자를 반드시 호출하여야 한다.
		super(name, hp); // 부모 생성자 호출
		System.out.println("전사 클래스 생성");
	}

	public void comboAttack() {
		System.out.println(name + "이(가) 2단공격을 합니다.");
	}

	// 테스트 코드
	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.comboAttack();
		
		//메서드 오버로딩
		//system.out.println이다.
	}

}
