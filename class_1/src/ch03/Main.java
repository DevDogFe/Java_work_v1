package ch03;

public class Main {

	public static void main(String[] args) {

		Coffee Americano = new Coffee(1, "아메리카노", 2_000);
		Coffee CafeLatte = new Coffee(2, "카페라떼", 3_000);
		Coffee Espresso = new Coffee(3, "에스프레소", 1_500);
		
		CoffeeShop coffeeShop = new CoffeeShop(1, "커피샵", "서면", null);
		

	}

}
