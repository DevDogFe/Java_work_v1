package ch05;

import java.util.Scanner;

//클래스를 사용하는 코드
public class UserMainTest2 {

	// 메인 함수
	public static void main(String[] args) {

		// nextInt(): 개행문자 제거하지 않았기 때문에
		// 바로 아래 코드가 동작하고 완료 된다.
		User user2 = new User();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력해주세요.");
		user2.userId = sc.nextLine();
		
		System.out.println("이름을 입력해주세요.");
		user2.userName = sc.nextLine();
		
		System.out.println("주소를 입력해주세요.");
		user2.userAddress = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요.");
		user2.userPhoneNumber = sc.nextLine();
		
		System.out.println("나이를 입력해주세요.");
		user2.userAge = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별 입력해주세요.");
		user2.userGender = sc.nextLine();
		
		System.out.println("===========유저 정보============");
		System.out.println("ID: " + user2.userId);
		System.out.println("이름: " + user2.userName);
		System.out.println("주소: " + user2.userAddress);
		System.out.println("전화번호: " + user2.userPhoneNumber);
		System.out.println("나이: " + user2.userAge);
		System.out.println("성별: " + user2.userGender);
			
		

	}// end of main

}// end of class
