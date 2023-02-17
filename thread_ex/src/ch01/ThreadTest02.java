package ch01;

public class ThreadTest02 {
	
	public static void main(String[] args) {

		System.out.println("---------메인 시작----------");
		Worker2 worker1 = new Worker2(1);
		worker1.start();
		worker1.run();
		System.out.println();
		System.out.println("---------메인 종료----------");
		
	} // end of main

} // end of class

class Worker2 extends Thread {

	private int id;

	public Worker2(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print((id * (i + 1)) + ".. ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}