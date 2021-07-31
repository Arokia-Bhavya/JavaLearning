package methodreferences;

import java.util.ArrayList;
import java.util.List;
interface BuildStudent
{
	Student getStudentWithName(String name);
}
class Student
{
	String name;
	Student(String name)
	{
		this.name=name;
	}
}
public class MethodReferenceEx2 {
	public static void main(String[] args)
	{
		List<String> studentlist=new ArrayList<String>();
		studentlist.add("Raja");
		studentlist.add("Ravi");
		studentlist.add("ZEBRA");
		studentlist.add("LiOn");
		System.out.println("Before sorting");
		studentlist.forEach(System.out::println);
		/*Method references with arbritary object*/
		studentlist.sort(String::compareTo);
		System.out.println("After sorting");
		studentlist.forEach(System.out::println);
		/*Method references with construtor*/
		BuildStudent buildStudent=Student::new;
		buildStudent.getStudentWithName("Anitha");
		
	}

}
