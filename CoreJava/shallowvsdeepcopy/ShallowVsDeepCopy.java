package shallowvsdeepcopy;

class Employee implements Cloneable{
	int id;	 
    String name; 
    Department dept;
 
    public Employee(int id, String name, Department dept) {
        this.id = id; 
        this.name = name; 
        this.dept = dept;
    }
    
    protected Object clone() throws CloneNotSupportedException
    {
    	Employee emp = (Employee) super.clone();
    	//emp.dept=(Department) dept.clone(); [Uncomment for DeepCopy]
    	return emp;
    }
 
}
class Department implements Cloneable{
	String empId;	 
    String grade; 
    String designation;
    public Department(String empId, String grade, String designation) {
		
		this.empId = empId;
		this.grade = grade;
		this.designation = designation;
	}    
    protected Object clone() throws CloneNotSupportedException
    {
    	return super.clone();
    }
}

/* https://www.edureka.co/blog/shallow-and-deep-copy-java/ */
public class ShallowVsDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp=new Employee(10,"ravi",new Department("10","A","Director"));
		Employee emp1=(Employee) emp.clone();
		System.out.println("Employee equality test "+(emp == emp1));
		System.out.println("After setting employee name ");
		emp.name="raja";
		System.out.println(emp.name);
		System.out.println(emp1.name);
		
		System.out.println("Department equality test "+(emp.dept == emp1.dept));		
		System.out.println("After setting department name ");
		emp.dept.grade="B";
		System.out.println(emp.dept.grade);
		System.out.println(emp1.dept.grade);
	}

}
