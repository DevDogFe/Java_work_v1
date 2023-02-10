package ex11;

public class MiniCar extends Goods{
	
	String color;

	public MiniCar(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("색상: " + color);
	}

}
