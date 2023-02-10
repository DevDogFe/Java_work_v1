package ch09;

public class BookMainTest1 {

	// 메인함수
	public static void main(String[] args) {

		// 연관된 여러개의 데이터를 통으로 관리하고 싶다면 - 배열(자료구조)
		Book[] books = new Book[10]; // 배열 선언(메모리 공간 만들어두기)
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파올로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
//		books[5] = new Book("홍길동전", "허균"); //java.lang.ArrayIndexOutOfBoundsException
//		System.out.println(books[0].getTitle());
//		System.out.println(books[4].getAuthor());
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 짜기
				System.out.println(books[i].getTitle());
			}
//			System.out.println(books[i].getAuthor());
		}
		// 인덱스의 크기는 n-1개다
		// 배열의 길이와 인덱스의 길이는 다르다.
		// 배열의 길이와 실제 들어가 있는 값의 갯수는 다를 수 있다.

		// 문제
		// double 배열 선언해서 임의값 넣고 출력하기
		double[] arrD = new double[4];
		arrD[0] = 0.1;
		arrD[1] = 0.2;
		arrD[2] = 0.3;
		for (int i = 0; i < arrD.length; i++) {
			System.out.println(arrD[i]);
		}

		// 문제 2
		// 0번째 인덱스 2번째 인덱스 속성 스왑 (예제 books 이용)
		books[7] = books[0];
		books[0] = books[2];
		books[2] = books[7];
		books[7] = null;
		// 문제 3
		// 인덱스 3번째 값 삭제
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				continue;
			}
//			System.out.println(books[i].getTitle());
			books[i].showInfo();
		}

	}// end of main

}// end of class
