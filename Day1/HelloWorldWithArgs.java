
public class HelloWorldWithArgs {

	public static void main(String[] args) {
		System.out.println("HelloWorld!!");
		System.out.println("length of args:"+args.length);
		int sum=0;
		for(String arg:args)
		{
			sum+=Integer.parseInt(arg);					
		}
		System.out.println("sum:"+sum);
	}

}
