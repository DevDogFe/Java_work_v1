package ch07;

public class StudentMainTest {

	public static void main(String[] args) {

		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(2, "홍길동");
		Student student3 = new Student(3, "홍길금");
		
		System.out.println(student1);
		
		Boolean result1 = student1.equals(student2);
		Boolean result2 = student1.equals(student3);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}// end of main

}// end of class
