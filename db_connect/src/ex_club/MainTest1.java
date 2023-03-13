package ex_club;

import java.util.ArrayList;

public class MainTest1 {

	// main
	public static void main(String[] args) {

		ArrayList<StudentDTO> list = new ClubDAO().showMemberList("시나위");
		for (StudentDTO studentDTO : list) {
			System.out.println(studentDTO);
		}
		System.out.println("=================");
		ArrayList<StudentDTO> list2 = new StudentDAO().showList();
		for (StudentDTO studentDTO : list2) {
			System.out.println(studentDTO);
		}
		int a = new ClubDAO().countMember("자우림");
		System.out.println(a);

	} // end of main

}
