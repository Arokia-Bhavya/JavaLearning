package methodOverriding;

public class BookTest {
	/*
	 * Overriding - instance method in sub class overides  same instance method in subclass
	 * Method Hiding - static method in sub class hides same static method in superclass
	 * Construcor Chaining - the subclass constructor calling super class constructor
	 * 
	 * Note neither readTitle method in Book/ScienceBook changed from static to instance
	 * read method in Book/ScienceBook changed from instance to static
	 * 
	 * Variables can be set using constructor chaining
	 */
	
	public static void main(String[] args) {

		System.out.println("Book");
		Book book = new Book();
		System.out.println(book.id);
		System.out.println(book.name);
		book.read();
		Book.readTitle();
		System.out.println("Science Book");
		Book scienceBook = new ScienceBook(10,"Physics"); // object subsitution
		System.out.println(scienceBook.id);
		System.out.println(scienceBook.name);
		scienceBook.read();
		ScienceBook.readTitle();
		System.out.println("Story Book");
		Book literaturBook = new StoryBook(); // object subsitution
		System.out.println(literaturBook.id);
		System.out.println(literaturBook.name);
		literaturBook.read();
		StoryBook.readTitle();
		
	}
}
