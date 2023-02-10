package strings;

public class StringTest3 {

	// 쓰레드 --> 메인작업자
	public static void main(String[] args) {

		// StringBuilder, StringBuffer
		// 문자열을 여러번 연결하거나 변경할 때 유용하다.
		// StringBuffer는 멀티쓰레드 프로그래밍에서 동기화를 보장한다.
		// 단일쓰레드 프로그램에서는 StringBuilder를 권장한다.

		String java = new String("java");
		String android = new String("android");
		System.out.println(java + android);
		
		StringBuilder builder = new StringBuilder(java);
		//주소값 확인하기
		System.out.println(System.identityHashCode(builder));
		System.out.println("===========================");
		System.out.println(builder);
		
		//builder의 문자열 더하는 기능은 append이다.
		builder.append(android);
		System.out.println(builder);
		System.out.println("===============================");
		System.out.println(System.identityHashCode(builder));
		// 문자열을 더해도 주소값이 안바뀜. 메모리 절약면에서 굿
		
		// 응용
		// 1. StringBuilder --> String -->.toString();
		String result = builder.toString();
		// 2.
		String result2 = builder + ": 반가워";
		

	}// end of main

}// end of class
