public class HelloWorld
{

public static void main(String[] args)
{
	for(int i=0;i<args.length;i++)
	{
		System.out.println(i);
	}
	System.out.println(Gender.MALE);
	System.out.println(Gender.FEMALE);
	System.out.println(Error.PAGE_NOT_FOUND.getError_code());
	System.out.println(Error.PAGE_NOT_FOUND.getDescription());

}
}