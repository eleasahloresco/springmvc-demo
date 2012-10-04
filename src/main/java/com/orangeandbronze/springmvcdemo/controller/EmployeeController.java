package com.orangeandbronze.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.orangeandbronze.springmvcdemo.domain.Employee;
import com.orangeandbronze.springmvcdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public String employeeForm() {
		return "employee";
	}

	@RequestMapping(value = "/viewEmployees", method = RequestMethod.GET)
	public String viewAllEmployees(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "viewEmployees";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String addEmployeeForm(Model model) {
		Employee employeeForAdding = new Employee();
		model.addAttribute("employee", employeeForAdding);
		return "addEmployee";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:viewEmployees";
	}
}
