package ch04;

public class Subway {

	// 상태
	int lineNumber;
	int passengerCount;
	int money;

	// 기능
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int count) {
		this.passengerCount += count;
		this.money += 1_000 * count;
	}
	
	public void takeOff(int count) {
		this.passengerCount -= count;
		if (this.passengerCount < 0) {
			System.out.println("승객은 0명이하로 내려갈 수 없습니다.");
			this.passengerCount = 0;
		}
	}
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("지하철 호선 번호: " + this.lineNumber);
		System.out.println("승객 수: " + this.passengerCount);
		System.out.println("수익금: " + this.money);
	}

} // end of class
