package com.training.emp.repository;

import java.util.Set;

import com.training.emp.model.Employee;

public interface EmployeeRepository {

	Set<Employee> findAll();

	Employee findById(int id);

	void save(Employee employee);

	void update(Employee employee);

	void delete(int id);

	void updateContact(Employee result);

}
