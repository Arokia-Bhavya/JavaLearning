import java.util.LinkedList;

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
	public static void main(String[] args) {
		LinkedList<Integer> numlist=new LinkedList<Integer>();
		numlist.add(1);
		numlist.add(2);
		numlist.add(3);
		System.out.println(numlist.get(1));

	}

}
