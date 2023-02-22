package ch05;

public class Person {
	
	private String name;
	private String address;
	private String relative;
	
	public Person(String name, String address, String relative) {
		super();
		this.name = name;
		this.address = address;
		this.relative = relative;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRelative() {
		return relative;
	}

	public void setRelative(String relative) {
		this.relative = relative;
	}
	
	public String showInfo() {
		return "이름: "+  name + "  주소: " + address + "  관계: " + relative;
	}

}
