package ch01;

public class Worker extends Thread{
	
	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속 부분
	// start 메서드 통해서 쓰레드에게 일 시작하라고 명령할 수 있다.
	// start 메스드를 통해 쓰레드는 run메서드 안에 있는 부분을 수행시킨다.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker: " + name + " : " + i + this.currentThread());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
