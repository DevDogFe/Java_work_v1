package generic_free;

public class RefrigeratorMainTest {

	public static void main(String[] args) {
		Drinks petCocacola = new Pet("코카콜라 500ml");
		Drinks canPepsi = new Can("펩시 200ml");
		
		Refrigerator<Drinks> refrigerator = new Refrigerator<>();
		
		refrigerator.setDrinks(canPepsi);
		Drinks useCanPepsi = refrigerator.getDrinks();
		System.out.println("내용물: " + useCanPepsi.getName());
		

	}

}
