package com.orangeandbronze.springmvcdemo.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.orangeandbronze.springmvcdemo.dao.EmployeeDao;
import com.orangeandbronze.springmvcdemo.domain.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@InjectMocks
	private EmployeeService employeeService = new EmployeeServiceImpl();

	@Mock
	private EmployeeDao employeeDao = Mockito.mock(EmployeeDao.class);

	@Test
	public void shouldReturnAllEmployeesFromDao() {
		// Setup the mocked dependency. Make the employeeDao.getAll() return the
		// list
		List<Employee> listOfEmployeesFromDb = new ArrayList<Employee>();
		listOfEmployeesFromDb.add(new Employee());
		Mockito.when(employeeDao.getAll()).thenReturn(listOfEmployeesFromDb);

		// Invoke the object being unit tested
		List<Employee> employeesFromDao = employeeService.getAllEmployees();

		// Assert the result from the invocation
		Assert.assertTrue("List of employees should not be null", !employeesFromDao.isEmpty());
		Assert.assertTrue("List of employees should have 1 employee", employeesFromDao.size() == 1);
	}
}
