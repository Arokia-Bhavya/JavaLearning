
public class Banking {

	public static void main(String[] args) {
        Banking banking=new Banking();
        banking.login("arokia","password");
        banking.login("9789972035");
	}

	private void login(String mobile_number) {
		System.out.println("login using mobile number");
	}

	private void login(String username, String password) {
		System.out.println("login using username & password");
		
	}

}
