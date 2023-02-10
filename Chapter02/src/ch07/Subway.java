package ch07;

public class Subway {

	private int line;
	private int money;
	final int SUBWAY_FEE = 1_200;

	public Subway(int line) {
		this.line = line;
	}

	public void take() {
		money += SUBWAY_FEE;
	}

	public void showInfo() {
		System.out.println("=====상태창=======");
		System.out.println("노선 번호: " + this.line);
		System.out.println("소지금: " + this.money);
	}

}
