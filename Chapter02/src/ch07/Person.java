package ch07;

class Person {

	// this 3가지 용법
	// 1. 자기자신을 가리킬 때
	// 2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다. (오버로딩 시)
	// 3. 자신의 주소값(참조값)을 반환시킬 수 있다.

	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 1.
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String phone) {
		// 2. 생성자에 다른 생성자를 호출
		this(name, age); // 위에 만들어 놓은 매개변수 2개짜리 생성자
		// 1.
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		// 2.
		this(name, age, phone);
		// 1.
		this.gender = gender;
	}

	// 3. 자신의 주소값 반환
	// 자신을 반환하는 빌더패턴을 만들어 낼 수 있다.
	public Person getPerson() {
		return this;
	}

	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}

}// end of Person class

// xxx.java 하나의 파일 내에 여러개의 클래스를 작성 할 수 있다.
// 단, xxx.java 하나의 파일 안에 public을 가지는 클래스는 단 하나만 선언할 수 있다.
// default
// 파일의 이름과 public class 이름이 같아야한다.
class PersonMainTest {

	// 메인 함수 잠시 자리를 빌려서 사용한다.
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		person1.showInfo();

	} // end of main

} // end of class
