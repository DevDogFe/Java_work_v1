package ex07;

public interface Movable {
	
	void left();
	void right();
	void up();
	// default 문법 사용해보기
	// 후크 메서드(구현부만 있고 로직은 없다.)
	// movable 구현하는 클래스에서 필요하다면 재정의해서 사용
	default public void down() {};

}
