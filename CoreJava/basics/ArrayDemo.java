package basics;

import java.util.Arrays;

public class ArrayDemo {
	static final int[] A= {100,200};
	static final int[] B;
	static 
	{
		B =new int[2];
		B[0]=100;
		B[1]=200;
	}
	public static void main(String args[])
	{
		System.out.println(Arrays.toString(A));
		Arrays.stream(B).forEach( x -> System.out.print(x));
	}

}
