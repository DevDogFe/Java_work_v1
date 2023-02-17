package ch01;

public class ThreadTest3 {

	// main thread
	public static void main(String[] args) {
		System.out.println("----------main 쓰레드 시작-----------");

		// 아래에서 만든 쓰레드 사용
		// 현재 쓰레드가 무엇인지 알아보는 명령어
		System.out.println(Thread.currentThread()); // Thread[main,5,main]: [이름,우선순위,그룹]
		// 작업자 하나 만들어내기(메인 쓰레드가 일함)
		Worker worker1 = new Worker("워커1");
		// 일 시작하는 메소드 -> start();
		worker1.start();
		// worker1.run();

//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 쓰레드(작업자) 하나 더 생성
		Worker worker2 = new Worker("워커2");
		worker2.start();

		System.out.println("----------main 쓰레드 종료-----------");

	} // end of main

} // end of class

