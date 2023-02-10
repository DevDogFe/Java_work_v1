package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	// 메인 함수
	public static void main(String[] args) {

		Human human = new Human();
		// 스캐너를 활용해서 값을 할당해 주세요.
		// 마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		human.name = sc.nextLine();
		System.out.println("키를 입력해 주세요");
		human.height = sc.nextInt();
		System.out.println("몸무게를 입력해 주세요");
		human.weight = sc.nextInt();
		System.out.println("성별을 입력해 주세요 (남자: true, 여자: false)");
		human.isMan = sc.nextBoolean();
		System.out.println("0번을 눌러 상태창 호출하기");

		int showInfo = sc.nextInt();
		while (showInfo != 0) {

			System.out.println("0을 입력해 주세요.");
			showInfo = sc.nextInt();
		}

		human.showInfo();

		// 스캐너 통해서 showInfo 호출 기능 만들어보기
		// 심화 0번 입력시에 showInfo 호출

	} // end of main

} // end of class
