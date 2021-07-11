
public class VolatileTest extends Thread{
 boolean  keepRunning=true;
	public void run()
	{
		long count=0;
		while(keepRunning)
		{
			count++;
			//System.out.println("Thread running."+count);
		}
		 System.out.println("Thread terminated."+count);

	}

	public static void main(String[] args) throws InterruptedException
	{
		VolatileTest test=new VolatileTest();
		test.start();
		Thread.sleep(1000);
		test.keepRunning=false;
	}
}
