package ex_club;

public class StudentDTO {

	private int studentId;
	private String studentName;
	private String major;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public StudentDTO(int studentId, String studentName, String major) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", major=" + major + "]";
	}

}
