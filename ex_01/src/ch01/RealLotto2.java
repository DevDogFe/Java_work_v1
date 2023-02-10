package ch01;

import java.util.Random;

public class RealLotto2 {

	static int randomNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1;
		return resultNumber;
	}

	// 코드실행 메인함수
	public static void main(String[] args) {

		int r1 = randomNumber();
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		int r5 = 0;
		int r6 = 0;
		while (r1 == r2 || r2 == 0) {
			r2 = randomNumber();
		}
		while (r1 == r3 || r2 == r3 || r3 == 0) {
			r3 = randomNumber();
		}
		while (r1 == r4 || r2 == r4 || r3 == r4 || r4 == 0) {
			r4 = randomNumber();
		}
		while (r1 == r5 || r2 == r5 || r3 == r5 || r4 == r5 || r5 == 0) {
			r5 = randomNumber();
		}
		while (r1 == r6 || r2 == r6 || r3 == r6 || r4 == r6 || r5 == r6 || r6 == 0) {
			r6 = randomNumber();
		}

		System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : "  + r5 + " : " + r6);
	}// 메인 끝

}
