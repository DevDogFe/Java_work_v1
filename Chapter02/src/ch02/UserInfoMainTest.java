package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		
		UserInfo user1 = new UserInfo("aaa", "피카츄", "01011111111");
		UserInfo user2 = new UserInfo("bbb", "라이츄");
		UserInfo user3 = new UserInfo("ccc");
		UserInfo user4 = new UserInfo();
		
		System.out.println(user1.userName + user1.userId + user1.phone);
		System.out.println(user2.userName + user2.userId + user2.phone);
		System.out.println(user3.userName + user3.userId + user3.phone);
		System.out.println(user4.userName + user4.userId + user4.phone);

	}

}
