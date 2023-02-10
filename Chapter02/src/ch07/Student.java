package ch07;

public class Student {

	private String name;
	private int money;
	final int BUS_FEE = 1_000;
	final int SUBWAY_FEE = 1_200;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		this.money -= BUS_FEE;
		bus.take();
	}

	public void takeSubway(Subway subway) {
		this.money -= SUBWAY_FEE;
		subway.take();
	}
	
	public void takeTaxi(Taxi taxi, int money) {
		this.money -= money;
		taxi.take(money);
	}

	public void showInfo() {
		System.out.println("=====상태창=======");
		System.out.println("이름: " + this.name);
		System.out.println("소지금: " + this.money);
	}

}
