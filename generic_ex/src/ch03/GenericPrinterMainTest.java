package ch03;

public class GenericPrinterMainTest {

	// main
	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 사용 방법
		// 객체생성할 때 사용할 타입 명시
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();

		// 재료 넣기: 컴파일 시점에 오류 확인 가능 (Object 사용할 때보다 안정적이고 가독성 높음)
		// genericPrinter.setMaterial(plastic); <- 컴파일시점 오류
		genericPrinter.setMaterial(powder);
		
		//재료 꺼내기
		Powder usePowder = genericPrinter.getMaterial();
		//Plastic usePlastic = genericPrinter.getMaterial(); //잘못된 데이터 타입 대입: 컴파일시점 오류
		
		// 결론: 보다 가독성 높고 안정적인 프로그래밍을 할 수 있다.
		// 같은 변수 이름 같은 기능이라면 제네릭 프로그래밍을 설계하면 ㅗ딘다.

	} // end of main

} // end of class
