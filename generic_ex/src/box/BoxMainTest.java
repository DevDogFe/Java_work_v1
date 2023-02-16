package box;

public class BoxMainTest {

	public static void main(String[] args) {
		
		Contents toy = new Toy("장난감");
		Contents doll = new Doll("인형");
		House house = new House("집");
		
		Box<Contents> box = new Box<>();
		
		box.put(doll);
		box.isEmpty();
		box.take(doll);
		
		box.put(toy);
		box.isEmpty();
		box.take(toy);
		
		// box.put(house);

	}

}
