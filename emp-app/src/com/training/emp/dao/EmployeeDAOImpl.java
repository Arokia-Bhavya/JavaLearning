package com.training.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.training.emp.model.Employee;
import com.training.emp.model.Gender;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static Set<Employee> employeeSet;

	public EmployeeDAOImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_app","root","password");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Set<Employee> findAll() {
		try {
			pstmt = con.prepareStatement("select * from employee");
			rs = pstmt.executeQuery();
			employeeSet = new HashSet<>();
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("Gender").equals("MALE")?Gender.MALE:Gender.FEMALE,
						rs.getString("contact"),rs.getDouble("salary"));
				employeeSet.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeSet;
	}

	@Override
	public Employee findById(int id) {
		Employee employee = null;
		try {
			pstmt = con.prepareStatement("select * from employee where id=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				employee = new Employee(rs.getInt("id"), rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void save(Employee employee) {
		try {
			pstmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getContact());
			pstmt.setString(4, employee.getGender().name());			
			pstmt.setDouble(5, employee.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Employee employee) {
		try {
			pstmt = con.prepareStatement("update employee set name=? where id=?");
			pstmt.setString(1, employee.getName());
			pstmt.setInt(2, employee.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		try {
			pstmt = con.prepareStatement("delete from employee where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateSalary(double hikePercentage) {
		try {
			pstmt = con.prepareStatement("update employee set salary=((salary*(?/100)) + salary)");
			
			pstmt.setDouble(1, hikePercentage);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public double getGenderDiversityRatio() {
		 double diversity = 0;
		try
		{
			pstmt= con.prepareStatement("select round((select count(*) from employee where gender='FEMALE')/(select count(*) from employee) * 100,2) diversity");
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				diversity=rs.getDouble("diversity");
			}
		}catch (SQLException sqlExp)
		{
			sqlExp.printStackTrace();
		}
		return diversity;
	}

}
