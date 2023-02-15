package ch08;

public class ArrayExceptionHandling {

	// main
	public static void main(String[] args) {

		// 배열 선언과 동시에 초기화
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]); // arr.length가 5이므로 오류날것
			}
		} catch (Exception e) {
			System.out.println("개발자야 인덱스 길이 모르니"); // 오류대신 sysout 띄우기
		}

		System.out.println("비정상 종료되지 않음"); // 그다음 코드도 실행함

	} // end of main

} // end of class
