package ch06;

import java.util.ArrayList;

public class Main {

	// main
	public static void main(String[] args) {

		// Student 인스턴스 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "bob@example.com");
		
		// 과정 생성
		Course course1 = new Course(1, "Math", "introduction to Mathmatics");
		Course course2 = new Course(2, "English", "introduction to English");
		
		// 등록 생성
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);
		
		// student1.setEnrollments(enrollment1); // 통으로 List 저장 -> Enrollment 타입 따로 저장 안됨
		// Student 인스턴스의 enrollments 필드에 각 리스트에 들어갈 Enrollment 인스턴스를 따로 넣기 
		student1.addEnrollment(enrollment1);
		student1.addEnrollment(enrollment3);
		
		student2.addEnrollment(enrollment2);
		
		// 1. Bob이 신청한 과정의 이름을 화면에 출력
		// 2. Alice가 신청한 과정의 이름을 화면에 출력
		
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		for(int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(studentName + ", courseName: " + courseName);
		}
		
		// 위 코드는 Student와 Course를 Enrollment 클래스를 통해서 연결하는 예제코드이다.
		
		// 3. Enrollment1: 학생 정보와 과목 정보
		// 학생 이름: 이름, 수강 과목: 과목 이름
		
		System.out.println("학생이름: " + enrollment1.getStudent().getName());
		System.out.println("수강 과목: " + enrollment1.getCourse().getName());
		System.out.println("===================================================");
		
		
		// 4. ArrayList 생성하여 Enrollment 저장
		
		ArrayList<Enrollment> list = new ArrayList<>();
		list.add(enrollment1);
		list.add(enrollment2);
		list.add(enrollment3);
		
		for(Enrollment e : list) {
			System.out.println("-----------------------");
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
		}
		
		// foreach Alice의 수강과목 다시한번더 출력
		for (Enrollment e : student1.getEnrollments()) {
			System.out.println("======================");
			System.out.println(e.getCourse().getName());
		}
		
		
	} // end of main

} // end of class
