package ch12;

public class person extends Human{

	@Override
	public void hunt() {
		System.out.println("얘는 사람이야!");
		super.hunt(); 
	}
	
}
