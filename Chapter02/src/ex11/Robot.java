package ex11;

public class Robot extends Goods{

	boolean isTrans;
	
	public Robot(String name, int price, boolean isTrans) {
		super(name, price);
		this.isTrans = isTrans;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		if (isTrans == true) {
			System.out.println("변신기능 탑재");
		}
	}

}
