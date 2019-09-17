package com.spring.test.springJDBC.employee.DAO;

import java.util.List;

import com.spring.test.springJDBC.employee.pojo.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
	
	int updateEmployee(Employee employee);	
	Employee read(int id);
	List<Employee> getAllEmployee();
}
