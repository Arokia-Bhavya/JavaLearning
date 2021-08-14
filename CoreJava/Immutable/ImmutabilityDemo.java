package Immutable;

/*
 * https://codepumpkin.com/immutable-class-with-mutable-member-fields-in-java/
 * Approaches to create immutable class with nested object
 * 1)Implementing cloneable
 * 2)Creating a child class and override setter method to throw unsupported operation
 * 3)Try to use Collections.Unmodifiable
 * 
 */
public class ImmutabilityDemo {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		User user=new User("arokia","bhavya",new UnModifiableAddress("first street","second street","gowrivakkam"));
		System.out.println(user);
		user.getAddress().setFirstLine("4th street");
		System.out.println(user);
	}

}
