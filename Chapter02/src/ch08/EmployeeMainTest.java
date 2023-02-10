package ch08;

public class EmployeeMainTest {

	// 메인 함수
	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);

		Employee employee2 = new Employee();
		employee2.setName("홍길동");

		Employee employee3 = new Employee();
		employee3.setName("티모");

		// static 변수를 사용하면서 각각 객체가 가지는 상태값을 저장해야 한다면
		// 멤버 변수를 활용해 저장한다.
		System.out.println(Employee.serialNum);
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);
		System.out.println("===========================");
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());

	} // end of main

}// end of class
