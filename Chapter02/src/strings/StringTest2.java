package strings;

public class StringTest2 {

	// 메인함수
	public static void main(String[] args) {

		// 상수 풀이라는 개념을 이해
		// 실제 주소값을 찍어보자
		
		String str1 = "반가워"; // 1
		String str2 = new String("반가워"); // 2
		String str3 = new String("반가워");
		String str4 = "반가워";
		
		// String에 주소값을 찍어보는 방법??
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		// 상수 풀에 한번 생성된 문자열은 불변(immutable)이다.
		str4 = str4 + "홍길동";
		System.out.println(System.identityHashCode(str4));
		str1 += ": 하이";
		System.out.println(System.identityHashCode(str1));
		// 상수풀 영역에 한번 생성된 문자열 값은 변경이 불가능하다.
		// str1 += ": 하이" <- 상수 풀 영역에 새로 생성된다.
		// 메모리를 효율적으로 사용하기 위해서는
		// StringBuilder 클래스, StringBuffer 클래스를 알아야 한다.
		
		

		
	} // end of main

} // end of class
