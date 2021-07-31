package methodreferences;

import java.util.ArrayList;
import java.util.List;

interface Predicate 
{
	public boolean isEven(int num);
	public static void print(int num) {
		System.out.println(num);
	}
	
}
class EvenOddCheck 
{

	public boolean isEven(int num)
	{
		return num%2 ==0;
	}
	public static boolean checkEven(int num)
	{
		return num%2 ==0;
	}
}
class EvenOddChecker
{
	public static boolean isEven(int num)
	{
		return num%2 ==0;
	}
}

public class MethodReferenceEx1 {

	public static void main(String[] args) {
		/*using anonymous class*/
		
		Predicate predicate=new Predicate()
		{

			@Override
			public boolean isEven(int num) {
				
				return num%2 ==0;
			}
			
		};
		 
		predicate.isEven(10);
		
		/*using lambda expression*/
		Predicate predicatelambda = (int n) -> {return n%2 ==0;};
		predicatelambda.isEven(9);
		
		/*using method reference*/		
		Predicate methodref= new EvenOddCheck()::isEven;		
		methodref.isEven(16);
		
		/*using static method reference*/	
		Predicate staticmethodref=EvenOddCheck::checkEven;
		staticmethodref.isEven(90);
		
		List<Integer> numlist=new ArrayList<Integer>();
		numlist.add(1);
		numlist.add(10);
		numlist.add(34);
		numlist.add(63);
		//numlist.forEach(n -> System.out.println("The number "+n+" "+EvenOddChecker.isEven(n)));
		
		numlist.forEach(n -> System.out.println(n));
		numlist.forEach(System.out::println);
	}

}
