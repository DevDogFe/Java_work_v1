package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		Student studentLee = new Student("이순신", 20_000);
		Bus bus10 = new Bus(10);
		Bus bus20 = new Bus(20);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		final int RETURN = 0;
		final int TAKE_BUS = 1;
		final int TAKE_SUBWAY = 2;
		final int NO_TAKE =3;

		Scanner sc = new Scanner(System.in);

		int whatRide = RETURN;
		while (whatRide != NO_TAKE) {
			System.out.println("버스: 1번, 지하철 2번, 안타려면 3번 입력");
			whatRide = sc.nextInt();
			if (whatRide == TAKE_BUS) {
				System.out.println("타려는 버스 번호 입력 (10, 20)");
				int whatBus = sc.nextInt();
				if (whatBus == 10) {
					studentLee.takeBus(bus10);
					bus10.showInfo();
				} else if (whatBus == 20) {
					studentLee.takeBus(bus20);
					bus20.showInfo();
				}
				whatRide = RETURN;

			} else if (whatRide == TAKE_SUBWAY) {
				System.out.println("타려는 지하철 호선 입력 (1, 2)");
				int whatSubway = sc.nextInt();
				if (whatSubway == 1) {
					studentLee.takeSubway(subway1);
					subway1.showInfo();
				} else if (whatSubway == 2) {
					studentLee.takeSubway(subway2);
					subway2.showInfo();
				}
				whatRide = RETURN;
			}
		}
		studentLee.showInfo();

	} // end of main

} // end of class
