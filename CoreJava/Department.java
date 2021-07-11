
public final class Department implements Cloneable{

	Integer deptId;
	String deptName;
	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	/*public Department clone()
	{
		try {
			return (Department) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}*/
	
	
}
