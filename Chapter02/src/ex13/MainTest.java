package ex13;

import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		// 우리반 학생 이름들을 배열에 담아 주세요
		// 랜덤 클래스를 사용해서
		// 한명을 추출해 주세요.~

		String[] students = new String[18];
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		final int RANDOM = 1;
		final int END = 2;
		students[0] = "편용림";
		students[1] = "김효린";
		students[2] = "진석";
		students[3] = "강민정";
		students[4] = "한범진";
		students[5] = "손주이";
		students[6] = "김유주";
		students[7] = "김미정";
		students[8] = "김지현";
		students[9] = "박성희";
		students[10] = "이지운";
		students[11] = "정다운";
		students[12] = "이치승";
		students[13] = "이서영";
		students[14] = "전대영";
		students[15] = "김현우";
		students[16] = "김민우";
		students[17] = "이현서";
		int rNumber = -1;
		System.out.println("랜덤으로 추출된 사람은 " + students[rNumber]);

		while (flag) {
			System.out.println("랜덤으로 학생 추출하시겠습니까?");
			System.out.println("1.추출하기 \t2.프로그램종료");
			int button = scanner.nextInt();
			if (button == RANDOM) {
				rNumber = random.nextInt(students.length);
				System.out.println(students[rNumber]); 
			} else if (button == END) {
				System.out.println("프래그램을 종료합니다.");
				flag = false;
			}
		}

	}// end of main

}// end of class
