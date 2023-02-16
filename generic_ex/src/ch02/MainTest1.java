package ch02;

public class MainTest1 {

	// main
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
		// 재료 넣기
		threeDPrinter3.setMaterial(powder);
		// 재료 꺼내보기
		Powder usePowder = (Powder)threeDPrinter3.getMaterial();
		
		// Object 사용시 불편한점
		// 다운캐스팅 일일이 해야함.
		// 런타임 시점에 잘못된 처리를 하게 되면 예외를 발생시킬 수 있다.
		

	} // end of main

} // end of class
