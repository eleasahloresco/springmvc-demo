package com.orangeandbronze.springmvcdemo.service;

import java.util.List;

import com.orangeandbronze.springmvcdemo.domain.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
