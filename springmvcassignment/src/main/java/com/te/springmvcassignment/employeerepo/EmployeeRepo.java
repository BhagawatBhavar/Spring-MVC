package com.te.springmvcassignment.employeerepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvcassignment.employee.Employee;

@Repository
public class EmployeeRepo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	public void repo(Employee employee) {
		
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		
	}
	public void remove(Employee employee) {
		Employee find=manager.find(Employee.class, employee.getId());
		manager.remove(find);
		transaction.begin();
	    transaction.commit();
	}
	public Employee get(int id) {
		Employee find=manager.find(Employee.class,id);
		System.out.println(find);
		transaction.begin();
		transaction.commit();
		return find;
	    
	}
	
}
