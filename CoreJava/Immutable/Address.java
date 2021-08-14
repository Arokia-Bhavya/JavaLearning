package Immutable;

public class Address {
	String firstLine;
    
	@Override
	public String toString() {
		return "Address [firstLine=" + firstLine + ", secondLine=" + secondLine + ", city=" + city + "]";
	}
	public Address(String firstLine, String secondLine, String city) {
		super();
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
	}
	String secondLine;
    public String getSecondLine() {
		return secondLine;
	}
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	String city;
    
    public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
}
