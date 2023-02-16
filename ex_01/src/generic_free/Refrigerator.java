package generic_free;

public class Refrigerator<T extends Drinks> {

	private T drinks;

	public T getDrinks() {
		System.out.println("냉장고 안의 음료를 확인합니다.");
		return drinks;
	}

	public void setDrinks(T drinks) {
		System.out.println("냉장고 안에 " + drinks.getName() + "을 넣습니다.");
		this.drinks = drinks;
	}
	
	
}
