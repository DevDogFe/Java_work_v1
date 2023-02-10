package ch01;

import java.util.Scanner;

public class MainTest3 {

	//메인 함수
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		Student studentKim = new Student();
		System.out.println(studentKim); //주소값 'ch01.Student@7c30a502' 출력
		Student studentLee = new Student();
		System.out.println(studentLee); //주소값 'ch01.Student@49e4cb85' 출력
		
		//기본 데이터타입 - 값(리터럴)이 출력된다.
		//참조 타입 - 주소값이 출력된다.
		System.out.println("=============================");
		System.out.println(studentLee.studentId); //0
		System.out.println(studentLee.studentName); //null
		System.out.println(studentLee.address); //null
		System.out.println(studentLee.height); //0.0
		System.out.println(studentLee.isMarried); //false
		//멤버 변수는 객체로 메모리에 올라간 뒤 멤버변수의 값을 할당하지 않으면
		//기본 값으로 먼저 초기화 해 준다.(컴파일러가 알아서 초기화)
		
	}// end of main

}//end of class
