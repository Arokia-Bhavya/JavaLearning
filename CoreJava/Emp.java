import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Emp {
	private String empName;
	

	private Integer empId;
	private Double salary;
	private String orgName;
	
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Emp(String empName, Integer empId, Double salary,String orgName) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.orgName= orgName;
	}
	
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", orgName=" + orgName + "]";
	}
	public static void main(String[] args)
	{
		List<Emp> empList=new ArrayList<Emp>();
		empList.add(new Emp("Raja",1,1000.50,"Google"));
		empList.add(new Emp("Ravi",2,5000.50,"Facebook"));
		empList.add(new Emp("anitha",3,90000.50,"PayPal"));
		empList.add(new Emp("leela",4,80000.50,"Freshworks"));
		
		Predicate<Emp> googleEmpl= (empl) -> empl.getOrgName().equals("Google");
		System.out.println(googleEmpl.test(new Emp("Senthil",5,50000.00,"Google")));
		
		for (Emp emp:empList)
		{
			if(googleEmpl.test(emp))
				System.out.println(emp);
		}
		
		
	}

}
