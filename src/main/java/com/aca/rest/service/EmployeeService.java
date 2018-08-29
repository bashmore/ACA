package com.aca.rest.service;

import java.util.List;

//import javax.ws.rs.WebApplicationException;
//import javax.ws.rs.core.Response;

import com.aca.rest.dao.EmployeeDao;
import com.aca.rest.model.Employee;


public class EmployeeService {

	public static List<Employee> getAllEmployees(){
		return EmployeeDao.getAllEmployees();
	}

	public static List<Employee> getByEmployeeID(int id) {
		
		return EmployeeDao.getByEmployeeID(id);
	}

	public static void addEmployees(Employee newEmployee) {
		int rowCount = EmployeeDao.insertEmployees(newEmployee);
		System.out.println("number of employee inserts: " + rowCount);
	}

	public static Employee deleteEmployee(int id) {
		return EmployeeDao.deleteEmployee(id);
	}

	public static Employee updateEmployees(Employee employee) {
		EmployeeDao.updateEmployees(employee);
		
		return employee;
	}

}