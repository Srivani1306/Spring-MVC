package com.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HibernateConfig.class);
	
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		
      /* Employee employee = new Employee();
       System.out.println();
		employee.setName("sri");
		employee.setSalary(70000);
		employeeDAO.insertEmployee(employee);
		
		System.out.println("Employee " + employee.getName() + " inserted into db successfully");*/
		
		List<Employee> empList = employeeDAO.getEmployees();
		
		
		for (Employee employee2 : empList) {
			
			System.out.println("Employee Id ="+employee2.getId());
			
			System.out.println("Employee Name ="+employee2.getName());
			System.out.println("Employee Salary ="+employee2.getSalary());
		}
		
	}
}