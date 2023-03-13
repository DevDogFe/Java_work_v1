package ch04;

public class BuyDTO {
	
	String userName;
	String prodName;
	int price;
	int amount;
	public String getUserName() {
		return userName;
	}
	public String getProdName() {
		return prodName;
	}
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public BuyDTO(String userName, String prodName, int price, int amount) {
		super();
		this.userName = userName;
		this.prodName = prodName;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BuyDTO [userName=" + userName + ", prodName=" + prodName + ", price=" + price + ", amount=" + amount
				+ "]";
	}
	
	
	
}
