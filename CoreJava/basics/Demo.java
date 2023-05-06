package basics;
interface Foo
{
	int bar();
}

public class Demo {

	 class A implements Foo{
		 public int bar() { return 1; }
	 }
	 public int fubar(Foo foo )
	 {
		 return foo.bar();
	 }
	 
	 public void testFoo()
	 {
		 class A implements Foo{
			 public int bar() { return 2; }
		 }
		 System.out.println(fubar(new A()));
	 }
	 public static void main(String[] args)
	 {
		 new Demo().testFoo();// returns the local scope class implementation
	 }
}
