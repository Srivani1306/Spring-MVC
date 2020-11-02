package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HibernateConfig.class);
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

//		Employee employee = new Employee();
//		employee.setName("Rama");
//		employee.setSalary(40000);
//		employeeDAO.insertEmployee(employee);
//		System.out.println("Employee " + employee.getName() + " inserted into db successfully");
		
		//Update Employee 
//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setName("Subba Rao");
//		employee.setSalary(25000);
//		employeeDAO.updateEmployee(employee);
//		System.out.println("Employee " + employee.getName() + " updated successfully");
	
		//Delete Operation
		employeeDAO.deleteEmployee(1);
		
	}

}
