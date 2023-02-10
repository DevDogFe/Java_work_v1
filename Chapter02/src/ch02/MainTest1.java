package ch02;

public class MainTest1 {

	// 메인함수
	public static void main(String[] args) {
		
		//기본 생성자(default)
		Student studentHong = new Student(); //컴파일러가 알아서 넣어줌

//		Student studentKim = new Student(); //생성자
//		studentKim.grade = 1;
//		studentKim.name = "홍길동";
//		studentKim.number = 1234;
		// 객체를 생성할 때 반드시 하나 이상의 생성자가 있어야 한다.
		Student studentKim = new Student("홍길동", 1234, 1);
		System.out.println(studentKim.name);
		System.out.println(studentKim.grade);
		System.out.println(studentKim.number);
		
		studentKim.checkGrade();
		
//		객체를 생성할 때 강제성을 부여하는 것
		

	}// end of main

}// end of class
