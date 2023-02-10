package ch03;

public class MainTest1 {

	public static void main(String[] args) {

		Student studentHong = new Student(1, 3, "홍길동");
		Student studentLee = new Student(2, 3, "이순신");

		// 컴파일 시점에 오류를 확인할 수 없는 상태였다.(런타임 시점에 오류 확인)
		// 메모리에 korea가 올라가지 않은 상태
		// 해결방법 1) 클래스 내부에서 초기화 2) 외부에서 초기화
		studentHong.korea.subjectName = "국어";
		studentHong.math.subjectName = "수학";
		studentHong.korea.score = 90;
		studentHong.math.score = 90;

		studentHong.showInfo();
//		System.out.println(studentHong.korea);
		System.out.println("====================");
		
		//이순신에 과목 국어, 수학 이름 데이터를 입력
		// 국어 100점 수학 5점 출력
		studentLee.korea.subjectName = "국어";
		studentLee.korea.score = 100;
		studentLee.math.subjectName = "수학";
		studentLee.math.score = 5;
		
		studentLee.showInfo();
		

	} // end of main

} // end of class
