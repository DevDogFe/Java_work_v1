package ch01;

public class variable {

	//중괄호(블록)의 범위는 절대적
	// main이란 :프로그램의 시작점
	public static void main(String[] args) {
		//<- 주석(컴파일러가 무시)
		//변수를 사용하는 방법
		int age; //변수선언
		int count;
		
		age = 1; //초기화한다 (값을 넣음)
		count = 100; //구문의 끝은 세미콜론으로
		
		//화면에 age라는 변수에 담겨 있는 값을 출력하기
		System.out.println(age);
		System.out.println("================");
		System.out.println(count);
		
		age = 500;
		count = 300;
		
		System.out.println(age);
		System.out.println("================");
		System.out.println(count);
		
		// 변수 선언과 동시에 초기화 하기 myAge;
		int myAge = 800; //변수 선언과 초기화
		System.out.println(myAge); //sysout + [ctrl] + [space]
		System.out.println(9000); //[ctrl] + [alt] + 화살표 아래
									// [ctrl] + [shift] + [F] : 코드 자동정렬
		
		// Tip
		// 변수 사용시 데이터 타입은 크게 두가지만 기억
		// 1)기본 데이터 타입  2) 참조 타입

	} // end of main

} //end of class
