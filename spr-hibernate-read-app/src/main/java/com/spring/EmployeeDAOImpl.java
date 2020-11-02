package com.spring;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void insertEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		System.out.println("Done");
		
	}

	/*public void updateEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee updatedEmp = session.get(Employee.class, employee.getId());
		updatedEmp.setName(employee.getName());
		updatedEmp.setSalary(employee.getSalary());
		session.update(updatedEmp);
		transaction.commit();
		session.close();
		System.out.println("Done");
	}*/

	/*@Override
	public void deleteEmployee(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.get(Employee.class,id);
		if(employee != null) {
			session.delete(employee);
			transaction.commit();
			System.out.println("Employee "+employee.getName()+" deleted from db");
		} else {
			System.out.println("No Employee record found");
		}	
		session.close();
		System.out.println("Done");
	}
*/
	@Override
	public List<Employee> getEmployees() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		 List<Employee> list = criteria.list();
		return list;
	}
	
}
