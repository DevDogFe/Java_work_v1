package ch02;

public interface RemoteController {
	
	// 모든 변수 --> public static final
	// 모든 메서드 --> 추상메서드
	
	// 인터페이스란?
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도

	// 특성
	// 멤버변수, 일반 구현 메서드를 가질 수 없다.
	// 추상클래스보다 추상화가 더 높다.
	
	public static final int SERIAL_NUMBER = 100;
	
	public abstract void turnOn();
//	public abstract void turnOff();
	// abstract 생략 가능
	void turnOff();
	
	
}
