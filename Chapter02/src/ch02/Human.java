package ch02;

public class Human {

	String name;
	int height;
	int weight;
	boolean isMan;

	// 생성자는 객체가 메모리에 올라갈 때 가장 먼저 수행되는 코드이다.
	public Human() {
		// 필요하다면 초기화값 식 사용 가능 or 메서드 호출도 가능
		if(this.name == null) {
			System.out.println("이름을 입력해주세요.");
			this.name = "아무개";
		}
		showInfo(); //필요하다면 메서드 호출도 가능하다.
	}

	public void showInfo() {
		System.out.println("=============상태창=============");
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("성별: " + isMan);
		System.out.println("이름: " + name);
		System.out.println("================================");
	}

}