package ch07;

public class Taxi {

	private String taxiCo;
	private int money;

	public Taxi(String taxiCo) {
		this.taxiCo = taxiCo;
	}

	public void take(int money) {
		this.money += money;
	}

	public void showInfo() {
		System.out.println("=====상태창=======");
		System.out.println("택시 소속 회사: " + this.taxiCo);
		System.out.println("수익금: " + this.money);
	}
}
