package com.example.demo;

import java.util.List;

public interface EmployeeDAO {
	//CRUD functions
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int empno);
	public Employee getEmployee(int empno);
	public List<Employee> getEmployees();
	
}
