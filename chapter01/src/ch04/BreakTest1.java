package ch04;

import java.util.Iterator;

public class BreakTest1 {

	// 메인
	public static void main(String[] args) {
		//중간에 멈추는 break문
		
		for(int i = 1; i < 11; i++) {
			System.out.println("i: " + i);
			//만약 i값이 7이면 멈춰라
			if (i % 7 == 0) {
				break; //중간에 멈추고 반복문 하나를 빠져나옴
			}
		}
		

	}// 메인 끝

}// 클래스 끝
