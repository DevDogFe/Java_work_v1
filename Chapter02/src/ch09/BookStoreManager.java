package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {
		final int SAVE = 1;
		final int ALL = 2;
		final int SELECT = 3;
		final int DELETE = 4;
		final int END = 0;
		boolean searchAll = false;
		boolean flag = true;
		int button = -1;

		// 책을 저장하는 기능 만들고
		// 정보를 출력하는 프로그래밍 만들어주세요.
		Scanner sc = new Scanner(System.in);
		String search = null;

		Book[] books = new Book[100];
		while (flag) {
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램종료");
			button = sc.nextInt();
			sc.nextLine();
			if (button == SAVE) {
				save(sc, books);
			} else if (button == ALL) {
				seeAll(books);
			} else if (button == SELECT) {
				seeSelect(sc, search, books, searchAll);
			} else if (button == DELETE) {
				deleteAll(books);
			} else if (button == END) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			} else {
				System.out.println("잘못된 값을 입력하였습니다. 다시입력해주세요.");
			}
		} // end of while

		// 전체 조회하기 기능

	}// end of main
	
	public static void save(Scanner sc, Book[] books) {
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();
		System.out.println("저자를 입력하세요");
		String author = sc.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = new Book(title, author);
				break;
			}
		}
	}
	
	public static void seeAll(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();
			}
		}
	}
	
	public static void seeSelect(Scanner sc, String search, Book[] books, boolean searchAll) {

		System.out.println("조회할 책의 제목이나 저자를 입력하세요.");
		search = sc.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 작성
				if (search.equals(books[i].getTitle())) {
					books[i].showInfo();
					searchAll = true;
				} else if (search.equals(books[i].getAuthor())) {
					books[i].showInfo();
					searchAll = true;
				}
			}
		}
		if (searchAll == false) {
			System.out.println("조회할 내용이 없습니다.");
		}
		searchAll = false;
		
	
	}
	public static void deleteAll(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
		}
	}

}// end of class
