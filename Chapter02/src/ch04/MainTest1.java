package ch04;

public class MainTest1 {

	// 메인 함수
	public static void main(String[] args) {

		Bus bus = new Bus(100);
		bus.take(1);
		bus.take(2);
		bus.take(3);
		bus.takeOff(1);
		bus.showInfo();
		
		Subway sub1 = new Subway(1);
		sub1.take(2);
		sub1.takeOff(1);
		sub1.takeOff(2);
		sub1.showInfo();

	}// end of main

}// end of class
