package ch03;

public class EmployeeDTO {

	int empNo;
	String birthDate;
	String firstName;
	String lastName;
	String gender;
	String hireDate;

	public EmployeeDTO(int id, String birthDate, String firstName, String lastName, String gender, String hireDate) {
		super();
		this.empNo = id;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + empNo + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}

}
