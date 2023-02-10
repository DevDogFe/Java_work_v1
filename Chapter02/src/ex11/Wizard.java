package ex11;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println(name + "이(가) 얼리기 시전합니다.");
	}

}
