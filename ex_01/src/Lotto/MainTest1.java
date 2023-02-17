package Lotto;

import java.lang.reflect.Array;

public class MainTest1 {

	// end of main
	public static void main(String[] args) {
		User user = new User();
		LottoNumber number = new LottoNumber();
		CheckLotto checkLotto = new CheckLotto();
		boolean flag = true;
		int count = 0;
		int[] checkId = new int[user.MAX_BUY];
		user.buy();

		int[] luckyNumbers = number.lottoNubmers();
		System.out.println("당첨번호-------------------");
		System.out.println(luckyNumbers[0] + " " + luckyNumbers[1] + " " + luckyNumbers[2] + " " + luckyNumbers[3] + " "
				+ luckyNumbers[4] + " " + luckyNumbers[5]);
		System.out.println("---------------------------");

		// 번호 맞추기
		for (int i = 0; i < user.lottos.length; i++) {
			checkId[i] = checkLotto.check(luckyNumbers, user.lottos[i]);
		}

		for (int i = 0; i < checkId.length; i++) {
			System.out.println((i + 1) + "번 로또는 " + checkId[i] + "개 맞았습니다.  " + checkLotto.checkGrade(checkId[i]));
			checkLotto.checkGrade(checkId[i]);
		}

	} // end of main

} // end of class
