import java.io.Serializable;

public final class  Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String empName;
	private final Integer empId;
	private final Department dept;
	
	public Employee(String empName, Integer empId, Department dept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.dept = dept;
	}
	public String getEmpName() {
		return empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public Department getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", dept=" + dept + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee emp=new Employee("Bhavya",7774,new Department(10,"Albridge"));
		System.out.println(emp.hashCode());
		System.out.println(emp.clone().hashCode());
		
		
	}
}
