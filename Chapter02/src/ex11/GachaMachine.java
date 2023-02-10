package ex11;

import java.util.Random;

public class GachaMachine {
	
	String name;
	Goods goods;
	
	public GachaMachine(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	public Goods getGoods() {
		return goods;
	}



	public void setGoods(Goods goods) {
		this.goods = goods;
	}


	
	static int rNumber() {
		Random random = new Random();
		int rNumber = random.nextInt(2) + 1;
		return rNumber;
	}
	
	static int goodsNumber() {
		Random random = new Random();
		int goodsNumber = random.nextInt(99);
		return goodsNumber;
	}
	
}
