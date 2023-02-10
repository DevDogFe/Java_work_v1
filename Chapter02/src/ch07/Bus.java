package ch07;

public class Bus {
	
	private int number;
	private int money;
	final int BUS_FEE = 1_000;
	
	public Bus(int number) {
		this.number = number;
	}
	
	public void take() {
		money += BUS_FEE;
	}

	public void showInfo() {
		System.out.println("=====상태창=======");
		System.out.println("버스 번호: " + this.number);
		System.out.println("수익금: " + this.money);
	}
}
