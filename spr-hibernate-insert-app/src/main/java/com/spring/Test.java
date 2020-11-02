package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HibernateConfig.class);
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

		Employee employee = new Employee();
		
		employee.setName("sri");
		employee.setSalary(70000);
		employeeDAO.insertEmployee(employee);
		System.out.println("Employee " + employee.getName() + " inserted into db successfully");
	}
}