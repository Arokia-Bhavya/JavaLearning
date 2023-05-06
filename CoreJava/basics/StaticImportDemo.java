package basics;

import static basics.Repetition.twice; // this can be used to call twice
public class StaticImportDemo {
	public static void main(String args[])
	{
		System.out.println(basics.Repetition.twice("pizza"));
	}

}
