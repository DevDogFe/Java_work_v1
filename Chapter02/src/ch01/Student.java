package ch01;

public class Student {

	// 상태(속성)
	int studentId;
	String studentName;
	String address;
	double height; //0.0
	boolean isMarried; //false

	// 기능(메서드)

	// 공부한다.
	public void study() {
		System.out.println(studentName + " 학생이 공부를 합니다.");
	}
	
	//휴식한다
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	}
	
	public void showInfo() {
		System.out.println("============상태창=============");
		System.out.println("학생 ID: " + studentId);
		System.out.println("학생 이름: " + studentName);
		System.out.println("학생 주소: " + address);
		System.out.println("===============================");
	}
	
	public void homework() {
		System.out.println(studentName + "학생이 숙제를합니다.");
	}
	public void lunchTime() {
		System.out.println(studentName + "학생이 점심시간을 갖습니다.");
	}
	public void test() {
		System.out.println(studentName + "학생이 시험을 칩니다.");
		int num11 = (int)Math.random()*100;
		if (num11 > 5) {
			System.out.println("결과: Pass");
		} else {
			System.out.println("결과: Fail");
		}
	}
	
	//함수와 메서드의 차이점
	//메서드란
	//객체의 기능을 구현하기 위해서 클래스 내부에 구현된 기능

} // end of class
