package ex02;

public class LeapYearCalculator {

	private int year;
	private final String IS_LEAP_YEAR = "윤년입니다."; 
	private final String IS_NOT_LEAP_YEAR = "윤년이 아닙니다."; 

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
			return IS_LEAP_YEAR;
		}
		if (year % 100 == 0) {
			return IS_NOT_LEAP_YEAR;
		}
		if (year % 4 == 0) {
			return IS_LEAP_YEAR;
		}
		return IS_NOT_LEAP_YEAR;
	}
}
