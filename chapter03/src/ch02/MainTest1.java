package ch02;

public class MainTest1 {

	// 메인 함수
	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyCar toyCar = new ToyCar();

		// 다형성
		RemoteController controller1 = television;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = robot;
		RemoteController controller4 = toyCar;

		// 다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = toyCar;

		// 문제1 for문활용 전원을 전부다 켜기

		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn();
		}

		// 문제2 index값이 3번째 자신의 타입 화면에 출력
		for (int i = 0; i < remoteControllers.length; i++) {
			if(i == 3) {
				System.out.println("3 인덱스값의 타입은 ToyCar");
			}
		}

		// 문제3 만약 데이터 toyRobot이면 멤버변수 name 값 출력
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				System.out.println(((ToyRobot)remoteControllers[i]).name);
			}
		}
		
		// 문제4 장난감 로봇의 소리 기능을 추가
		//       냉장고에도 소리 나는 기능 추가
		//   소리 기능 인터페이스로 설계
		((Refrigerator)remoteControllers[1]).sound();
		((ToyRobot)remoteControllers[2]).sound();
		

	}// end of main

}// end of class
