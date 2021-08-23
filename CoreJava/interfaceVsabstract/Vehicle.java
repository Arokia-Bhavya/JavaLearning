package interfaceVsabstract;

/*
 * 
Usage
----- 
1.When trying to use the inheritance concept in code (share code among many related classes), by providing common base class methods that the subclasses override
2.If we have specified requirements and only partial implementation details
3.While classes that extend abstract classes have several common fields or methods (that require non-public modifiers)
4.If one wants to have non-final or non-static methods to modify the states of an object
5.Consider using abstract classes and inheritance when our problem makes the evidence “A is a B”.
 */
public abstract class Vehicle {
	protected abstract void start();
    protected abstract void stop();
    protected abstract void drive();
    protected abstract void changeGear();
    protected abstract void reverse();
}

class Car extends Vehicle {

    @Override
    protected void start() {
        System.out.println("starting the car");
    }

    @Override
    protected void stop() {
    	System.out.println("stoping the car");
    }

    @Override
    protected void drive() {
    	System.out.println("driving the car");
    }

    @Override
    protected void changeGear() {
    	System.out.println("changing the gear of car");
    }

    @Override
    protected void reverse() {
    	System.out.println("reversing the car");
    }

	public static void main(String args[])
	{
		Vehicle car=new Car();
		car.start();
		car.stop();
	}
}