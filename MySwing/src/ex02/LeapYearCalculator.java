package ex02;

public class LeapYearCalculator {

	private int year;

	public LeapYearCalculator(int year) {
		this.year = year;
	}
	
	

	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String Calculate() {
		if (year % 400 == 0) {
			return "윤년입니다.";
		}
		if (year % 100 == 0) {
			return "윤년이 아닙니다.";
		}
		if (year % 4 == 0) {
			return "윤년입니다.";
		}
		return "윤년이 아닙니다.";
	}
}
