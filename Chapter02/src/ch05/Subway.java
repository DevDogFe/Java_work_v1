package ch05;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway (int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 호선: " + this.lineNumber);
		System.out.println("승객 수: " + this.passengerCount);
		System.out.println("수익금: " + this.money);
	}
}// end of class
