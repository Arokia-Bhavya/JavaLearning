class Greeting implements Runnable{

	
	@Override
	public void run() {
	
	for(int count=0;count<500;count++)
	{
		System.out.println(Thread.currentThread()+""+count);	
	}
	}
	
}
public class RunnableDemo {

	public static void main(String[] args)
	{
		Thread thread1=new Thread(new Greeting());
		Thread thread2=new Thread(new Greeting());
		thread1.setName("ChildThread1");
		thread2.setName("ChildThread2");
		thread1.start();
		thread2.start();
	
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
