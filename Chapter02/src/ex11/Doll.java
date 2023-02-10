package ex11;

public class Doll extends Goods{
	
	String gender;

	public Doll(String name, int price, String gender) {
		super(name, price);
		this.gender = gender;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("특이사항: " + gender);
	}

}
