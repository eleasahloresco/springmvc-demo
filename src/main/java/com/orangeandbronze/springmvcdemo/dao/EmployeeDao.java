package com.orangeandbronze.springmvcdemo.dao;

import java.util.List;

import com.orangeandbronze.springmvcdemo.domain.Employee;

public interface EmployeeDao extends GenericDao<Employee, Long>{

	void add(Employee employee);
	
	void update(Employee employee);
	
	Employee get(Long id);
	
	void delete(Employee employee);
	
	List<Employee> getAll();
	
	List<Employee> getByCriteria(String sqlQuery);
	
	Employee getByEmployeeNo(Long employeeNo);

	Employee getByUsername(String username);

}

