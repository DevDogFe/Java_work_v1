package ch05;

import java.util.Scanner;

//클래스를 사용하는 코드
public class UserMainTest1 {

	// 메인 함수
	public static void main(String[] args) {

		User user1 = new User();
		
		user1.userId = "abcd";
		user1.userName = "김지현";
		user1.userAddress = "경남 양산시";
		user1.userPhoneNumber = "010-1234-5678";
		user1.userAge = 34;
		user1.userGender = "남성";
		
		
		
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.userAddress);
		System.out.println(user1.userPhoneNumber);
		System.out.println(user1.userAge);
		System.out.println(user1.userGender);

	}// end of main

}// end of class
