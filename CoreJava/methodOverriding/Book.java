package methodOverriding;

public class Book {
	int id = 0;
	String name = "undefined";
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Book() {
		
	}
	

	void read() {		
		System.out.println("I am reading a book");
	}
	
	static void  readTitle()
	{
		ScienceBook.readTitle();
		System.out.println("I am reading title of Book");
	}
}
