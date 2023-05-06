package basics;

public class Global {
	int a=10;

	public static void main(String[] args)
	{
		new Global().method(5);
	}
	 
	void method(int a)
	{
		a+=1;
		System.out.println(++a);
	}
}
