package ch03;

public class ShortCircuitTest {

	// main
	public static void main(String[] args) {

		int num1 = 5;
		int i = 0;

		boolean value = ((num1 += 10) > 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("============================");
		System.out.println(num1);
		System.out.println(i); // Short Circuit

		System.out.println("============================");

		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println("============================");

		// shortCircuit 2문제 직접 만들기

		int a = 1;
		int b = 10;
		int c = 100;

		// F && T 이므로 reult1은 false이고 F가 먼저 나왔으므로 뒤의항은 작동x
		boolean result1 = ((a += a) > b) && ((b += b) < c);
		System.out.println(result1);
		System.out.println(a); // a+a가 작동해서 a=2
		System.out.println(b); // b+b가 작동하지 않아서 b= 10

		// T || F 이므로 result2는 true이고 T가 먼저 나왓으므로 뒤의 항은 작동x
		boolean result2 = ((b += b) < c) || ((a += a) > b);
		System.out.println(result2);
		System.out.println(b); // b+b가 작동하지 않아서 b= 20
		System.out.println(a); // a+a가 작동하지 않아서 a=2 그대로

	}// end of main

}// end of class
