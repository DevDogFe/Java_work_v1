package ch08;

public class MainTest2 {

	// main
	public static void main(String[] args) {

		// 예외 처리 구문 10/0연산
		try {
			int number = 10 / 0;

		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		Calculator calculator = new Calculator();
		try {
			calculator.calculate(10, 0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		

	}// end of main

}// end of class

class Calculator {

	public int calculate(int n1, int n2) throws Exception{
		
		return n1 / n2;

	}
}