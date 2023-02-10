package ch07;

public class StudentMainTest {

	// 메인 함수
	public static void main(String[] args) {

		Student student1 = new Student("James", 5_000);
		Student student2 = new Student("Tomas", 10_000);
		Bus bus100 = new Bus(100);
		Subway subway1 = new Subway(1);

		student1.takeBus(bus100);
		student2.takeSubway(subway1);

		student1.showInfo();
		student2.showInfo();
		bus100.showInfo();
		subway1.showInfo();

		Student student3 = new Student("Edward", 20_000);
		Taxi taxi1 = new Taxi("카카오택시");
		student3.takeTaxi(taxi1, 10_000);

		student3.showInfo();
		taxi1.showInfo();

	} // end of main

} // end of class
