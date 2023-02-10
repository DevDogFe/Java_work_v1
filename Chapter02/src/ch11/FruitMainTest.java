package ch11;

public class FruitMainTest {

	// 메인함수
	public static void main(String[] args) {
		// 다양한 형태로 클래스(타입)를 바라볼 수 있다.
		Fruit fruit1 = new Banana(); // 업 캐스팅
		// fruit1.origin;
		// 컴파일 시점에는 컴파일러가 앞에 선언된 데이터 타입만 확인한다.
		Fruit fruit2 = new Peach();
		
		Fruit[] fruits = new Fruit[2];
		fruits[0] = fruit1;
		fruits[1] = fruit2;
		
		// 다운 캐스팅 개념을 알자 like 강제 형변환
		String bananaOrigin = ((Banana) fruit1).origin; // 강제 형변환과 유사
		System.out.println("다운캐스팅된 값 확인 " + bananaOrigin);
		
		// 반복문
		// instanceof 
		for(int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			// 바나나면 원산지 출력하기
			// 바나나 타입이 맞다면 여기 코드 안으로 들어온다.
			if (fruits[i] instanceof Banana) {
				System.out.println("바나나 원산지: " + ((Banana)fruits[i]).origin);
			}
			System.out.println("==============");
		}
		

	}// end of main

}// end of class
