package ch05;

import java.util.ArrayList;

public class MainTest1 {

	// main
	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();
//		ArrayList<EmployeeDTO> tempList = employeeDAO.showTitleEmpInfo("Staff");
//		for (int i = 0; i < tempList.size(); i++) {
//			String empNo = tempList.get(i).getEmpNo();
//			String firstName = tempList.get(i).getFirstName();
//			String title = tempList.get(i).getTitle();
//			System.out.println("empNo: " + empNo);
//			System.out.println("firstName: " + firstName);
//			System.out.println("title: " + title);
//		}
		int i = employeeDAO.showSalaryCount("Mary", "Sluis");
		System.out.println(i);
	} // end of main

} // end of class