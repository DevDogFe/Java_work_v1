package ch09;

import java.util.Arrays;
import java.util.Random;

// SRP: 단일 책임 원칙
// 하나의 클래스에는 하나의 기능

// 랜덤 번호 발생 클래스
public class LottoNumber {
	
	final int LOTTO_SIZE = 6;
	final int LOTTO_MAX_NUMBER = 45;
	int[] lottoNumbers;
	
	public LottoNumber() {
		lottoNumbers = new int[LOTTO_SIZE];
	}
	
	
	public int[] lotto() {
		
		Random r = new Random();
		for (int i = 0; i < lottoNumbers.length; i++) {
			int j = r.nextInt(LOTTO_MAX_NUMBER) + 1;
			lottoNumbers[i] = j;
			for(int e = 0; e < i; e++) {
				if(lottoNumbers[e] == lottoNumbers[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottoNumbers);
		return lottoNumbers;
	}
	
//	public static void main(String[] args) {
//		LottoNumber lottoNumber = new LottoNumber();
//		lottoNumber.lotto();
//	}

}
