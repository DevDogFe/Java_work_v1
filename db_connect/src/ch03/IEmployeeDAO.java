package ch03;

import java.util.ArrayList;

public interface IEmployeeDAO {
	
	void insert(EmployeeDTO dto);
	ArrayList<EmployeeDTO> select(int empNo);
	void select(String lastName);
	void update(String gender);
	void delete(int empNo);
	void delete(String lastName);
	
}
