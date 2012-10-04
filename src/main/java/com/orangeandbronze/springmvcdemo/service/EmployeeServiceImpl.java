package com.orangeandbronze.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orangeandbronze.springmvcdemo.dao.EmployeeDao;
import com.orangeandbronze.springmvcdemo.domain.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.add(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAll();
	}

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
