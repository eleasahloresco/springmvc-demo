package com.orangeandbronze.springmvcdemo.dao;

import java.util.List;

import com.orangeandbronze.springmvcdemo.domain.Employee;

public interface EmployeeDao extends GenericDao<Employee, Long> {

	@Override
	void add(Employee employee);

	@Override
	void update(Employee employee);

	@Override
	Employee get(Long id);

	@Override
	void delete(Employee employee);

	@Override
	List<Employee> getAll();

	@Override
	List<Employee> getByCriteria(String sqlQuery);

	Employee getByEmployeeNo(Long employeeNo);

	Employee getByUsername(String username);

}
