package ch05;

public class MainTest1 {

	// 메인 함수
	public static void main(String[] args) {
		
		Student studentKim = new Student("홍길동", 10_000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		
		
		//버스 타보기
		studentKim.takeBus(bus100);
		
		System.out.println("------------");
		studentKim.showInfo();
		bus100.showInfo();
		// 객체간의 메세지 전달(상호작용)방법
		
		//지하철 타보기
		studentKim.takeSubway(subwayLine2);
		
		studentKim.showInfo();
		subwayLine2.showInfo();
		System.out.println("-----------------");
		subwayLine1.showInfo();
		
	}// end of main

}// end of class
