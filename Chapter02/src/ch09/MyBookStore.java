package ch09;

import java.util.Scanner;

/*
 * @author 김지현
 * C생성 R조회 U수정 D삭제 CRUD 정의 확인
 */
public class MyBookStore {

	// 메인 함수
	public static void main(String[] args) {

		// 준비물
		Scanner scanner = new Scanner(System.in);
		Book[] books = new Book[100];
		boolean flag = true;
		boolean isFind = false;
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// 임시 데이터 todo 추후 삭제 예정
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파올로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		// 실행의 흐름 만들어보기
		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.종료");
			String selectedNumber = scanner.nextLine();
			if (selectedNumber.equals(SAVE)) {
				save(scanner, books);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books);
				System.out.println();
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				readSelect(scanner, books, isFind);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				// 종료
				flag = false;
			}
		}

	}// end of main

	public static void readAll(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
			}
		}
	}
	
	public static void deleteAll (Book[] books) {

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
		}
	}
	
	public static void readSelect (Scanner scanner, Book[] books, boolean isFind) {
		System.out.println("책의 제목을 입력해주세요.");
		String bookTitle = scanner.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					// 찾았다
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFind = true;
				}
			}
		}
		if (isFind == false) {
			System.out.println("조회할 수 없는 책입니다.");
		}
	}
	
	public static void save (Scanner scanner, Book[] books) {
		System.out.println("제목을 입력하세요");
		String title = scanner.nextLine();
		System.out.println("저자를 입력하세요");
		String author = scanner.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = new Book(title, author);
				break;
			}
		}
	}
}// end of class
