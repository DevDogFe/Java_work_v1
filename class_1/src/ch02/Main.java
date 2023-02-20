package ch02;

public class Main {

	public static void main(String[] args) {

		Address address = new Address("해운대구 좌동 123", "부산", "롯데 103호", "456-123");
		Person person = new Person("홍길동", 20, address);
		
		System.out.println("name: " + person.getName());
		System.out.println("address: " + person.getAddress());
		
		// Person 클래스에서 Address를 참조할 수 있다.
		// Address 클래스는 Person 클래스를 참조할 수 없다.
		
		Person person2 = new Person("홍길", 21, new Address("NY Street", "NewYork", "NY", "11-11"));
		System.out.println(person2.getAddress());
		
	}// end of main

}// end of class
