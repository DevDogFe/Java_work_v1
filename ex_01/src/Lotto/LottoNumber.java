package Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	final int LOTTO_SIZE = 6;
	final int LOTTO_MAXNUMBER = 45;
	Random random = new Random();

	public int[] lottoNubmers() {

		int[] lottoNumbers = new int[LOTTO_SIZE];
		for (int i = 0; i < lottoNumbers.length; i++) {
			lottoNumbers[i] = random.nextInt(LOTTO_MAXNUMBER) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNumbers[i] == lottoNumbers[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoNumbers);
		return lottoNumbers;
	}

}
