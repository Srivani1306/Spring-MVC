package com.spring;

import java.util.List;

public interface EmployeeDAO {
	
	public void insertEmployee(Employee employee);
	
    //public void updateEmployee(Employee employee);
	
	//public void deleteEmployee(int id);
	
	public List<Employee> getEmployees();
}
