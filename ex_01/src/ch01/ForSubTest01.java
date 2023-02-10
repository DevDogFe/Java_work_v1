package ch01;

public class ForSubTest01 {

	// main thread
	public static void main(String[] args) {

		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int k = 0; k < (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==============================");
		
		for (int i = 0; i < num; i++) {
			for (int k = num; k > (num - i); k--) {
				System.out.print(" ");
			}
			for (int j = num * 2 - 1; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==============================");
		
		for (int i = 0; i < num; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (-2 * i) + (2 * num - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==============================");
		
		
		

	}// end of main

}// end of class
