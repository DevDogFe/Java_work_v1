package ch12;

// 1. 추상 메서드를 포함하게되면 추상클래스로 만들어주는 방법(결국 얘도 new 못때리게됨)
// public abstract class Human extends Animal{
public class Human extends Animal{

	// 부모 클래스에 있는 추상메서드를 자식클래스에서 일반메서드로 재정의
	@Override
	public void hunt() {
		System.out.println("휴먼이 사냥을 합니다.");
		
	}
	

} // end of class
