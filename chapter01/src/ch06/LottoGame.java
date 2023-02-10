package ch06;

//Random 가지고옴 --> LottoGame.java 파일
import java.util.Random;

public class LottoGame {

	// 함수를 만들 때 반드시 어떠한 기능을 만들지 정의하고 코드 작성할 것!
	// 랜덤 숫자 하나를 반환하는 기능을 만들어 보자.
	static int randomNumber() {
		// 알고리즘 설계
		// JDK가 만들어준 도구 이용하기
		// Random: 랜덤값을 하나 생성해서 반환
		Random random = new Random();
		// 45넣으면 0부터 44까지 반환
		int resultNumber = random.nextInt(45) + 1;
		return resultNumber;
	}

	// 코드실행 메인함수
	public static void main(String[] args) {
//		System.out.println(randomNumber());
		
		int r1 = randomNumber();
		int r2 = randomNumber();
		int r3 = randomNumber();
		int r4 = randomNumber();
		int r5 = randomNumber();
		int r6 = randomNumber();
		
		System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + " : " + r5 + " : " + r6);
	}// 메인 끝

}// 클래스 끝
