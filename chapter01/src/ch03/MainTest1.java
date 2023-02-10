package ch03;

public class MainTest1 {

	// 코드 시작점
	public static void main(String[] args) {
		char myA = 'A';
		char yourA = 'a';
		System.out.println((int) myA);
		System.out.println((int) yourA);
		System.out.println("===============");
		System.out.println((short) myA);

		// 대입 연산자 ' = ' , 연산의 방향은 오른쪽에서 왼쪽으로
		int number = 10;
		// 변수에 변수를 대입할 수 있다.
		int number2 = number;
		System.out.println(number2);

		// 부호 연산자 ( + - )
		System.out.println("===============");
		System.out.println(-number);

		System.out.println(number);

		// 부호 연산자는 부호를 변경하는 연산자일 뿐 변수 값을 바꾸지는 않는다.
		
		number = -number;
		System.out.println(number);

	}// end of main

}// end of class
