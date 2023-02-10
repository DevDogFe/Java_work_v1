package ch08;

public class ArrayMainTest {

	// 메인 함수
	public static void main(String[] args) {
		
		// 배열이란
		// 연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입이다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면
		// 베열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것이다.
		// []: index연산자
		
		// 배열을 선언할 때 몇간의 공간을 사용할지 먼저 지정해줘야 한다.
		int[] arr = new int[5]; // 공간만 할당
		
		// 인덱스 연산 값 할당
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;
		
		// 값 확인
		System.out.println(arr[2]);
		
		String[] arrS = new String[3];
		arrS[0] = "가";
		arrS[1] = "나";
		arrS[2] = "다";
		System.out.println(arrS[2] + arrS[1] + arrS[0]);
		
		double[] arrD = new double[4];
		arrD[0] = 0.5;
		arrD[1] = 0.6;
		arrD[2] = 0.7;
		arrD[3] = 0.8;
		
		System.out.println(arrD[2] + arrD[1] + arrD[0]);
		
		
				
	}// end of main

}// end of class
