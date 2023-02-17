package Lotto;

public class CheckLotto {

	User user;
	LottoNumber lottoNumber;
	final int GRADE_ONE = 6;
	final int GRADE_TWO = 5;
	final int GRADE_THREE = 4;
	final int GRADE_FOUR = 3;
	final int GRADE_FIVE = 2;

	public int check(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public String checkGrade(int count) {
		String str;
		if (count == GRADE_ONE) {
			str = "**경축** 1등에 당첨되었습니다.";
			return str;
		} else if (count == GRADE_TWO) {
			str = "*축* 2등에 당첨되었습니다.";
			return str;
		} else if (count == GRADE_THREE) {
			str = "*축* 3등에 당첨되었습니다.";
			return str;
		} else if (count == GRADE_FOUR) {
			str = "*축* 4등에 당첨되었습니다.";
			return str;
		} else if (count == GRADE_FIVE) {
			str = "*축* 5등에 당첨되었습니다.";
			return str;
		}
		str = "(꽝)";
		return str;

	}

}
