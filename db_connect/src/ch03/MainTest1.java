package ch03;

import java.util.ArrayList;

public class MainTest1 {

	// main
	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();
		ArrayList<EmployeeDTO> list = employeeDAO.select(10005);
		for (EmployeeDTO employeeDTO : list) {
			System.out.println(employeeDTO);
		}
		
	} // end of main

} // end of class
