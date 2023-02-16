package ch03;

// 문법 - how
// 클래스 이름뒤에 <알파벳 대문자> 붙인다.
public class GenericPrinter<T> {
	
	// 참조 타입 대신 대체 문자를 사용한다. E: element, K: Key, V: value, T: Type(아무 문자열 다 가능하긴함)
	
	// 제네릭 자료형이라고 부름
	private T material; // T 자료형으로 선언한 변수: material
	
	// 제네릭 메서드 - T 자료형을 반환하는 메서드
	public T getMaterial () {
		return material;
	}
	
	public void setMaterial (T material) {
		this.material = material;
	}
	// 이유 - why

}
