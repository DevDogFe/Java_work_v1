package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<String, String> phoneBook = new HashMap<>();

		phoneBook.put("홍길동", "010-1234-1234");
		phoneBook.put("이순신", "010-2222-2222");

		while (true) {
			System.out.println("0종료 1저장 2전체조회 3선택조회 4선택삭제 5전체삭제");
			System.out.println("메뉴를 선택하세요");
			int menu = scanner.nextInt();
			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				return;

			case 1:
				System.out.print("이름을 입력하세요: ");
				String name = scanner.next();
				System.out.print("전화번호를 입력하세요: ");
				String phoneNumber = scanner.next();
				phoneBook.put(name, phoneNumber);
				System.out.println(name + "님의 전화번호가 저장되었습니다.");
				break;

			case 2:
				if (phoneBook.isEmpty()) {
					System.out.println("저장된 번호가 없습니다.");
					break;
				}
				for (String key : phoneBook.keySet()) {
					System.out.println(key + ": " + phoneBook.get(key));
				}
				break;

			case 3:
				if (phoneBook.isEmpty()) {
					System.out.println("저장된 번호가 없습니다.");
					break;
				}
				System.out.print("조회할 이름을 입력하세요: ");
				name = scanner.next();
				if (phoneBook.containsKey(name)) {
					phoneNumber = phoneBook.get(name);
					System.out.println(name + "님의 전화번호는 " + phoneNumber + "입니다.");
				} else {
					System.out.println(name + "님의 전화번호가 존재하지 않습니다.");
				}
				break;

			case 4:
				if(phoneBook.isEmpty()) {
					System.out.println("저장된 번호가 없습니다.");
					break;
				}
				System.out.print("삭제할 이름을 입력해주세요.");
				name = scanner.next();
				if(phoneBook.containsKey(name)) {
					phoneBook.remove(name);
					System.out.println(name + "님의 전화번호가 삭제되었습니다.");
				} else {
					System.out.println(name + "님의 전화번호가 존재하지 않습니다.");
				}
				break;
				
			case 5:
				if(phoneBook.isEmpty()) {
					System.out.println("저장된 번호가 없습니다.");
					break;
				}
				phoneBook.clear();
				System.out.println("전체 전화번호가 삭제되었습니다.");
				break;
				
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		}

	}

}
