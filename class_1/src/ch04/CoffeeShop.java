package ch04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

	private static Coffee[] coffees = { new Coffee("아메리카노", 3_000), new Coffee("카페라떼", 4_000),
			new Coffee("카푸치노", 4_500), };

	public static void main(String[] args) {

		CoffeeShop coffeeShop = new CoffeeShop();
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("고객 잔액을 입력하세요");
		int balance = scanner.nextInt();
		Customer customer = new Customer(name, balance);

		System.out.println(">>커피메뉴<<");
		for (int i = 0; i < coffees.length; i++) {
			System.out.println((i + 1) + ". " + coffees[i].getName() + "(" + coffeeShop.coffees[i].getPrice() + "원)");
		}

		System.out.println("커피를 선택하세요");
		int orderNumber = scanner.nextInt();

		Coffee coffee = coffees[orderNumber - 1];

		customer.buyCoffee(coffee);

		scanner.close();

		// 어떤 커피를 선택하였는지 알 수 있는 코드

	}

}
