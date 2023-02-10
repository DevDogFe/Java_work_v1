package ch01;

public class MainTest2 {

	//메인 함수
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "뽀로로";
		student1.address = "남극";
		student1.studentId = 3;
		
		student1.breakTime();
		student1.homework();
		student1.test();
		
		Bus bus1 = new Bus();

	}// end of main

}//end of class
