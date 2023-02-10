package ch08;

public class MainTest2 {

	// 메인 함수
	public static void main(String[] args) {
		
		// 클래스 안에 멤버 변수를 사용하려면
		// 반드시 메모리에 올려야 한다.
		
		// 수행 요청 - 클래스 이름 (static 변수는 new 없이도 존재하고있고 사용가능)
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber);
		
		// static: 문법적으로 class xxx { } 안에 작성하지만 static 키워드를 가진 변수는
		// 잠시 자리만 빌려서 문법만 사용할 뿐 메모리를 사용하는 영역은 미리 뜨는 static영역이다.
		
		
	}// end of main

}//end of class
