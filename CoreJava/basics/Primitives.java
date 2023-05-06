package basics;

public class Primitives {
	public static void main(String[] args)
	{
		//byte value=200; compiler error
		byte value=127;
		value++;
		System.out.println(value);//Out of range rollover ould happen
	}
}
