package ch01;

public class ThreadTest1 {

	// main thread
	public static void main(String[] args) {
		// 작업의 단위 쓰레드 동작
		for(int i = 0; i < 30; i++) {
			// System.out.print("i: " + i + "\t");
			System.out.print("- ");
			
			try {
				// 클래스이름으로 메서드호출: static 메서드
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main

} //end of class
