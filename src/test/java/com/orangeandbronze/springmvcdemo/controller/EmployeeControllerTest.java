package com.orangeandbronze.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import com.orangeandbronze.springmvcdemo.domain.Employee;
import com.orangeandbronze.springmvcdemo.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

	@InjectMocks
	private EmployeeController employeeController = new EmployeeController();

	@Mock
	private EmployeeService employeeService = Mockito.mock(EmployeeService.class);

	@Test
	public void shouldReturnDefaultEmployeePage() {
		String view = employeeController.employeeForm();
		Assert.assertEquals("employee", view);
	}

	@Test
	public void shouldReturnAllEmployees() {
		// The model for the controller
		ExtendedModelMap model = new ExtendedModelMap();

		// Make employeeService return a mocked List of employees when
		// employeeService.getEmployeeList() is called
		Mockito.when(employeeService.getAllEmployees()).thenReturn(getMockEmployeeList());

		employeeController.viewAllEmployees(model);

		List<Employee> employeeListFromModel = (List<Employee>) model.get("employees");

		Assert.assertTrue("List should not be empty", !employeeListFromModel.isEmpty());
		Assert.assertTrue("List should contain 4 employees", employeeListFromModel.size() == 4);

	}

	@Test
	public void shouldReturnAddEmployeePage() {
		Model model = new ExtendedModelMap();
		String view = employeeController.addEmployeeForm(model);
		Assert.assertEquals("addEmployee", view);
	}

	@Test
	public void shouldAddEmployee() {
		String view = employeeController.addEmployee(Matchers.any(Employee.class));
		Assert.assertEquals("redirect:viewEmployees", view);
	}

	private List<Employee> getMockEmployeeList() {
		List<Employee> mockEmployees = new ArrayList<Employee>();

		Employee employee1 = new Employee();
		employee1.setFullName("Crisar");
		Employee employee2 = new Employee();
		employee2.setFullName("Jomarp");
		Employee employee3 = new Employee();
		employee3.setFullName("D");
		Employee employee4 = new Employee();
		employee4.setFullName("Bing");

		mockEmployees.add(employee1);
		mockEmployees.add(employee2);
		mockEmployees.add(employee3);
		mockEmployees.add(employee4);
		return mockEmployees;
	}

}
