package strings;

public class StringTest4 {

	// 쓰레드 --> 메인작업자
	public static void main(String[] args) {

		String str1 = "안녕";
		String str2 = "Welcome!";
		// length(): String 문자열 길이재기
		System.out.println("length() - " + "str1: " + str1.length() + ",   str2: " + str2.length());

		// concat(): String 문자열 합치기
		System.out.println("concat() - " + str1.concat(str2));

		// substring(): String 문자열 자르기
		System.out.println("substring(5) - " + str2.substring(5) + "인덱스값 5번부터 출력");
		System.out.println("substring(2, 6) - " + str2.substring(2, 6) + "인덱스값 2번부터 5번(6번앞)까지 출력");

		// indexOf(): 문자가 위치한 인덱스값 반환하기
		System.out.println("indexof('녕') - " + str1.indexOf("녕"));

		// charAt(): 인덱스에 위치한 문자를 반환
		System.out.println("charAt(4) - " + str2.charAt(4));

		// replace(): 문자열 일부를 다른 문자열로 바꾸기
		System.out.println("replace('!', '~~') - " + str2.replace("!", "~~"));

		// toUpperCase(), toLowerCase(): 대문자/소문자로 모두변환
		System.out.println("toUpperCase() - " + str2.toUpperCase());

		// split(): 문자열 배열로 전환
		String[] arrStr2 = str2.split("");
		System.out.println(arrStr2[0] + arrStr2[2] + arrStr2[4] + arrStr2[6]);

	}// end of main

}// end of class
