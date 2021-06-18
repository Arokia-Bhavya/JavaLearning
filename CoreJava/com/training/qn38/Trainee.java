package com.training.qn38;

public class Trainee {
	private static final String BATCH_CODE = "CHNFSD";
	private String empName;
	public Trainee(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	private String empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public static String getBatchCode() {
		return BATCH_CODE;
	}
	void display()
	{
		System.out.println(this.getEmpName()+" "+getBatchCode()+" "+this.getEmpId());
	}
}
