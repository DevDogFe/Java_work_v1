package ch03;

//예약어 - 가져오다  자바 개발자들이 사용하라고 미리 만들어둠
import java.util.Scanner;

public class MainTest7 {

	// main
	public static void main(String[] args) {

		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;

		int num1 = (5 > 3) ? 10 : 20;
//		System.out.println(num1);
//		int num2 = (5 < 3) ? 10 : 20;
//		System.out.println(num2);

		int max = 0;
		System.out.println("입력 받은 두 수중 큰 수를 출력하시오.");

		// JDK에 만들어둔 도구
		// 입력 장치 (키보드에 있는 어떠한 값을 받아들여주는 것)
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x = sc.nextInt(); // nextInt(): 정수값만 받음
		System.out.println("x : " + x);

		System.out.println("입력 2 : ");
		int y = sc.nextInt();

		System.out.println("-------------------");
		// 여기까지 코드가 내려온다면 x값과 y값이 담겨있는 상태이다.

		// x 값과 y 값을 비교해서 두 수중 큰 수를 화면에 출력하시오

		max = (x > y) ? x : y;
		System.out.println("입력 받은 두 수중 큰 숫자는 " + max + "입니다.");

	}// end of main

}// end of class
