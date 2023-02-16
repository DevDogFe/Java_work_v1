package box;

public class Box<T extends Contents> {

	private T contents;
	
	public Box() {
		this.contents = null;
	}
	
	public void put(T contents) {
		System.out.println("박스안에 물건을 넣습니다.");
		this.contents = contents;
	}
	
	public T take(T contents) {
		this.contents = null;
		System.out.println("박스안에서 "+ contents.getName() +"을 꺼냅니다.");
		return contents;
	}
	
	public boolean isEmpty() {
		if(contents != null) {
			System.out.println("박스 안에는 " + contents.getName() + "이 들어있습니다.");
			return false;
		}
		System.out.println("박스안은 비어있습니다.");
		return true;
	}
}
