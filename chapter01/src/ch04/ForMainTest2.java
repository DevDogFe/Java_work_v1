package ch04;

public class ForMainTest2 {

	// main thread
	public static void main(String[] args) {

		int num = 2;

		// 이중 for문을 활용해서 2 ~ 9단 출력

		for (int j = num; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println("=======================");
		}

		// 별표 피라미드

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		

	}// end of main

}// end of class
