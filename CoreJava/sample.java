import java.util.LinkedList;

import annotations.TimeLog;

public class sample {
	static int num;
	int num1;

	static
	{
		num=0;
	}
	
	{
		num1=10;
	}
	
	@TimeLog
	void test()
	{
		System.out.println("test");
		
	}
	public static void main(String[] args) {
		new sample().test();
		
		
	}

}
