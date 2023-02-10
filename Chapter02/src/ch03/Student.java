package ch03;

public class Student {

	int studentId; // 학번
	int grade; // 학년
	String name; // 이름
	// 참조 타입
	Subject korea;
	Subject math;

	// 생성자
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;

		this.korea = new Subject();
		this.math = new Subject();
	}

	// 메서드
	public void showInfo() {
		System.out.println("**상태창**");
		System.out.println(this.name + "입니다.");
		System.out.println(this.grade + "학년입니다.");
		System.out.println(this.studentId + "번입니다.");
		System.out.println(this.korea.subjectName + "의 점수는 " + this.korea.score);
		System.out.println(this.math.subjectName + "의 점수는 " + this.math.score);
	}
	

} // end of class
