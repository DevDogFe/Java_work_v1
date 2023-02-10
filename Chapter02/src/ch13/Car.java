package ch13;

public abstract class Car {

	protected abstract void drive();

	protected abstract void stop();

	private void startCar() {
		System.out.println("시동을 켭니다");
	}

	private void turnOff() {
		System.out.println("시동을 끕니다");
	}

	public abstract void wiper();
	// 후크 메서드
	public void washCar() {
		
	}

	// 실행의 흐름을 만들어둔다.
	// 재정의(오버라이드)할 수 없게 설계하는 키워드 final
	// 하위클래스에서 오버라이드 불가
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
