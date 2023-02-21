package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	// main
	public static void main(String[] args) {

		// List 계열
		List list0;
		// 순서가 있고(인덱스) 중복이 가능하다.

		// 배열과 달리 크기를 정해주지 않아도 초기화 가능하다.
		ArrayList<Integer> list = new ArrayList<>(); // 자료구조 선언 = 정수를 담을 수 있는 메모리 공간 선언
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();

		// CRUD
		// 값 추가 방법
		list.add(3); // 최초 인덱스 0번에 저장 인덱스 0번 - 3
		list.add(null); // 인덱스 1번 - null
		list.add(100); // 인덱스 2 - 100
		// 인덱스 번호 지정하여 값 저장, (인덱스 1번에 20 저장) - 끼워넣기
		list.add(1, 20); // 앞에서 넣었던 null과 100은 인덱스 번호가 하나씩 밀림 (index 2, 3)
		System.out.println(list.toString()); // 3, 20, null, 100
		System.out.println(list.size()); // 4

		// 값 삭제 방법
		// 해당하는 요소(index 2)에 접근해서 제거
		list.remove(2); // 뒤에있던 index 3이 index2의 값으로 밀림
		System.out.println(list.toString()); // 3, 20, 100
		System.out.println(list.size()); // 3
		// 전체삭제
		// list.clear();

		// 값을 화면에 출력하는 방법
		System.out.println("===========================");
		System.out.println(list.get(2)); // 인덱스 번호에 저장된 요소 불러오기 (index 2 - 100) 
		System.out.println(list.get(0)); // index 0 - 3
		System.out.println("===========================");
		
		// index for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===========================");
		
		// for each = initialize for
		for (int abc상관없음 : list) {
			System.out.println("변수명 아무거나: " + abc상관없음);
		}
		
		// 값 검색기능 사용해보기
		// 리스트 안에 값이 있는지 없는지 확인하기
		// 70 -> int -> 자동으로 클래스타입으로 형변환(Integer)
		// contains 요소안에 있는지 없는지 판별 - true false 반환
		System.out.println(list.contains(70)); // false
		System.out.println(list.contains(100)); // true
		
		// 100값이 몇번째 인덱스 요소인지 검색 -> indexOf()
		System.out.println(list.indexOf(100)); // 값이 있으면 인덱스 번호를 리턴
		System.out.println(list.indexOf(70)); // 값이 없으면 -1을 리턴
		
		// 추가
		Iterator<Integer> iter = list.iterator(); // 반복자로 형변환 Iterator()
		while(iter.hasNext()) {
			System.out.println("값 확인 방법: " + iter.next());
		}
		

	}// end of main

}// end of class

class Student {

}