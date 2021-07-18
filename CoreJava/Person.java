import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Person {
	public enum Sex {
        MALE, FEMALE
    }

    String name;
    public Person(String name, LocalDate birthday, Person.Sex gender, String emailAddress, int age) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.age = age;
	}

	LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
    
    
    @Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", emailAddress="
				+ emailAddress + ", age=" + age + "]";
	}

	public static void main(String[] args)
    {
    	List<Person> personList=new ArrayList<Person>();
    	personList.add(new Person("arokia",LocalDate.of(1986,10,20),Person.Sex.FEMALE,"arokia.bhavya@gmail.com",35));
    	personList.add(new Person("maria",LocalDate.of(2000,9,12),Person.Sex.FEMALE,"arokia.bhavya@gmail.com",21));
    	personList.add(new Person("daniel",LocalDate.of(1986,8,10),Person.Sex.MALE,"daniel@gmail.com",25));
    	personList.add(new Person("jerome",LocalDate.of(2001,4,4),Person.Sex.FEMALE,"jerome@gmail.com",22));
    	
    	int age=15;
    	System.out.println("Persons older than "+age);
    	printPersonsOlderThan(personList,age);
    	System.out.println("Persons within range 20 and 25");
    	printPersonsWithinAgeRange(personList,20,25);
    	System.out.println("Persons who are male and within age 20 and 25");
    	printPersonsWithSearch(personList,new CheckPersonEligibleForSelectiveService());
    	System.out.println("Persons with search in anonymous class");
    	printPersonsWithSearch(personList,new CheckPerson()
		{

			@Override
			public boolean test(Person p) {
				
				return p.gender == Person.Sex.MALE &&
			            p.getAge() >= 18 &&
			            p.getAge() <= 25;
			}
	
		});
    	System.out.println("Persons with lambda expression");
    	printPersonsWithSearch(personList,(Person p) -> p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25);
    	
    	System.out.println("Persons with Predicate");
    	
    	printPersonsWithPredicate(personList,(Person p) -> p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25);
    	System.out.println("Persons with Predicate & Consumer");
    	processPersons(personList,(Person p) -> p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25,(Person p)->System.out.println(p));
    	System.out.println("Persons with Predicate,Function,Consumer");
    	processPersonsWithFunction(personList,(Person p) -> p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25,p -> p.getEmailAddress(), email -> System.out.println(email.toUpperCase()));
    }
	
	private static void processPersonsWithFunction(List<Person> personList,Predicate<Person> tester,Function<Person,String> mapper,Consumer<String> block)
	{
		for(Person person:personList)
		{
			if(tester.test(person))
			{
				String data=mapper.apply(person);
				block.accept(data);
			}
		}
	}
	private static void processPersons(List<Person> personList,Predicate<Person> tester,Consumer<Person> block)
	{
		for(Person person:personList)
		{
			if(tester.test(person))
				block.accept(person);
		}
		
	}
	
	private static void printPersonsWithPredicate(List<Person> personList,Predicate<Person> tester)
	{
		for(Person person:personList)
		{
			if(tester.test(person))
				System.out.println(person);
		}
		
	}

	private static void printPersonsWithSearch(List<Person> personList,CheckPerson tester)
	{
		for(Person person:personList)
		{
			if(tester.test(person))
				System.out.println(person);
		}
		
	}
	
	private static void printPersonsWithinAgeRange(List<Person> personList, int low, int high) {
		Predicate<Person> ageCondition=(person) -> person.getAge() > low && person.getAge() < high;
		for(Person person:personList)
		{
			if(ageCondition.test(person))
				System.out.println(person);
		}
	}

	private static void printPersonsOlderThan(List<Person> personList,int age) {
		Predicate<Person> ageCondition=(person) -> person.getAge() > age;
		for(Person person:personList)
		{
			if(ageCondition.test(person))
				System.out.println(person);
		}
	}
}
