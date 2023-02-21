package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMainTest {

	// main
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(10);
		set1.add(100);
		set1.add(500);
		set1.add(500);
		set1.add(500);
		
		System.out.println(set1.toString()); // [1, 100, 500, 10]
		System.out.println(set1.size()); // 4
		
		set1.remove(500);
		System.out.println(set1.toString()); // [1, 100, 10]
		// set1.clear();
		// System.out.println(set1.toString()); // []
		
		// Set 계열은 인덱스값이 없으므로 일반적인 for문 등으로 반복 처리하기 힘들다.
		// Set 계열을 반복문 처리할 때 Iterator 타입으로 변환해서 처리할 수 있다.
		Iterator<Integer> iter = set1.iterator(); // 반복자로 형변환 처리
		// hasNext();, next();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		try {
//			System.out.println("next1: " + iter.next());
//			System.out.println("next2: " + iter.next());
//			System.out.println("next3: " + iter.next());
//		} catch (Exception e) {
//			
//		}

	} // end of main

} // end of class
