package ex10;

//다른 패키지의 .java파일이라면 import해야 사용 가능.
import ch06.Bank;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bankA = new Bank();
		// bankA.balance <- 접근 불가 why: 다른 패키지에서 default 접근 제어 불가
		bankA.name = "홍길동";
		// name 접근 제어 지시자는 public이기 때문에
		// 같은 프로젝트 안이라면 어디서든지 접근 가능하다.

	}// end of main

}// end of class
