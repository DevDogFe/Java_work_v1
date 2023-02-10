package ch01;

public class Bus {

	//속성
	int busId;
	int busMaxPeople;
	String busDriverName;
	
	//메서드
	public void goToNextStop () {
		System.out.println(busId + "번 버스가 다음역으로 출발합니다.");
	}
	
	public void checkDriverName () {
		System.out.println(busId + "번 버스의 기사이름은 " + busDriverName + "입니다.");
	}
	
	public void checkMaxPeople () {
		System.out.println(busId + "번 버스는 최대 " + busMaxPeople + "명 태울 수 있습니다.");
	}
}
