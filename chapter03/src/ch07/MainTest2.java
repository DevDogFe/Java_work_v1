package ch07;

// import java.lang.*; 자동으로 선언되어있음

public class MainTest2 {

	public static void main(String[] args) {
		// java.lang.*; <-- 컴파일러가 자동으로 import(직접 작성하지 않아도 된다.)

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로 코엘료");
		Book book2 = new Book(2, "홍길동전", "허균");
		Book book3 = new Book(3, "홍길동전", "허균");
		Book book4 = new Book(4, "홍길동전", "허상");
		
		// 자바 개발자들이 만들어준 String 클래스 안에
		// toString 메서드가 재정의되어있다.
		String str1 = new String("허균");
		Boolean result0 = str1.equals("홍길동");

		Boolean result1 = book1.equals(book2);
		System.out.println("result1: " + result1);
		
		Boolean result2 = book2.equals(book3);
		System.out.println("result1: " + result2);
		
		if(book3.equals(book4)) {
			System.out.println("논리적으로 같은책입니다.");
		} else {
			System.out.println("다른책 입니다.");
		}

	}

}
