package ch01;

import javax.swing.JFrame;

public class RunableTest1 {

	// 만약 코드가 JFrame을 상속받았다면 자바는 단일상속을 지원하기 때문에 다중상속 불가.
	// 그래서 인터페이스인 Runnable 구현방법을 알아야 한다.
	
	// main thread
	public static void main(String[] args) {

		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
		// subWorker.start(); <-- thread를 상속받지 않아 start 메서드가 없다.
		// start(); thread가 가지고 있다.
		Thread thread1 = new Thread(subWorker); // Thread를 생성할 때 Runnable타입을 넣을 수 있다.
		// 시작 시점: 이벤트 받는 시점 or 연산 후
		thread1.start();
		System.out.println("main thread 종료");

	} // end of main

} // end of class



class SubWorker extends JFrame implements Runnable{

	// 나중에 쓰레드가 동작해야하는 부분을 run 안에서 작성함
	@Override
	public void run() {
		for(int i = 0; i < 200; i++) {
			System.out.print("i: " + i + "\n");
		}
		
	}
	
	
}