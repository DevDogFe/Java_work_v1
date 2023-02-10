package ch01;

import java.util.Random;

public class RealLotto {

	static int randomNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1;
		return resultNumber;
	}

	// 코드실행 메인함수
	public static void main(String[] args) {

		for(int i = 0; i < 6; i++) {
			int num = randomNumber();
			if (i == 0) {
				System.out.print("[ ");
			}
			System.out.print(num);
			if (i != 5) {
				System.out.print(" : ");
			} else if (i == 5){
				System.out.print(" ]");
			}
		}
		
	}// 메인 끝

}
