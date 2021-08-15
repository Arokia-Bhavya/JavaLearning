package methodOverriding;

public class ScienceBook extends Book {
	int id = 10;
	String name = "Science";

	public ScienceBook(int id, String name) {
		super(id,name);
		this.id = id;
		this.name = name;
	}

	@Override
	void read() {
		System.out.println("I am reading a ScienceBook");
	}
	
	void buy() {
		System.out.println("I am buying a new ScienceBook");
	}

	static void  readTitle()
	{
		
		System.out.println("I am reading title of ScienceBook");
	}
	
}
