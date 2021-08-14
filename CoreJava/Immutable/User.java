package Immutable;

public final class User {
	 private final String firstName;
	 private final String lastName;
	 private final UnModifiableAddress address;
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address+"]";
	}
	public User(String firstName, String lastName, UnModifiableAddress address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public UnModifiableAddress getAddress() throws CloneNotSupportedException {		
		return address.clone();
	}
}
