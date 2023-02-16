package ch03;

import java.util.Scanner;

public class Exercise {

	// 윤년 계산하기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100의 배수이면서 400의 배수인 해는 윤년

	public static void main(String[] args) {
		int years;
		int userChoice;
		final int END = 0; 
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("체크하고 싶은 년도를 입력해주세요.");
			years = scanner.nextInt();
			if (years % 4 == 0) {
				// 윤년
				if (years % 100 == 0) {
					// 윤년아님
					if (years % 400 == 0) {
						System.out.println("윤년입니다.");
					} else {
						System.out.println("윤년이 아닙니다.");
					}
				} else {
					System.out.println("윤년입니다.");

				}
			} else {
				System.out.println("윤년이 아닙니다.");
			}
			System.out.println("종료: 0번 입력, 계속하시려면 아무숫자를 입력하세요.");
			userChoice = scanner.nextInt();
			if(userChoice == END) {
				flag = false;
			}
			
		}// end of while

	}
}
