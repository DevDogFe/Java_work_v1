package strings;

public class StringTest1 {

	// 메인 함수
	public static void main(String[] args) {

		// 문자열이라는 데이터를 사용할 때
		String str1 = "반가워"; // 1
		String str2 = new String("반가워"); // 2
		String str3 = new String("반가워");
		String str4 = "반가워";
		System.out.println("str1" + str1);
		System.out.println("str2" + str2);

		// 1번 방식과 2번방식은 메모리 위치가 다르다.
		// 1번: 상수 풀 2번: 힙메모리
		// == 연산은 기본데이터타입: 값을 비교, 참조타입: 주소값 비교

		// 검증하기
		if (str1 == str2) {
			System.out.println("주소값이 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}

		// 검증하기2
		if (str2 == str3) {
			System.out.println("주소값이 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}

		// 검증하기3
		if (str1 == str4) {
			System.out.println("주소값이 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}
		// 검증하기4
		if (str1.equals(str2)) {
			System.out.println("문자열이 같아요");
		} else {
			System.out.println("문자열이 달라요");
		}

		// 결론 리터럴 값으로 생성한 문자열은 상수 풀이라는 여역에 올라가고
		// 동일한 문자열을 사용한다면 새로 생성하지 않고 재활용하여 사용한다.
		
		// equals

	}// end of main

}// end of class
