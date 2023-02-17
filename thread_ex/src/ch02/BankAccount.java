package ch02;

// sharedResource상황 구현
public class BankAccount {

	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 입출금기능
	// synchronized <- 동기화 처리
	public synchronized void saveMoney(int money) {
		
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액: " + getMoney());
	}
	
	public int withdraw(int money) {
		// 10만원 상태
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금후 계좌 잔액: " + getMoney());
				return money;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			return 0;
		}
	}

} // end of BankAccount

class Father extends Thread{

	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.saveMoney(10_000);
	}

} // end of Father

class Mother extends Thread{

	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdraw(5_000);
	}

} // end of Mother