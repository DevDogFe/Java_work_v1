package Starcraft2;

import java.util.Scanner;

public class MainTest1 {

	//메인 함수
	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;
		
		Zealot zealot1 = new Zealot("미친딱딱이");
		Marine marine1 = new Marine("약빨고공중공격하는50원짜리");
		Zergling zergling1 = new Zergling("25원짜리공성병기");
		
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택하세요");
			// \t : 탭간격만큼 띄우기, \n 한줄 떨어뜨리기
			System.out.println("1.질럿\t2.마린\t3.저글링\t4.종료");
			unitChoice = sc.nextInt();
			System.out.println("공격할 유닛을 선택하거나 다른 행동을 선택하세요.");
			if (unitChoice == ZEALOT) {
				System.out.println("2.마린\t3.저글링\t4.종료");
				unitChoice = sc.nextInt();
				if (unitChoice == MARINE) {
					zealot1.attackMarine(marine1);
				} else if(unitChoice == ZERGLING) {
					zealot1.attackZergling(zergling1);
				}
			} else if (unitChoice == MARINE) {
				System.out.println("1.질럿\t3.저글링\t4.종료");
				unitChoice = sc.nextInt();
				if (unitChoice == ZEALOT) {
					marine1.attackZealot(zealot1);
				} else if(unitChoice == ZERGLING) {
					marine1.attackZergling(zergling1);
				}
			} else if (unitChoice == ZERGLING) {
				System.out.println("1.질럿\t3.저글링\t4.종료");
				unitChoice = sc.nextInt();
				if (unitChoice == ZEALOT) {
					zergling1.attackZealot(zealot1);
				} else if(unitChoice == MARINE) {
					zergling1.attackMarine(marine1);
				}
			} 
		} while (unitChoice != GAME_END);
		System.out.println("게임이 종료되었습니다.");
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();

		
		
	}// end of main

}// end of class
