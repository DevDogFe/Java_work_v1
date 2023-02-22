package ch05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MainTest {

	// main
	public static void main(String[] args) {
		
		
		Map map;
		// key와 value구조로 데이터 저장
		// HashMap: Null값 저장 가능, Hashtable: Null값 저장 불가
		Map<String, String> map1 = new HashMap<>();
		Hashtable<String, String> map2 = new Hashtable<>();
		
		// CRUD
		map1.put("A01", "김포공항 정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		map1.put("B01", "김천공항 정문");
		map1.put("B02", "김천공항 후문");
		map1.put("B03", "김천공항 로비");
		map1.put("C01", null);
		
		System.out.println(map1); // map은 순서가 없음
		System.out.println(map1.get("B03"));
		System.out.println(map1.get("C01"));
		System.out.println(map1.get("b01")); // 없는 key값 요청하면 null 반환
		
		System.out.println("size: " + map1.size());
		for(int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get("A0" + i));
		}
		// map은 원래 순서가 없지만 key값으로 for문 정도는 활용할 수 있다.
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		map3.put(4, "E");
		for(int i = 0; i < map3.size(); i++) {
			System.out.println("value: " + map3.get(i));
		}
		
		// 삭제
		map1.remove("C01");
		// map1.clear(); 전체삭제
		System.out.println(map1);
		
		// 자료구조는 반복문과 if문을 많이 활용한다.
		// map계열 for문 활용법
		// 1. Entry 활용
		// Entry<String, String> entry1 = (Entry)map1.entrySet();
		for (Entry<String, String> entry2: map1.entrySet()) {
			System.out.println("key: " + entry2.getKey());
			System.out.println("value: " + entry2.getValue());
			System.out.println("----------------------------");
		}
		System.out.println("================================");
		// 2. keySet 활용
		System.out.println(map1.keySet().size());
		for(String key : map1.keySet()) {
			System.out.println("key: " + key);
			System.out.println("value: " + map1.get(key));
		}

	} // end of main

} // end of class
