package ch04;

public class UserDTO {
	String userName;
	String birthYear;
	String addr;
	String mobile;
	
	public UserDTO(String userName, String birthYear, String addr, String mobile) {
		super();
		this.userName = userName;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}

	public String getUserName() {
		return userName;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public String getMobile() {
		return mobile;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", birthYear=" + birthYear + ", addr=" + addr + ", mobile=" + mobile
				+ "]";
	}
	
	
	
}
