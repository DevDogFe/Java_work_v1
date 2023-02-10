package ex11;

public class Goods {
	
	String name;
	int price;
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + " 가격: " + price);
	}

}
