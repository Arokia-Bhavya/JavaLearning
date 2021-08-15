package methodOverloading;

public class Banking {
	/*
	 * Method Overloading
	 * N number of params
	 * O Object of params
	 * T Type of params
	 * 
	 */
	/* Changing the return data type alone will throw ambigous method error
	 * int login(int id, String password)
	{
		System.out.println("Logging in using id and password");
	}*/
	void login(int id, String password) {
		System.out.println("Logging in using id and password");
	}

	void login(long mobileNumber) {
		System.out.println("Logging in using mobile number");
	}

	void login() {

	}
	
	public static void main(String[] args)
	{
		Banking banking=new Banking();
		banking.login(10,"test");
		banking.login(944800235);
		banking.login();
	}
}
