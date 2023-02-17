package Lotto;

public class User {

	int[][] lottos;
	LottoNumber number;
	final int MAX_BUY = 5;

	public User() {
		number = new LottoNumber();
		lottos = new int[MAX_BUY][number.LOTTO_SIZE];
	}

	public void buy() {
		System.out.println("구매한 로또 현황");
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = number.lottoNubmers();
		}
		for (int i = 0; i < lottos.length; i++) {
			System.out.println((i + 1) + ".-------------------------");
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j] + " ");
			}
			System.out.println();
			System.out.println("---------------------------");
		}
	}
}
