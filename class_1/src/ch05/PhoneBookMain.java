package ch05;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		// while 0 종료 1 저장 2 전체조회 3 선택조회 4 선택삭제 5 전체삭제
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		String phoneNumber = null;
		String name = null;
		String address = null;
		String relative = null;
		int userInput;
		final int END = 0;
		final int SAVE = 1;
		final int SHOW_ALL = 2;
		final int SHOW_ONE = 3;
		final int DELETE_ONE = 4;
		final int DELETE_ALL = 5;
		final int YES = 1;
		final int NO = 2;

		HashMap<String, Person> phoneBook = new HashMap<>();

		while (flag) {
			System.out.println("기능을 선택해주세요.");
			System.out.println("0.종료 1.저장 2.전체조회 3. 선택조회 4.선택삭제 5.전체삭제");
			userInput = scanner.nextInt();
			scanner.nextLine();
			if (userInput == END) {
				flag = false;
			} else if (userInput == SAVE) {
				save(phoneNumber, name, address, relative, scanner, phoneBook);
			} else if (userInput == SHOW_ALL) {
				showAll(phoneBook);
			} else if (userInput == SHOW_ONE) {
				showOne(phoneNumber, scanner, phoneBook);
			} else if (userInput == DELETE_ONE) {
				deleteOne(phoneNumber, userInput, scanner, phoneBook, YES);
			} else if (userInput == DELETE_ALL) {
				deleteAll(userInput, scanner, phoneBook, YES);
			} else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			}
		}

	} // end of main

	public static void save(String phoneNumber, String name, String address, String relative, Scanner scanner,
			HashMap<String, Person> phoneBook) {
		System.out.println("전화번호를 입력해주세요.");
		phoneNumber = scanner.nextLine();
		System.out.println("이름을 입력해주세요.");
		name = scanner.nextLine();
		System.out.println("주소를 입력해주세요.");
		address = scanner.nextLine();
		System.out.println("저장하려는 사람과의 관계를 입력해주세요.");
		relative = scanner.nextLine();
		Person person = new Person(name, address, relative);
		phoneBook.put(phoneNumber, person);
	}

	public static void showAll(HashMap<String, Person> phoneBook) {
		for (String key : phoneBook.keySet()) {
			System.out.println(phoneBook.get(key).showInfo());
			System.out.println("전화번호: " + key);
		}
	}

	public static void showOne(String phoneNumber, Scanner scanner, HashMap<String, Person> phoneBook) {

		System.out.println("조회하려는 이름을 입력해주세요.");
		phoneNumber = scanner.nextLine();
		System.out.println(phoneBook.get(phoneNumber));

	}

	public static void deleteOne(String phoneNumber, int userInput, Scanner scanner, HashMap<String, Person> phoneBook,
			int YES) {
		System.out.println("삭제할 전화번호를 입력해주세요.");
		phoneNumber = scanner.nextLine();
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("");
		userInput = scanner.nextInt();
		if (userInput == YES) {
			phoneBook.remove(phoneNumber);
			System.out.println("삭제되었습니다.");
		}
	}

	public static void deleteAll(int userInput, Scanner scanner, HashMap<String, Person> phoneBook, int YES) {

		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("삭제하려면 1번, 아니라면 아무숫자나 입력해주세요.");
		userInput = scanner.nextInt();
		if (userInput == YES) {
			phoneBook.clear();
			System.out.println("전체 삭제되었습니다.");
		}

	}
} // end of class
