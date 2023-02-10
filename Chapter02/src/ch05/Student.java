package ch05;

public class Student {

	String name;
	int money;
	final int BUS_FEE = 1_000;
	final int SUBWAY_FEE = 1_200;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 학생이 버스를 탄다
	public void takeBus(Bus targetBus) {
		System.out.println("takeBus 메서드 실행 됨");
		
		targetBus.take(BUS_FEE);
		this.money -= BUS_FEE;
	}

	// 학생이 지하철을 탄다
	public void takeSubway(Subway targetSubway) {
		System.out.println("takeSubway메서드 실행");
		targetSubway.take(SUBWAY_FEE);
		this.money -= SUBWAY_FEE;
	}
	

	// 상태창
	public void showInfo() {
		System.out.println("학생의 이름: " + this.name);
		System.out.println("학생의 소지금: " + this.money);
		System.out.println("=================================");
	}

}
