package beans;

public class CellPhoneNumber {
	private int countryCode;	
	private long number;
	
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "CellPhoneNumber [countryCode=" + countryCode + ", number="
				+ number + "]";
	}
	
}
