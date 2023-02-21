package ch07;

public class MainTest {

	// main
	public static void main(String[] args) {
		
		A a = new A();
		// d object에 있는 value값을 화면에 출력
		
		System.out.println(a.b.c.d.value);
		System.out.println(a.b.c.d.arrayList.toString());
		System.out.println("======================");
		for(int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			System.out.println(a.b.c.d.arrayList.get(i));
		}
		System.out.println("======================");
		for (String string : a.b.c.d.arrayList) {
			System.out.println(string);
		}
	} // end of main

}
