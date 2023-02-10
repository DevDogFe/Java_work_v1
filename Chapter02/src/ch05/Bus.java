package ch05;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.passengerCount++;
		this.money += money;
	}
	
	public void takeOff() {
		
	}
	
	public void showInfo() {
		System.out.println("버스 번호: " + this.busNumber);
		System.out.println("승객 수: " + this.passengerCount);
		System.out.println("수익금: " + this.money);
	}
	
}
