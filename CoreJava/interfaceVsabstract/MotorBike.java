package interfaceVsabstract;

/*
 * 
Java 8:-interface include static & default
Java 9:-interface include private
Usage 
-----
1.If the problem needs to be solved using multiple inheritances and is composed of different class hierarchies
2.When unrelated classes implement our interface. 
3.When application functionalities have to be defined as a contract, but not concerned about who implements the behavior. i.e., third-party vendors need to implement it fully
4.Consider using the interface when our problem makes the statement “A is capable of [doing this]”.
 */
interface Drivable
{
	public abstract void  drive();
	default void display()
	{
		System.out.println("common driving skills");
	}
	static boolean isAgeGreaterThan18(int age)
	{		
		return age>18? true:false;
	}
}
public class MotorBike implements Drivable{
	int age;

	private MotorBike(int age) {
		super();
		this.age = age;
	}

	@Override
	public void drive() {
		if(Drivable.isAgeGreaterThan18(age))
		System.out.println("driving of a car");		
	}
	
	public void display()
	{		
		if(Drivable.isAgeGreaterThan18(age))
			System.out.println("specific driving skills");
	}
	
	public static void main(String[] args) {
		Drivable bike=new MotorBike(20);
		bike.drive();
		bike.display();
		
	}

}
